package SIS.com;

import SIS.Main;
import SIS.com.objects.College;
import SIS.com.objects.Program;
import SIS.com.objects.Student;

import java.sql.*;

public class Write {

    public static void writeCollege() {
        String query = "INSERT INTO colleges (college_code, college_name) VALUES (?, ?) " +
                       "ON DUPLICATE KEY UPDATE college_name = VALUES(college_name)";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            for (College college : Main.collegeData) {
                if (Main.END.equals(college.getCollegeCode())) {
                    break;
                }

                preparedStatement.setString(1, college.getCollegeCode());
                preparedStatement.setString(2, college.getCollegeName());
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void writeProgram() {
        String query = "INSERT INTO programs (program_code, program_name, college_code) VALUES (?, ?, ?) " +
                       "ON DUPLICATE KEY UPDATE program_name = VALUES(program_name), college_code = VALUES(college_code)";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            for (Program program : Main.programData) {
                if (Main.END.equals(program.getProgramCode())) {
                    break;
                }

                preparedStatement.setString(1, program.getProgramCode());
                preparedStatement.setString(2, program.getProgramName());
                preparedStatement.setString(3, program.getCollegeCode());
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void writeStudent() {
        String query = "INSERT INTO students (id_number, first_name, last_name, year_level, gender, program_code) " +
                       "VALUES (?, ?, ?, ?, ?, ?) " +
                       "ON DUPLICATE KEY UPDATE first_name = VALUES(first_name), last_name = VALUES(last_name), " +
                       "year_level = VALUES(year_level), gender = VALUES(gender), program_code = VALUES(program_code)";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            for (Student student : Main.studentData) {
                if (Main.END.equals(student.getIdNum())) {
                    break;
                }

                preparedStatement.setString(1, student.getIdNum());
                preparedStatement.setString(2, student.getFirstName());
                preparedStatement.setString(3, student.getLastName());
                preparedStatement.setString(4, student.getYearLevel());
                preparedStatement.setString(5, student.getGender());
                preparedStatement.setString(6, student.getProgramCode());
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void writeStudent(String idNumber, String firstName, String lastName, String yearLevel, String gender, String programCode) {
        // Set program_code to "none" if it is invalid
        if (!isProgramCodeValid(programCode)) {
            System.err.println("Warning: Program code " + programCode + " does not exist. Setting program_code to 'none'.");
            programCode = "none";
        }

        String query = "INSERT INTO students (id_number, first_name, last_name, year_level, gender, program_code) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, idNumber);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, yearLevel);
            preparedStatement.setString(5, gender);
            preparedStatement.setString(6, programCode);

            preparedStatement.executeUpdate();
            System.out.println("Student added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean isProgramCodeValid(String programCode) {
        String query = "SELECT COUNT(*) FROM programs WHERE program_code = ?";
        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, programCode);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void deleteStudent(String idNumber) throws SQLException {
        String query = "DELETE FROM students WHERE id_number = ?";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, idNumber);
            preparedStatement.executeUpdate();
        }
    }

    public static void deleteCollege(String collegeCode) throws SQLException {
        String query = "DELETE FROM colleges WHERE college_code = ?";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, collegeCode);
            preparedStatement.executeUpdate();
        }
    }

    public static void deleteProgram(String programCode) throws SQLException {
        String query = "DELETE FROM programs WHERE program_code = ?";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, programCode);
            preparedStatement.executeUpdate();
        }
    }

    public static void updateCollege(String oldCollegeCode, String newCollegeCode, String newCollegeName) throws SQLException {
        String query = "UPDATE colleges SET college_code = ?, college_name = ? WHERE college_code = ?";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, newCollegeCode);
            preparedStatement.setString(2, newCollegeName);
            preparedStatement.setString(3, oldCollegeCode);
            preparedStatement.executeUpdate();
        }
    }

    public static void updateProgram(String oldProgramCode, String newProgramCode, String newProgramName, String collegeCode) throws SQLException {
        String query = "UPDATE programs SET program_code = ?, program_name = ?, college_code = ? WHERE program_code = ?";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, newProgramCode);
            preparedStatement.setString(2, newProgramName);
            preparedStatement.setString(3, collegeCode);
            preparedStatement.setString(4, oldProgramCode);
            preparedStatement.executeUpdate();
        }
    }

    public static void updateStudent(String oldIdNumber, String newIdNumber, String firstName, String lastName, String yearLevel, String gender, String programCode) throws SQLException {
        // Set program_code to "none" if it is invalid
        if (!isProgramCodeValid(programCode)) {
            System.err.println("Warning: Program code " + programCode + " does not exist. Setting program_code to 'none'.");
            programCode = "none";
        }

        String query = "UPDATE students SET id_number = ?, first_name = ?, last_name = ?, year_level = ?, gender = ?, program_code = ? WHERE id_number = ?";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, newIdNumber);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, yearLevel);
            preparedStatement.setString(5, gender);
            preparedStatement.setString(6, programCode);
            preparedStatement.setString(7, oldIdNumber);

            preparedStatement.executeUpdate();
            System.out.println("Student updated successfully.");
        }
    }

}