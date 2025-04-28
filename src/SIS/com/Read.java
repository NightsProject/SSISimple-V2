package SIS.com;

import SIS.Main;
import SIS.com.objects.College;
import SIS.com.objects.Program;
import SIS.com.objects.Student;

import java.sql.*;

public class Read {

    public static void readDataFromDatabase() {
        readCollegeData();
        readProgramData();
        readStudentData();
        readYearLevel();
        readYear();
    }

    public static void readCollegeData() {
        String query = "SELECT college_code, college_name FROM colleges";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String collegeCode = resultSet.getString("college_code");
                String collegeName = resultSet.getString("college_name");
                Main.collegeData.add(new College(collegeCode, collegeName));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readProgramData() {
        String query = "SELECT program_code, program_name, college_code FROM programs";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String programCode = resultSet.getString("program_code");
                String programName = resultSet.getString("program_name");
                String collegeCode = resultSet.getString("college_code");
                Main.programData.add(new Program(programCode, programName, collegeCode));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readStudentData() {
        String query = "SELECT id_number, first_name, last_name, year_level, gender, program_code FROM students";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String idNumber = resultSet.getString("id_number");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String yearLevel = resultSet.getString("year_level");
                String gender = resultSet.getString("gender");
                String programCode = resultSet.getString("program_code");
                Main.studentData.add(new Student(idNumber, firstName, lastName, yearLevel, gender, programCode));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readYearLevel() {
        String query = "SELECT year_level FROM year_levels";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            int count = 0;
            while (resultSet.next()) {
                Main.YearLevel[count] = resultSet.getString("year_level");
                count++;
            }
            Main.YearLevel[count] = Main.END;

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readYear() {
        String query = "SELECT year FROM years";

        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            int count = 0;
            while (resultSet.next()) {
                Main.Years[count] = resultSet.getString("year");
                count++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
