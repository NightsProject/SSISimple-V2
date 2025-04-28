package SIS.com;

import SIS.Main;
import SIS.com.objects.College;
import SIS.com.objects.Program;
import SIS.com.objects.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import SIS.com.frames.Components;
import static org.junit.Assert.*;

public class ComponentsTest {


    @Before
    public void setUp() {
        // Initialize mock data
        Main.studentData = new ArrayList<>();
        Main.collegeData = new ArrayList<>();
        Main.programData = new ArrayList<>();

        Main.studentData.add(new Student("2023-0001", "John", "Doe", "1", "Male", "CS"));
        Main.collegeData.add(new College("CS", "College of Science"));
        Main.programData.add(new Program("CS101", "Computer Science", "CS"));

        // Mock GUI components
        Components.studentTable = new JTable(new DefaultTableModel(new Object[][] {
            {"2023-0001", "John", "Doe", "1", "Male", "CS"}
        }, new String[] {"ID Number", "First Name", "Last Name", "Year Level", "Gender", "Program Code"}));

        Components.programTable = new JTable(new DefaultTableModel(new Object[][] {
            {"CS101", "Computer Science", "CS"}
        }, new String[] {"Program Code", "Program Name", "College Code"}));

        Components.collegeTable = new JTable(new DefaultTableModel(new Object[][] {
            {"CS", "College of Science"}
        }, new String[] {"College Code", "College Name"}));

        Components.idNumberField = new JTextField();
        Components.firstNameLabel = new JTextField();
        Components.lastNameLabel = new JTextField();
        Components.programCodeP = new JTextField();
        Components.collegeCodeC = new JTextField();
        Components.programCodeN = new JTextField();
        Components.collegeCodeN = new JTextField();
        Components.idColor = new JLabel();
        Components.programColor = new JLabel();
        Components.collegeColor = new JLabel();
        Components.comboBoxYearL = new JComboBox<>(new String[] {"1", "2", "3", "4"});
        Components.comboBoxSP = new JComboBox<>(new String[] {"CS", "ENG"});
        Components.maleG = new JRadioButton();
        Components.femaleG = new JRadioButton();
    }

    @After
    public void tearDown() {
        // Clear mock data
        Main.studentData.clear();
        Main.collegeData.clear();
        Main.programData.clear();
    }

    @Test
    public void testAddStudent() {
        // Simulate adding a student
        Main.studentData.add(new Student("2023-0002", "Jane", "Smith", "2", "Female", "CS"));
        assertEquals(2, Main.studentData.size());
        assertEquals("Jane", Main.studentData.get(1).getFirstName());
    }

    @Test
    public void testDeleteStudent() {
        // Simulate deleting a student
        Components.idNumberField.setText("2023-0001");
        Components.deleteStudentClicked();
        assertEquals(0, Main.studentData.size());
    }

    @Test
    public void testEditStudent() {
        // Simulate editing a student
        Student student = Main.studentData.get(0);
        student.setFirstName("Johnny");
        student.setLastName("Doe");
        assertEquals("Johnny", Main.studentData.get(0).getFirstName());
    }

    @Test
    public void testSaveStudent() {
        // Simulate saving a student
        Components.idNumberField.setText("2023-0002");
        Components.firstNameLabel.setText("Jane");
        Components.lastNameLabel.setText("Smith");
        Components.comboBoxYearL.setSelectedItem("2");
        Components.maleG.setSelected(true);
        Components.comboBoxSP.setSelectedItem("CS");
        Components.saveStudentEdit();

        assertEquals("Jane", Main.studentData.get(1).getFirstName());
    }

    @Test
    public void testCancelStudent() {
        // Simulate canceling student edit
        Components.cancelStudentClicked();
        assertFalse(Main.studentData.isEmpty());
    }

    @Test
    public void testSaveCollege() {
        // Simulate saving a college
        Components.collegeCodeC.setText("ENG");
        Components.collegeCodeN.setText("College of Engineering");
        Components.saveCollegeEdit();
        assertEquals("College of Engineering", Main.collegeData.get(0).getCollegeName());
    }

    @Test
    public void testCancelCollege() {
        // Simulate canceling college edit
        Components.cancelCollegeClicked();
        assertFalse(Main.collegeData.isEmpty());
    }

    @Test
    public void testSaveProgram() {
        // Simulate saving a program
        Components.programCodeP.setText("CS102");
        Components.programCodeN.setText("Advanced Computer Science");
        Components.comboBoxCCP.setSelectedItem("CS");
        Components.saveProgramEdit();
        assertEquals("Advanced Computer Science", Main.programData.get(0).getProgramName());
    }

    @Test
    public void testCancelProgram() {
        // Simulate canceling program edit
        Components.cancelProgramClicked();
        assertFalse(Main.programData.isEmpty());
    }
}