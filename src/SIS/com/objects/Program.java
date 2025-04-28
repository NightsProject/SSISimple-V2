
package SIS.com.objects;

import SIS.Main;
import java.util.Collections;
import java.util.Comparator;


public class Program extends College{
    
    protected String programCode;
    protected String programName;

    public Program(){};
    
    public Program(String programCode, String programName, String collegeCode){
        this.programCode = programCode;
        this.programName = programName;
        super.collegeCode = collegeCode;
        
    }
    
    public Program(String programCode){
        this.programCode = programCode;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    
    public String getProgramName() {
        return programName;
    }

    
    public void setProgramName(String programName) {
        this.programName = programName;
    }

  
    public String getCollegeCode() {
        return super.collegeCode;
    }

    
    public void setCollegeCode(String collegeCode) {
        super.collegeCode = collegeCode;
    }
    
    public String programData(){
        return programCode + "," + programName + "," + collegeCode;
    }
    
    
    public static void sortProgramsByCode() {
    Collections.sort(Main.programData, Comparator.comparing((Program program) -> {
        String programCode = program.getProgramCode();

        if (programCode == null) {
            return 2; // Null values come last
        }
        if ("END".equals(programCode)) {
            return 1; // "END" comes after non-null values but before nulls
        }
        return 0; // Non-null values come first
    }).thenComparing(Program::getProgramCode, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)));
}
    
}
