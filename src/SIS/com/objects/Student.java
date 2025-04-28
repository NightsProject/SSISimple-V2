
package SIS.com.objects;

import SIS.Main;
import java.util.Collections;
import java.util.Comparator;

final public class Student extends Program{
    
    private String idNum;
    private String firstName;
    private String lastName;
    private String yearLevel;
    private String gender;

    
    public Student(){};
    
    public Student(String idNum, String firstName, String lastName, String yearLevel, String gender, String programCode){
        this.idNum = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearLevel = yearLevel;
        this.gender = gender;
        super.programCode = programCode;
    }
    
    public Student(String idNum){
        this.idNum = idNum;
    }
    
    
    
    public String getIdNum() {
        return idNum;
    }

   
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

  
    public String getFirstName() {
        return firstName;
    }

   
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   
    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

 
    public String getYearLevel() {
        return yearLevel;
    }

  
    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

   
    public String getGender() {
        return gender;
    }

   
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProgramCode(){
        return super.programCode;
    }

    
    public void setProgramCode(String programCode) {
        super.programCode = programCode;
    }

    public String studentData(){
        return idNum + "," + firstName + "," + lastName + "," + yearLevel + "," + gender + "," + programCode;
    }

    public static void sortStudentArray() {
    // Sort the entire ArrayList
    Collections.sort(Main.studentData, Comparator.comparing((Student obj) -> {
        String idNum = obj.getIdNum();
        if (idNum == null) {
            return 2; // Null values come last
        }
        if ("END".equals(idNum)) {
            return 1; // "END" comes after non-null values but before nulls
        }
        return 0; // Non-null values come first
    }).thenComparing((Student obj) -> {
        String idNum = obj.getIdNum();
        if (idNum == null || "END".equals(idNum)) {
            return new int[]{0, 0}; // No sorting for nulls or "END"
        }
        String[] parts = idNum.split("-");
        int year = Integer.parseInt(parts[0]);
        int uniqueId = Integer.parseInt(parts[1]);
        return new int[]{year, uniqueId}; // Numerical sorting for non-null values
    }, (a, b) -> {
        if (a[0] != b[0]) return Integer.compare(a[0], b[0]); // Compare year
        return Integer.compare(a[1], b[1]); // Compare unique ID
    }));
}
}
