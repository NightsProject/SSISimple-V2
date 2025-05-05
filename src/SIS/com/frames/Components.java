package SIS.com.frames;

import SIS.Main;
import SIS.com.Write;
import SIS.com.objects.College;
import SIS.com.objects.Program;
import SIS.com.objects.Student;
import java.awt.Color;
import java.sql.SQLException;
import java.util.function.Predicate;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Components extends MainWindow{
    private static boolean shouldRefresh = true; // Default to true

public static void showStudentDialog(){

    AddStudentDialog.setLocationByPlatform(true);
    
    //add the items for Year Level
    comboBoxYL.removeAllItems();
    comboBoxYL.addItem("");
    for(int i = 0; i < Main.YearLevel.length; i++){
        if(Main.YearLevel[i] == null){
            break;
        }
        if(Main.YearLevel[i].equals("END")){
            break;
        }
        comboBoxYL.addItem(Main.YearLevel[i]);
    }
    //-----------------
    
    //add the items for College Code
    loadCollegeCom();
    
    //add the items for Academic Year
    comboBoxY.removeAllItems();
    for(int i = 0; i < Main.Years.length; i++){
     
        if(Main.Years[i] == null){
            break;
        }
        
        comboBoxY.addItem(Main.Years[i]);
    }
    //----------------------
    
    //generate number
    String num = genNum();
    idFieldNS.setText(num);
    
    AddStudentDialog.setVisible(true);
}



public static void loadCollegeToProgramDialog(){
    //load all available college code in the comboBox
    comboBoxCC.removeAllItems();
    
    for(int i = 0; i < Main.collegeData.size(); i++){
        if(Main.END.equals(Main.collegeData.get(i).getCollegeCode())){
            break;
        }
         comboBoxCC.addItem(Main.collegeData.get(i).getCollegeCode());
    }
    AddProgramDialog.setVisible(true);
}

public static void loadProgramCom() {
    comboBoxP.removeAllItems();
    comboBoxP.addItem("");
    for (Program program : Main.programData) {
        if (!Main.END.equals(program.getProgramCode())) {
            comboBoxP.addItem(program.getProgramCode());
        }
    }
    comboBoxP.addItem("Add New");
}

public static void loadCollegeCom() {
    comboBoxCCStudent.removeAllItems();
    comboBoxCCStudent.addItem("");
    for (College college : Main.collegeData) {
        if (!Main.END.equals(college.getCollegeCode())) {
            comboBoxCCStudent.addItem(college.getCollegeCode());
        }
    }
    comboBoxCCStudent.addItem("Add New");
}

//-------------------------------------------------------------------------------------------
public static void clearStudentFields(){
   

   idNumberField.setText("");
   firstNameLabel.setText("");
   lastNameLabel.setText("");
   yearLevelField.setText("");
   genderField.setText("");
   programCodeField.setText("");
}
//-------------------------------------------------------------------------------------------

public static void clearProgramFields(){
   
   programCodeP.setText("");
   programCodeN.setText("");
   collegeCodeP.setText("");
}
//-------------------------------------------------------------------------------------------
public static void clearCollegeFields(){
   
   collegeCodeC.setText("");
   collegeCodeN.setText("");
}


//-------------------------------------------------------------------------------------------
public static void searchStudent(){
   
   
       
       String filter = (String) comboBoxSearch.getSelectedItem();
       String search = searchField.getText();
       
       
       if(filter.equals("ID Number")){
           FilteredStudentData(s -> s.getIdNum().toLowerCase().contains(search.toLowerCase()));
       }

       if(filter.equals("Firstname")){
           FilteredStudentData(s -> s.getFirstName().toLowerCase().contains(search.toLowerCase()));
       }
       
       if(filter.equals("Lastname")){
           FilteredStudentData(s -> s.getLastName().toLowerCase().contains(search.toLowerCase()));
       }
       
       if(filter.equals("Year Level")){
           FilteredStudentData(s -> s.getYearLevel().toLowerCase().contains(search.toLowerCase()));
       }
       
       if(filter.equals("Gender")){
           FilteredStudentData(s -> s.getGender().toLowerCase().contains(search.toLowerCase()));
       }
       
       if(filter.equals("Program Code")){
           FilteredStudentData(s -> s.getProgramCode().toLowerCase().contains(search.toLowerCase()));
       }
      
       
   
  
   

}
//-------------------------------------------------------------------------------------------

public static void searchProgram(){
   
    
   if(searchProgram.getText().length() > 0){
       
       
       String filter = (String) comboBoxSearchProgram.getSelectedItem();
       String search = searchProgram.getText();
       
       if(filter.equals("Program Code")){
           filteredProgramData(s -> s.getProgramCode().toLowerCase().contains(search.toLowerCase()));
       }
       
       if(filter.equals("Program Name")){
           filteredProgramData(s -> s.getProgramName().toLowerCase().contains(search.toLowerCase()));
       }

       if(filter.equals("College Code")){
           filteredProgramData(s -> s.getCollegeCode().toLowerCase().contains(search.toLowerCase()));
       }


       
       
   } else {
       loadProgramData();
   }
              
   
   
   
}
//-------------------------------------------------------------------------------------------

public static void searchCollege(){
   
    if(searchFieldCollege.getText().length() > 0){
       
       
       String filter = (String) comboBoxSearchCollege.getSelectedItem();
       String search = searchFieldCollege.getText();
       
       if(filter.equals("College Code")){
           filteredCollegeData(s -> s.getCollegeCode().toLowerCase().contains(search.toLowerCase()));
       }
       
       if(filter.equals("College Name")){
           filteredCollegeData(s -> s.getCollegeName().toLowerCase().contains(search.toLowerCase()));
       }
    
   } else {
       loadCollegeData();
   }
  
   
}


//This method is for loading Student Data's to the JTable
//-------------------------------------------------------------------------------------------
public static void loadDataToStudentTable(Object[][] data){

    studentTable.getTableHeader().setResizingAllowed(false);
    studentTable.getTableHeader().setReorderingAllowed(false);
    studentTable.setCellSelectionEnabled(false);
    studentTable.setRowSelectionAllowed(true);
    studentTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
 
    // [FORMAT]: IdNum/Firstname/Lastname/YearLevel/Gender/CollegeCode/ProgramCode
    String studentFormat[] = { "ID Number", "First Name", "Last Name", "Year Level", "Gender", "Program Code"};

    
    
    DefaultTableModel model = new DefaultTableModel(data, studentFormat);
    studentTable.setModel(model);
    
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(JLabel.CENTER);
    studentTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    studentTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
    studentTable.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
    studentTable.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
    //Color
  
    studentTable.getTableHeader().setBackground(Color.DARK_GRAY);

    studentTable.getTableHeader().setForeground(Color.BLACK);
    //make the cell not selectable
    studentTable.setDefaultEditor(Object.class, null);
    
    getStudentTableRowData();
}    
//-------------------------------------------------------------------------------------------

public static void loadStudentData(){
    
    int count = 0;
    while(count < Main.studentData.size()){
        if(Main.END.equals(Main.studentData.get(count).getIdNum())){
            break;
        }
        count++;
    }
    
    Object[][] studentData = new Object[count][Main.STUDENTDATA_FORMAT];

    for(int i = 0; i <  Main.studentData.size(); i++){
        
      
        if(Main.END.equals(Main.studentData.get(i).getIdNum())){
            break;
        }
        
        studentData[i][0] = Main.studentData.get(i).getIdNum();
        studentData[i][1] = Main.studentData.get(i).getFirstName();
        studentData[i][2] = Main.studentData.get(i).getLastName();
        studentData[i][3] = Main.studentData.get(i).getYearLevel();
        studentData[i][4] = Main.studentData.get(i).getGender();
        studentData[i][5] = Main.studentData.get(i).getProgramCode();
        
    
    }
    
    loadDataToStudentTable(studentData);
}
//-------------------------------------------------------------------------------------------  

public static void FilteredStudentData(Predicate<Student> filter) {
    int count = 0;
    while (count < Main.studentData.size()) {
        if (Main.END.equals(Main.studentData.get(count).getIdNum())) {
            break;
        }
        count++;
    }

    Object[][] studentData = new Object[count][Main.STUDENTDATA_FORMAT];
    int dataIndex = 0; // Index for studentData array

    for (int i = 0; i < Main.studentData.size(); i++) {
        if (Main.END.equals(Main.studentData.get(i).getIdNum())) {
            break;
        }

        // Apply the filter (if provided)
        if (filter == null || filter.test(Main.studentData.get(i))) {
            studentData[dataIndex][0] = Main.studentData.get(i).getIdNum();
            studentData[dataIndex][1] = Main.studentData.get(i).getFirstName();
            studentData[dataIndex][2] = Main.studentData.get(i).getLastName();
            studentData[dataIndex][3] = Main.studentData.get(i).getYearLevel();
            studentData[dataIndex][4] = Main.studentData.get(i).getGender();
            studentData[dataIndex][5] = Main.studentData.get(i).getProgramCode();
            dataIndex++;
        }
    }

    // Resize the array to remove empty rows (if any)
    Object[][] finalStudentData = new Object[dataIndex][Main.STUDENTDATA_FORMAT];
    System.arraycopy(studentData, 0, finalStudentData, 0, dataIndex);

    loadDataToStudentTable(finalStudentData);
}


//-------------------------------------------------------------------------------------------    


//-------------------------------------------------------------------------------------------
public static void loadToCollegeTable(Object[][] college){
    
    collegeTable.getTableHeader().setResizingAllowed(false);
    collegeTable.getTableHeader().setReorderingAllowed(false);

    collegeTable.setCellSelectionEnabled(false);
    collegeTable.setRowSelectionAllowed(true);
    collegeTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    
    
   // [FORMAT]: Code/Name
    String collegeFormat[] = {"College Code", "College Name"};
    
    
    DefaultTableModel model = new DefaultTableModel(college, collegeFormat);
    collegeTable.setModel(model);
   
       
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(JLabel.CENTER);
    collegeTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    
  
    collegeTable.getTableHeader().setBackground(Color.DARK_GRAY);

    collegeTable.getTableHeader().setForeground(Color.BLACK);
    
    
    
    //make the cell not selectable
    collegeTable.setDefaultEditor(Object.class, null);
    
}

//-------------------------------------------------------------------------------------------

public static void loadCollegeData(){
    
      //load the collegetData
   
    int count = 0;
    while(count < Main.collegeData.size()){
        if(Main.END.equals(Main.collegeData.get(count).getCollegeCode())){
            break;
        }
        count++;
    }


    count = count - 1;
    Object[][] collegeData = new Object[count][Main.COLLEGEDATA_FORMAT];

    int rowIndex = 0;
    for(int i = 0; i <  Main.collegeData.size(); i++){

        String code = Main.collegeData.get(i).getCollegeCode();
        if("none".equals(code)){
            continue;
        }

        if(Main.END.equals(code)){
            break;
        }
        
       collegeData[rowIndex][0] = Main.collegeData.get(i).getCollegeCode();
       collegeData[rowIndex][1] = Main.collegeData.get(i).getCollegeName();             
        
       rowIndex++;
    }
    
    loadToCollegeTable(collegeData);
}

//-------------------------------------------------------------------------------------------

 public static void filteredCollegeData(Predicate<College> filter) {
    int count = 0;
    while (count < Main.collegeData.size()) {
        if (Main.END.equals(Main.collegeData.get(count).getCollegeCode())) {
            break;
        }
        count++;
    }

    Object[][] collegeData = new Object[count][Main.COLLEGEDATA_FORMAT];
    int dataIndex = 0; // Index for studentData array

    for (int i = 0; i < Main.collegeData.size(); i++) {
        if (Main.END.equals(Main.collegeData.get(i).getCollegeCode())) {
            break;
        }

        // Apply the filter (if provided)
        if (filter == null || filter.test(Main.collegeData.get(i))) {
            collegeData[dataIndex][0] = Main.collegeData.get(i).getCollegeCode();
            collegeData[dataIndex][1] = Main.collegeData.get(i).getCollegeName();
            dataIndex++;
        }
    }

    // Resize the array to remove empty rows (if any)
    Object[][] finalCollegeData = new Object[dataIndex][Main.COLLEGEDATA_FORMAT];
    System.arraycopy(collegeData, 0, finalCollegeData, 0, dataIndex);

    loadToCollegeTable(finalCollegeData);
}

//-------------------------------------------------------------------------------------------

public static void loadToProgramTable(Object[][] program){
    
    programTable.getTableHeader().setResizingAllowed(false);
    programTable.getTableHeader().setReorderingAllowed(false);

    programTable.setCellSelectionEnabled(false);
    programTable.setRowSelectionAllowed(true);
    programTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    
    
    // [FORMAT]: Program Code/Name/College code
    String programFormat[] = {"Program Code", "Program Name", "College Code"};
    
    DefaultTableModel model = new DefaultTableModel(program, programFormat);
    programTable.setModel(model);
    
               
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(JLabel.CENTER);
    programTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    programTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
    
    programTable.getTableHeader().setBackground(Color.DARK_GRAY);

    programTable.getTableHeader().setForeground(Color.black);
    
    //make the cell not selectable
    programTable.setDefaultEditor(Object.class, null);
    
    
}

//-------------------------------------------------------------------------------------------

public static void loadProgramData(){
    

    int count = 0;
    while(count < Main.programData.size()){
        if(Main.END.equals(Main.programData.get(count).getProgramCode())){
            break;
        }
        
        count++;
    }

    count = count - 1;
    
    Object[][] programData = new Object[count][Main.PROGRAMDATA_FORMAT];

    int rowCount = 0;
    for(int i = 0; i <  Main.programData.size(); i++){
        
        String code = Main.programData.get(i).getProgramCode();
        if("none".equals(code)){
            continue;
        }
        if(Main.END.equals(code)){
            break;
        }
        
       programData[rowCount][0] = Main.programData.get(i).getProgramCode();
       programData[rowCount][1] = Main.programData.get(i).getProgramName();   
       programData[rowCount][2] = Main.programData.get(i).getCollegeCode();
       rowCount++;
    }
    
    loadToProgramTable(programData);
}
public static void filteredProgramData(Predicate<Program> filter) {
    int count = 0;
    while (count < Main.programData.size()) {
        if (Main.END.equals(Main.programData.get(count).getProgramCode())) {
            break;
        }
        count++;
    }

    Object[][] programData = new Object[count][Main.PROGRAMDATA_FORMAT];
    int dataIndex = 0; // Index for studentData array

    for (int i = 0; i < Main.programData.size(); i++) {
        if (Main.END.equals(Main.programData.get(i).getProgramCode())) {
            break;
        }

        // Apply the filter (if provided)
        if (filter == null || filter.test(Main.programData.get(i))) {
            programData[dataIndex][0] = Main.programData.get(i).getProgramCode();
            programData[dataIndex][1] = Main.programData.get(i).getProgramName();
            programData[dataIndex][2] = Main.programData.get(i).getCollegeCode();
            dataIndex++;
        }
    }

    // Resize the array to remove empty rows (if any)
    Object[][] finalProgramData = new Object[dataIndex][Main.PROGRAMDATA_FORMAT];
    System.arraycopy(programData, 0, finalProgramData, 0, dataIndex);

    loadToProgramTable(finalProgramData);
}

//-------------------------------------------------------------------------------------------
public static void getStudentTableRowData(){
    
    if(studentTable.getRowCount() == 1){
        studentTable.setRowSelectionInterval(0, 0);
    }
    
     //get the row data to load in the individual label
    int selectedRow = studentTable.getSelectedRow();
    
  
    if(selectedRow != -1){
        
   
        idNumberField.setText( (String) studentTable.getValueAt(selectedRow, 0));
        firstNameLabel.setText( (String) studentTable.getValueAt(selectedRow, 1));
        lastNameLabel.setText( (String) studentTable.getValueAt(selectedRow, 2));
        yearLevelField.setText( (String) studentTable.getValueAt(selectedRow, 3));
        genderField.setText( (String) studentTable.getValueAt(selectedRow, 4));
        programCodeField.setText( (String) studentTable.getValueAt(selectedRow, 5));
    }
    
}

//-------------------------------------------------------------------------------------------    


public static void getProgramTableRowData(){
    
    if(programTable.getRowCount() == 1){
        programTable.setRowSelectionInterval(0, 0);
    }
    
    int selectedRow = programTable.getSelectedRow();
    
    if(selectedRow != -1){
        
   
        
        programCodeP.setText( (String) programTable.getValueAt(selectedRow, 0));
        programCodeN.setText((String) programTable.getValueAt(selectedRow, 1));
        collegeCodeP.setText((String) programTable.getValueAt(selectedRow, 2));
        
    }
    
    
}

//-------------------------------------------------------------------------------------------
    
public static void getCollegeTableRowData(){
    
    if(collegeTable.getRowCount() == 1){
        collegeTable.setRowSelectionInterval(0, 0);
    }
    
    int selectedRow = collegeTable.getSelectedRow();
    
    if(selectedRow != -1){
       
        collegeCodeC.setText( (String) collegeTable.getValueAt(selectedRow, 0));
        collegeCodeN.setText((String) collegeTable.getValueAt(selectedRow, 1));
       
    }
    
    
}
//-------------------------------------------------------------------------------------------
public static void saveStudentEdit(){

    
    for(int i = 0; i < Main.studentData.size(); i++){
        
        if(Main.END.equals(Main.studentData.get(i).getIdNum())){
            break;
        }
        
        int selectedRow = studentTable.getSelectedRow();
        String pastIdNum = (String) studentTable.getValueAt(selectedRow, 0);
        
        if(pastIdNum.equals(Main.studentData.get(i).getIdNum())){
            
            Main.studentData.get(i).setIdNum(idNumberField.getText());
            Main.studentData.get(i).setFirstName(firstNameLabel.getText());
            Main.studentData.get(i).setLastName(lastNameLabel.getText());
            Main.studentData.get(i).setYearLevel( (String) comboBoxYearL.getSelectedItem());
            
            if(maleG.isSelected()){
                  Main.studentData.get(i).setGender(maleG.getText());
            }
            if(femaleG.isSelected()){
                  Main.studentData.get(i).setGender(femaleG.getText());
            }
         
            Main.studentData.get(i).setProgramCode( (String) comboBoxSP.getSelectedItem());
           
        }
        
    }

}
//-----------------------------------------------------------------------------------------------------   

public static void saveProgramEdit(){
    
    
    //checkpoints
    
    
    int temp = programTable.getSelectedRow();
    String pastProgramCode = (String) programTable.getValueAt(temp, 0);
   
    for(int i = 0; i < Main.programData.size(); i++){
        
        if(Main.END.equals(Main.programData.get(i).getProgramCode())){
            break;
        }
        
        if(pastProgramCode.equals((Main.programData.get(i).getProgramCode()))){
            Main.programData.get(i).setProgramCode(programCodeP.getText());
            Main.programData.get(i).setProgramName(programCodeN.getText());
            Main.programData.get(i).setCollegeCode( (String) comboBoxCCP.getSelectedItem());
        }
    }
    
    
    //modify also the students data
    for(int i = 0; i < Main.studentData.size(); i++){
        
        if (Main.END.equals(Main.studentData.get(i).getIdNum())) {
            break;
        }
        
        if(pastProgramCode.equals(Main.studentData.get(i).getProgramCode())){
            Main.studentData.get(i).setProgramCode(programCodeP.getText());
        }
        
    }
    
}

//-----------------------------------------------------------------------------------------------------

  public static void saveCollegeEdit(){
    
    
    //checkpoints
    
    
    int temp = collegeTable.getSelectedRow();
    String pastCollegeCode = (String) collegeTable.getValueAt(temp, 0);
   
    for(int i = 0; i < Main.collegeData.size(); i++){
        
        if(Main.END.equals(Main.collegeData.get(i).getCollegeCode())){
            break;
        }
        
        if(pastCollegeCode.equals((Main.collegeData.get(i).getCollegeCode()))){
            Main.collegeData.get(i).setCollegeCode(collegeCodeC.getText());
            Main.collegeData.get(i).setCollegeName(collegeCodeN.getText());
        }
    }
    
    
    //modify also the Program data
    for(int i = 0; i < Main.programData.size(); i++){
        
        if (Main.END.equals(Main.programData.get(i).getProgramCode())) {
            break;
        }
        
        if(pastCollegeCode.equals(Main.programData.get(i).getCollegeCode())){
            Main.programData.get(i).setCollegeCode(collegeCodeC.getText());
        }
        
    }
    
}
//-----------------------------------------------------------------------------------------------------
public static String genNum() {
   
   // Get the academic year
    String academicYear = (String) comboBoxY.getSelectedItem();

    // Check if the array is empty or the first element is null
    if (Main.studentData == null || Main.studentData.size() == 0) {
        return academicYear + "-0001"; // Default first ID for the current year
    }

    // Handle the first element
    String firstIdNum = Main.studentData.get(0).getIdNum();
    if (Main.END.equals(firstIdNum)) {
        return academicYear + "-0001"; // If the first element is "END", start from 0001 for the current year
    }

    // Loop through the array to find the next unique ID for the current year
    int maxUniqueId = 0; // Track the maximum unique ID for the current year
    int trackYear = 0;
    int count = 0;
    
    for (int i = 0; i < Main.studentData.size(); i++) {
        String currentIdNum = Main.studentData.get(i).getIdNum();
        
        
        // Skip null or "END" values
        if (currentIdNum == null || Main.END.equals(currentIdNum)) {
            continue;
        }

        // Split the current ID into year and unique ID
        String[] parts = currentIdNum.split("-");
       
        if (parts.length != 2) {
            continue; // Skip invalid formats
        }

        // Parse the year and unique ID
        int year;
        int uniqueId;
        try {
            year = Integer.parseInt(parts[0]);
            uniqueId = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            continue; // Skip if the year or unique ID is not a number
        }

        // Only consider IDs for the current year
        if (year == Integer.parseInt(academicYear)){
            
            if(trackYear != year){
                trackYear = year;
                count = 0;
            } else {
                count++;
            }
            
            if(count == 0 && uniqueId != 1){      
                return academicYear + "-0001";
            }
            
            if (uniqueId > maxUniqueId && uniqueId -1 == maxUniqueId) {
                maxUniqueId = uniqueId;
            } else {
                int nextUniqueId = maxUniqueId + 1;
                return academicYear + formatUniqueId(nextUniqueId);
            }
        }
    }

    // Generate the next unique ID for the current year
    int nextUniqueId = maxUniqueId + 1;
    return academicYear + formatUniqueId(nextUniqueId);
}

// Helper method to format the unique ID
private static String formatUniqueId(int uniqueId) {
    if (uniqueId < 10) {
        return "-000" + uniqueId;
    } else if (uniqueId < 100) {
        return "-00" + uniqueId;
    } else if (uniqueId < 1000) {
        return "-0" + uniqueId;
    } else {
        return "-" + uniqueId;
    }
}





//methods for the events

public static void addButtonCollegeDialog(){
     boolean checkpoint = true;

        collegeCodeCheckC.setText("");
        collegeNameCheck.setText("");

        // Validate college code
        if (codeFieldC.getText().isBlank()) {
            checkpoint = false;
            collegeCodeCheckC.setText("* It's Empty");
        } else {
            String collegeCode = codeFieldC.getText().toLowerCase();
            if (!collegeCode.matches("[a-zA-Z ]+")) {
                checkpoint = false;
                collegeCodeCheckC.setText("* Alphabetical Letters Only");
            } else {
                for (College college : Main.collegeData) {
                    if (Main.END.equals(college.getCollegeCode())) {
                        break;
                    }
                    if (collegeCode.equals(college.getCollegeCode().toLowerCase())) {
                        checkpoint = false;
                        collegeCodeCheckC.setText("* College Code Exists");
                    }
                }
            }
        }

        // Validate college name
        if (nameFieldC.getText().isBlank()) {
            checkpoint = false;
            collegeNameCheck.setText("* It's Empty");
        } else {
            String collegeName = nameFieldC.getText();
            if (!collegeName.matches("[a-zA-Z ]+")) {
                checkpoint = false;
                collegeNameCheck.setText("* Alphabetical Letters Only");
            }
        }

        if (checkpoint) {
            Main.collegeData.add(new College(codeFieldC.getText(), nameFieldC.getText()));
            Write.writeCollege(); // Save to database
            loadCollegeData(); 
            loadCollegeCom();
            AddCollegeDialog.dispose();
        }
}
public static void addButtonProgramDialog(){
    boolean checkpoint = true;

        programCodeCheck.setText("");
        programNameCheck.setText("");
        collegeCodeCheck.setText("");

        // Validate program code
        if (codeFieldP.getText().isBlank()) {
            checkpoint = false;
            programCodeCheck.setText("* It's Empty");
        } else {
            String programCode = codeFieldP.getText().toLowerCase();
            if (!programCode.matches("[a-zA-Z ]+")) {
                checkpoint = false;
                programCodeCheck.setText("* Alphabetical Letters Only");
            } else {
                for (Program program : Main.programData) {
                    if (Main.END.equals(program.getProgramCode())) {
                        break;
                    }
                    if (programCode.equals(program.getProgramCode().toLowerCase())) {
                        checkpoint = false;
                        programCodeCheck.setText("* Program Code Exists");
                    }
                }
            }
        }

        // Validate program name
        if (nameFieldP.getText().isBlank()) {
            checkpoint = false;
            programNameCheck.setText("* It's Empty");
        } else {
            String programName = nameFieldP.getText();
            if (!programName.matches("[a-zA-Z ]+")) {
                checkpoint = false;
                programNameCheck.setText("* Alphabetical Letters Only");
            }
        }

        // Validate college code
        String collegeCode = (String) comboBoxCC.getSelectedItem();
        if (collegeCode == null || collegeCode.isEmpty()) {
            checkpoint = false;
            collegeCodeCheck.setText("* It's Empty");
        }

        if (checkpoint) {
            Main.programData.add(new Program(codeFieldP.getText(), nameFieldP.getText(), collegeCode));
            Write.writeProgram(); // Save to database
            loadProgramData(); 
            loadProgramCom();
            AddProgramDialog.dispose();
        }
}

public static void confirmButtonStudentDialog(){
    boolean checkpoint = true;

        idCheck.setText("");
        firstnameCheck.setText("");
        lastnameCheck.setText("");
        yearLevelCheck.setText("");
        collegeCheck.setText("");
        programCheck.setText("");

        // Validate ID number
        if (idFieldNS.getText().isBlank()) {
            checkpoint = false;
            idCheck.setText("* The ID number is empty");
        } else if (!idFieldNS.getText().matches("\\d{4}-\\d{4}")) {
            checkpoint = false;
            idCheck.setText("* Format: YYYY-NNNN");
        } else {
            for (Student student : Main.studentData) {
                if (Main.END.equals(student.getIdNum())) {
                    break;
                }
                if (idFieldNS.getText().equals(student.getIdNum())) {
                    checkpoint = false;
                    idCheck.setText("* ID number is taken");
                }
            }
        }

        // Validate first name
        if (firstNameField.getText().isBlank()) {
            checkpoint = false;
            firstnameCheck.setText("* It's Empty");
        } else if (!firstNameField.getText().matches("[a-zA-Z ]+")) {
            checkpoint = false;
            firstnameCheck.setText("* Alphabetical letters only");
        }

        // Validate last name
        if (lastNameField.getText().isBlank()) {
            checkpoint = false;
            lastnameCheck.setText("* It's Empty");
        } else if (!lastNameField.getText().matches("[a-zA-Z]+")) {
            checkpoint = false;
            lastnameCheck.setText("* Alphabetical letters only");
        }

        // Validate year level
        String yearLevel = (String) comboBoxYL.getSelectedItem();
        if (yearLevel == null || yearLevel.isEmpty()) {
            checkpoint = false;
            yearLevelCheck.setText("It's Empty");
        }

        // Validate college code
        String collegeCode = (String) comboBoxCCStudent.getSelectedItem();
        if (collegeCode == null || collegeCode.isEmpty()) {
            checkpoint = false;
            collegeCheck.setText("It's Empty");
        }

        // Validate program code
        String programCode = (String) comboBoxP.getSelectedItem();
        if (programCode == null || programCode.isEmpty()) {
            checkpoint = false;
            programCheck.setText("It's Empty");
        }

        if (checkpoint) {
            Main.studentData.add(new Student(
                idFieldNS.getText(),
                firstNameField.getText(),
                lastNameField.getText(),
                yearLevel,
                male.isSelected() ? "Male" : "Female",
                programCode
            ));
            Write.writeStudent(); // Save to database
            Components.loadStudentData(); // Use Components method
            AddStudentDialog.dispose();
        }
}

public static void formWindowActivated(){
    

    if (!shouldRefresh) {
        return; // Skip refreshing if the flag is false
    }

    if (!saveButton.isVisible() && !cancel.isVisible()) {
     
    //student Table Part
    saveButton.setVisible(false);
    cancel.setVisible(false); 
    comboBoxYearL.setVisible(false);
    }

    if(!saveProgram.isVisible() && !cancelProgram.isVisible()){
          //program Table part
        saveProgram.setVisible(false);
        cancelProgram.setVisible(false);
        comboBoxCCP.setVisible(false);  
    }
  
   
    Components.loadStudentData(); // Use Components method
    Components.loadCollegeData(); // Use Components method
    Components.loadProgramData(); // Use Components method
}







public static void saveProgramClicked(){

        //waiting popup to notify if you want to proceed to edit and the students data will also be modified
        
        boolean checkpoint = true;
        
        
        //check program Code if blank
        if(programCodeP.getText().isBlank()){
            checkpoint = false;
            JOptionPane.showMessageDialog(null, "Program Code cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
  
        } else {
            
            String programCode = programCodeP.getText().toLowerCase();
            
            if(!programCode.matches("[a-zA-Z ]+")){
                checkpoint = false;
                JOptionPane.showMessageDialog(null, "Program Code must contain only alphabetical letters.", "Warning", JOptionPane.WARNING_MESSAGE);
 
            } else {
                
                
                int selectedRow = programTable.getSelectedRow();
                String pastProgramCode = programTable.getValueAt(selectedRow, 0).toString().toLowerCase();
                
                if(!pastProgramCode.equals(programCode)){
                    //check if programCode is unique
                    for(int i = 0; i < Main.programData.size(); i++){
        
                    if(Main.END.equals(Main.programData.get(i).getProgramCode())){
                        break;
                    }
                
                    if(programCode.equals(Main.programData.get(i).getProgramCode().toLowerCase())){
                        checkpoint = false;
                        JOptionPane.showMessageDialog(null, "Program Code already exists.", "Warning", JOptionPane.WARNING_MESSAGE);
 
                    }
                    }
          
                }
            }
            
           
            
        }
         
      
        //check program Name
        if(programCodeN.getText().isBlank()){
            checkpoint = false;
            JOptionPane.showMessageDialog(null, "Program Name cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
  
        } else {
            
            String programName = programCodeN.getText();
            if(!programName.matches("[a-zA-Z ]+")){
               checkpoint = false;
               JOptionPane.showMessageDialog(null, "Program Name must contain only alphabetical letters.", "Warning", JOptionPane.WARNING_MESSAGE);
 
            }
            
        }
        shouldRefresh = false;
        
        if (checkpoint) {
            int confirm = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to save the changes? This will also update associated students.",
                "Confirm Save",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
    
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    int selectedRow = programTable.getSelectedRow();
                    String oldProgramCode = (String) programTable.getValueAt(selectedRow, 0);
    
                    saveProgram.setVisible(false);
                    cancelProgram.setVisible(false);
                    comboBoxCCP.setVisible(false);
    
                    editProgram.setVisible(true);
                    deleteProgram.setVisible(true);
                    collegeCodeP.setVisible(true);
    
                    programCodeP.setFocusable(false);
                    programCodeN.setFocusable(false);
                    collegeCodeP.setFocusable(false);

                    Components.saveProgramEdit();
    
                    Write.updateProgram(oldProgramCode, programCodeP.getText(), programCodeN.getText(), (String) comboBoxCCP.getSelectedItem()); // Update the database
                    Write.writeStudent();
    
                    Components.clearProgramFields();
                    Components.clearStudentFields();
    
                    Components.loadProgramData();
                    Components.loadStudentData();
                    shouldRefresh = true;
                    JOptionPane.showMessageDialog(null, "Program updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error updating program: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
}

public static void editProgram(){

    if(!programCodeP.getText().isEmpty()){
        editProgram.setVisible(false);
        deleteProgram.setVisible(false);

        saveProgram.setVisible(true);
        cancelProgram.setVisible(true);

        programCodeP.setFocusable(true);
        programCodeN.setFocusable(true);
        collegeCodeP.setFocusable(true);

        collegeCodeP.setVisible(false);
        comboBoxCCP.setVisible(true);

        //loadthe college data
        comboBoxCCP.removeAllItems();
        for(int i = 0; i < Main.collegeData.size(); i++){
            if(Main.END.equals(Main.collegeData.get(i).getCollegeCode())){
                break;
            }
            comboBoxCCP.addItem(Main.collegeData.get(i).getCollegeCode());

        }
    }
}

public static void cancelProgramClicked(){

    
    cancelProgram.setVisible(false);
    saveProgram.setVisible(false);
    comboBoxCCP.setVisible(false);

    editProgram.setVisible(true);
    deleteProgram.setVisible(true);
    collegeCodeP.setVisible(true);
    
    programCodeP.setFocusable(false);
    programCodeN.setFocusable(false);
    collegeCodeP.setFocusable(false);

    Components.getProgramTableRowData(); // Use Components method

}

public static void deleteProgramClicked(){
    String programCode = programCodeP.getText();

        if (programCode.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a program to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null,
            "Deleting this program will set associated students' Program Code to 'none'.\nAre you sure you want to proceed?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            // Remove the program from the list
            Main.programData.removeIf(program -> program.getProgramCode().equals(programCode));
            try {
                Write.deleteProgram(programCode); // Update the database
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error deleting program: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Update associated students
            for (Student student : Main.studentData) {
                if (student.getProgramCode().equals(programCode)) {
                    student.setProgramCode("none");
                }
            }
            Write.writeStudent(); // Update the database

            // Refresh the data
            Components.loadProgramData(); // Use Components method
            Components.loadStudentData(); // Use Components method
            Components.clearProgramFields(); // Use Components method

            JOptionPane.showMessageDialog(null, "Program deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
}










public static void cancelStudentClicked(){


    delete.setVisible(true);
    editButton.setVisible(true);
    saveButton.setVisible(false);
    cancel.setVisible(false);

    idNumberField.setFocusable(false);
    firstNameLabel.setFocusable(false);
    lastNameLabel.setFocusable(false);
    yearLevelField.setFocusable(false);
    genderField.setFocusable(false);
    programCodeField.setFocusable(false);

    programCodeField.setVisible(true);
    yearLevelField.setVisible(true);
    genderField.setVisible(true);

    comboBoxSP.setVisible(false);
    comboBoxYearL.setVisible(false);
    maleG.setVisible(false);
    femaleG.setVisible(false);

 
    Components.getStudentTableRowData(); // Use Components method

}


public static void saveStudentClicked(){

    boolean checkpoint = true;


    
      //unique id check
    if(idNumberField.getText().isBlank()){
        checkpoint = false;
        JOptionPane.showMessageDialog(null, "ID Number cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
  
        
    } else {
        
        if(!idNumberField.getText().matches("\\d{4}-\\d{4}")){
            checkpoint = false;
            JOptionPane.showMessageDialog(null, "ID Number must follow the format YYYY-NNNN.", "Warning", JOptionPane.WARNING_MESSAGE);
   
         
        } else {

            if(idNumberField.getText().length() == 9){
        
                int selectedRow = studentTable.getSelectedRow();
                String pastIdNum = (String) studentTable.getValueAt(selectedRow, 0);
                
                if(!pastIdNum.equals(idNumberField.getText())){
                    for(int i = 0; i < Main.studentData.size(); i++){
                    if(Main.END.equals(Main.studentData.get(i).getIdNum())){
                        break;
                    }
        
                    if(idNumberField.getText().equals(Main.studentData.get(i).getIdNum())){
                        checkpoint = false;
                        JOptionPane.showMessageDialog(null, "ID Number already exists.", "Warning", JOptionPane.WARNING_MESSAGE);
   
               
                    }
                    }   
                }
               
            
            }
        }
        
    }
    
      //--------------------------------------------------------------------------

    //first name check
    if(firstNameLabel.getText().isBlank()){
        checkpoint = false;
        JOptionPane.showMessageDialog(null, "First Name cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
  
       
    } else {
        String firstname = firstNameLabel.getText();
        if(!firstname.matches("[a-zA-Z ]+")){
           checkpoint = false;
           JOptionPane.showMessageDialog(null, "First Name must contain only alphabetical letters.", "Warning", JOptionPane.WARNING_MESSAGE);
   
        } 
    }
 
   
    //--------------------------------------------------------------------------

    
    //lastname check
    if(lastNameLabel.getText().isBlank()){
        checkpoint = false;
        JOptionPane.showMessageDialog(null, "Last Name cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
 
    } else {
        String lastname = lastNameLabel.getText();
        if(!lastname.matches("[a-zA-Z]+")){
            checkpoint = false;
            JOptionPane.showMessageDialog(null, "Last Name must contain only alphabetical letters.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
   

    
    
    
    
    //firstname and lastname check
    if(firstNameLabel.getText().isBlank() && lastNameLabel.getText().isBlank()){
        checkpoint = false;
        JOptionPane.showMessageDialog(null, "Fist Name and Last Name should not be empty.", "Warning", JOptionPane.WARNING_MESSAGE);

    } else {
        

        String firstname = firstNameLabel.getText().toLowerCase();
        String lastname = lastNameLabel.getText().toLowerCase();
        
        int selectedRow = studentTable.getSelectedRow();
        String pastFirstname = studentTable.getValueAt(selectedRow, 1).toString().toLowerCase();
        String pastLastname = studentTable.getValueAt(selectedRow, 2).toString().toLowerCase();
        
        //check if same from past and current name
        if(!pastFirstname.equals(firstname) && !pastLastname.equals(lastname)){
            for(int i = 0; i < Main.studentData.size(); i++){
                if(Main.END.equals(Main.studentData.get(i).getIdNum())){
                    break;
                }
                //check if unique
                if(firstname.equals(Main.studentData.get(i).getFirstName().toLowerCase()) && lastname.equals(Main.studentData.get(i).getLastName().toLowerCase())){
                    checkpoint = false;
                    JOptionPane.showMessageDialog(null, "First Name and Last Name already exists", "Warning", JOptionPane.WARNING_MESSAGE);

                }
            }
        }

    }

    shouldRefresh = false;

    
    if (checkpoint) {
    int confirm = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to save the changes?",
        "Confirm Save",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE);

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            int selectedRow = studentTable.getSelectedRow();
            String oldIdNumber = (String) studentTable.getValueAt(selectedRow, 0);

            delete.setVisible(true);
            editButton.setVisible(true);
            saveButton.setVisible(false);
            cancel.setVisible(false);

            studentTable.setFocusable(true);
            studentTable.setEnabled(true);
      
            idNumberField.setFocusable(false);
            firstNameLabel.setFocusable(false);
            lastNameLabel.setFocusable(false);
            yearLevelField.setFocusable(false);
            genderField.setFocusable(false);
            programCodeField.setFocusable(false);

            programCodeField.setVisible(true);
            yearLevelField.setVisible(true);
            genderField.setVisible(true);

            comboBoxSP.setVisible(false);
            comboBoxYearL.setVisible(false);
            maleG.setVisible(false);
            femaleG.setVisible(false);

            Components.saveStudentEdit();
            Write.updateStudent(oldIdNumber, idNumberField.getText(), firstNameLabel.getText(), lastNameLabel.getText(),
                (String) comboBoxYearL.getSelectedItem(), maleG.isSelected() ? "Male" : "Female", (String) comboBoxSP.getSelectedItem()); // Update the database

            Student.sortStudentArray();
            Components.clearStudentFields();

            Components.loadStudentData();
            shouldRefresh = true;

            JOptionPane.showMessageDialog(null, "Student updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error updating student: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
}

public static void deleteStudentClicked(){
    String idNumber = idNumberField.getText();

    if (idNumber.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please select a student to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to delete this student?",
        "Confirm Deletion",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE);

    if (confirm == JOptionPane.YES_OPTION) {
        // Remove the student from the list
        Main.studentData.removeIf(student -> student.getIdNum().equals(idNumber));
        try {
            Write.deleteStudent(idNumber);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error deleting student: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Refresh the data
        Components.loadStudentData(); // Use Components method
        Components.clearStudentFields(); // Use Components method

        JOptionPane.showMessageDialog(null, "Student deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}

public static void editStudentClicked(){

    if(!idNumberField.getText().isEmpty()){
        editButton.setVisible(false);
        delete.setVisible(false);
        
        saveButton.setVisible(true);
        cancel.setVisible(true);        
        
        studentTable.setFocusable(false);


        idNumberField.setFocusable(true);
        firstNameLabel.setFocusable(true);
        lastNameLabel.setFocusable(true);
        yearLevelField.setFocusable(true);
        genderField.setFocusable(true);
        programCodeField.setVisible(false);
        yearLevelField.setVisible(false);
        genderField.setVisible(false);

        comboBoxSP.setVisible(true);
        comboBoxYearL.setVisible(true);
        maleG.setVisible(true);
        femaleG.setVisible(true);

int selectedRow = studentTable.getSelectedRow();
        String yearLevel = (String) studentTable.getValueAt(selectedRow, 3);
        String gender = (String) studentTable.getValueAt(selectedRow, 4);
        String programCode = (String) studentTable.getValueAt(selectedRow, 5);
        //load Academic Year
        
        comboBoxYearL.removeAllItems();
        comboBoxYearL.addItem(yearLevel);
        for(int i = 0; i < Main.YearLevel.length; i++){

            if(Main.YearLevel[i] == yearLevel){
                continue;
            }

            if(Main.YearLevel[i] == null){
                break;
            }
            if(Main.YearLevel[i] == "END"){
                break;
            }
            

            comboBoxYearL.addItem(Main.YearLevel[i]);
        }

        //gender selection
        if(gender == "Female"){
            femaleG.setSelected(true);
        } else {
            maleG.setSelected(true);
        }

        comboBoxSP.removeAllItems();
        comboBoxSP.addItem(programCode);
        for(int i = 0; i < Main.programData.size(); i++){

            if(programCode.equals(Main.programData.get(i).getProgramCode())){
                continue;
            }
            if(Main.END.equals(Main.programData.get(i).getProgramCode())){
                break;
            }

            comboBoxSP.addItem(Main.programData.get(i).getProgramCode());
        }
    }

}






public static void saveCollegeClicked(){
     
        //waiting popup to notify if you want to proceed to save the modification, the program list will also be modified

        
        boolean checkpoint = true;

        
          //check college Code if blank
        if(collegeCodeC.getText().isBlank()){
            checkpoint = false;
            JOptionPane.showMessageDialog(null, "College Code cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            
            String collegeCode = collegeCodeC.getText().toLowerCase();
            
            if(!collegeCode.matches("[a-zA-Z ]+")){
                checkpoint = false;
                JOptionPane.showMessageDialog(null, "College Code must contain only alphabetical letters.", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {
                
                int selectedRow = collegeTable.getSelectedRow();
                String pastCollegeCode = collegeTable.getValueAt(selectedRow, 0).toString().toLowerCase();
                
                if(!pastCollegeCode.equals(collegeCode)){
                      //check if programCode is unique
                for(int i = 0; i < Main.collegeData.size(); i++){
        
                if(Main.END.equals(Main.collegeData.get(i).getCollegeCode())){
                    break;
                }
                
                if(collegeCode.equals(Main.collegeData.get(i).getCollegeCode().toLowerCase())){
                    checkpoint = false;
                    JOptionPane.showMessageDialog(null, "College Code already exists.", "Warning", JOptionPane.WARNING_MESSAGE);

                }
        
                }

                }
                          }
 
        }
        
        //college name check
        if(collegeCodeN.getText().isBlank()){
            checkpoint = false;
            JOptionPane.showMessageDialog(null, "College Name cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
 
        } else {
            
            String collegeNameC = collegeCodeN.getText();
            if(!collegeNameC.matches("[a-zA-Z ]+")){
                checkpoint = false;
                JOptionPane.showMessageDialog(null, "College Name must contain only alphabetical letters.", "Warning", JOptionPane.WARNING_MESSAGE);
   
            }
            
        }
        
        shouldRefresh = false;
        
        if (checkpoint) {
            int confirm = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to save the changes? This will also update associated programs.",
                "Confirm Save",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
    
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    saveCollege.setVisible(false);
                    cancelCollege.setVisible(false);
    
                    editCollege.setVisible(true);
                    deleteCollege.setVisible(true);
    
                    collegeCodeC.setFocusable(false);
                    collegeCodeN.setFocusable(false);
    
                   
                 
                    collegeTable.setFocusable(true);
    
                    Components.saveCollegeEdit();
                    int selectedRow = collegeTable.getSelectedRow();
                    String oldCollegeCode = (String) collegeTable.getValueAt(selectedRow, 0);
    
                    Write.updateCollege(oldCollegeCode, collegeCodeC.getText(), collegeCodeN.getText()); // Update the database
                    Write.writeProgram();
    
                    Components.clearCollegeFields();
                    Components.clearProgramFields();
    
                    Components.loadProgramData();
                    Components.loadCollegeData();

                    shouldRefresh = true;
                    
                    JOptionPane.showMessageDialog(null, "College updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error updating college: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
}


public static void deleteCollegeClicked(){
    String collegeCode = collegeCodeC.getText();

        if (collegeCode.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a college to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null,
            "Deleting this college will set associated programs' College Code to 'none'.\nAre you sure you want to proceed?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            // Remove the college from the list
            Main.collegeData.removeIf(college -> college.getCollegeCode().equals(collegeCode));
            try {
                Write.deleteCollege(collegeCode); // Update the database
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error deleting college: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Update associated programs
            for (Program program : Main.programData) {
                if (program.getCollegeCode().equals(collegeCode)) {
                    program.setCollegeCode("none");
                }
            }
            Write.writeProgram(); // Update the database

            // Refresh the data
            Components.loadCollegeData(); // Use Components method
            Components.loadProgramData(); // Use Components method
            Components.clearCollegeFields(); // Use Components method

            JOptionPane.showMessageDialog(null, "College deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
}

public static void editCollegeClicked(){

    if(!collegeCodeC.getText().isEmpty()){
            
        editCollege.setVisible(false);
        deleteCollege.setVisible(false);

        saveCollege.setVisible(true);
        cancelCollege.setVisible(true);

        collegeTable.setFocusable(false);
       

        collegeCodeC.setEditable(true);
        collegeCodeC.setFocusable(true);

        collegeCodeN.setEditable(true);
        collegeCodeN.setFocusable(true);

    }

}
public static void cancelCollegeClicked(){
      

    cancelCollege.setVisible(false);
    saveCollege.setVisible(false);

    editCollege.setVisible(true);
    deleteCollege.setVisible(true);
    
    collegeCodeC.setFocusable(false);
    collegeCodeN.setFocusable(false);

    
    collegeTable.setEnabled(true);
    getCollegeTableRowData(); // Use Components method
    
}
}


