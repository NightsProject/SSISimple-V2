package SIS;
import SIS.com.objects.College;
import SIS.com.objects.Program;
import SIS.com.objects.Student;
import SIS.com.Read;
import SIS.com.Initialize;

import SIS.com.frames.MainWindow;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.ArrayList;

public class Main {
    
    public static String END_LINE = "END/This is the end of the file/END";
    public static String END = "END";
    
    // Database credentials
    public static final String DB_URL = "jdbc:mysql://localhost:3306/ssisdb"; // Replace with your database URL
    public static final String DB_USER = "nights"; // Replace with your database username
    public static final String DB_PASSWORD = "10222002"; // Replace with your database password
    
    // Maximum 
    public static int MAX_COLLEGE = 9999;
    public static int MAX_PROGRAM = 9999;
    public static int MAX_STUDENT = 9999;
    public static int MAX_YEARLEVEL_LIST = 50;
    
    // Format
    public static int COLLEGEDATA_FORMAT = 2; // Code/Name
    public static int PROGRAMDATA_FORMAT = 3; // Code/Name/CollegeCode
    public static int STUDENTDATA_FORMAT = 6; // IdNum/Firstname/Lastname/YearLevel/Gender/ProgramCode
    
  
    // ArrayList
    public static ArrayList<College> collegeData = new ArrayList<>();
    public static ArrayList<Program> programData = new ArrayList<>();
    public static ArrayList<Student> studentData = new ArrayList<>();
    
    // Arrays
    public static String YearLevel[] = new String[50];
    public static String Years[] = new String[50];
    
    // Frames
    public static MainWindow menu;
   
    public static void main(String[] args) {
        
        // Setting Look and Feel 
        FlatDarkLaf.setup();
        //-----------------------
        
        Initialize.readyFiles();
        Read.readDataFromDatabase();
       
        Years[0] = "2024";
        Years[1] = "2025";
        
        
        showMenuForm();
        
        
        for (int i = 0; i < collegeData.size(); i++) {
            System.out.print(collegeData.get(i).getCollegeCode() + " " + collegeData.get(i).getCollegeName() + "\n");
        }
        
       
    }
    
    public static void showMenuForm() {  
        menu = new MainWindow();
        menu.setVisible(true);
    }
    
 
}
