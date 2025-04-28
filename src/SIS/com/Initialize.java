package SIS.com;

import SIS.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Initialize {

    public static void readyFiles() {
        readyCollegeTable();
        readyProgramTable();
        readyStudentTable();
        readyYearLevelTable();
        readyYearsTable();
    }

    public static void readyCollegeTable() {
        String query = """
                CREATE TABLE IF NOT EXISTS colleges (
                    college_code VARCHAR(20) PRIMARY KEY,
                    college_name VARCHAR(100) NOT NULL
                )
                """;

        executeQuery(query);
    }

    public static void readyProgramTable() {
        String query = """
                CREATE TABLE IF NOT EXISTS programs (
                    program_code VARCHAR(20) PRIMARY KEY,
                    program_name VARCHAR(100) NOT NULL,
                    college_code VARCHAR(20),
                    FOREIGN KEY (college_code) REFERENCES colleges(college_code)
                    ON UPDATE CASCADE
                    ON DELETE SET NULL
                )
                """;

        executeQuery(query);
    }

    public static void readyStudentTable() {
        String query = """
                CREATE TABLE IF NOT EXISTS students (
                    id_number VARCHAR(15) PRIMARY KEY,
                    first_name VARCHAR(50) NOT NULL,
                    last_name VARCHAR(50) NOT NULL,
                    year_level VARCHAR(20),
                    gender ENUM('Male', 'Female') NOT NULL,
                    program_code VARCHAR(20),
                    FOREIGN KEY (program_code) REFERENCES programs(program_code)
                    ON UPDATE CASCADE
                    ON DELETE SET NULL
                )
                """;

        executeQuery(query);
    }

    public static void readyYearLevelTable() {
        String query = """
                CREATE TABLE IF NOT EXISTS year_levels (
                    year_level VARCHAR(20) PRIMARY KEY
                )
                """;

        executeQuery(query);

        // Insert default year levels if the table is empty
        String insertQuery = """
                INSERT IGNORE INTO year_levels (year_level) VALUES
                ('First Year'), ('Second Year'), ('Third Year'),
                ('Fourth Year'), ('Fifth Year'), ('Sixth Year')
                """;

        executeQuery(insertQuery);
    }

    public static void readyYearsTable() {
        String query = """
                CREATE TABLE IF NOT EXISTS years (
                    year VARCHAR(20) PRIMARY KEY
                )
                """;

        executeQuery(query);

        // Insert default years if the table is empty
        String insertQuery = """
                INSERT IGNORE INTO years (year) VALUES
                ('2024'), ('2025')
                """;

        executeQuery(insertQuery);
    }

    private static void executeQuery(String query) {
        try (Connection connection = DriverManager.getConnection(Main.DB_URL, Main.DB_USER, Main.DB_PASSWORD);
             Statement statement = connection.createStatement()) {

            statement.execute(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
