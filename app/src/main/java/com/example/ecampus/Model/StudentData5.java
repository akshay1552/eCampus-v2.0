package com.example.ecampus.Model;

public class StudentData5 {

    private String Student_Enroll_No;
    private String MAD;
    private String ADT;
    private String Operating_System;
    private String Advance_Java;
    private String PHP;
    private String Python;
    private String Project_1;

    public StudentData5() {
    }


    public StudentData5(String student_Enroll_No, String MAD, String ADT, String operating_System, String advance_Java, String PHP, String python, String project_1) {
        Student_Enroll_No = student_Enroll_No;
        this.MAD = MAD;
        this.ADT = ADT;
        Operating_System = operating_System;
        Advance_Java = advance_Java;
        this.PHP = PHP;
        Python = python;
        Project_1 = project_1;
    }

    public String getStudent_Enroll_No() {
        return Student_Enroll_No;
    }

    public void setStudent_Enroll_No(String student_Enroll_No) {
        Student_Enroll_No = student_Enroll_No;
    }

    public String getMAD() {
        return MAD;
    }

    public void setMAD(String MAD) {
        this.MAD = MAD;
    }

    public String getADT() {
        return ADT;
    }

    public void setADT(String ADT) {
        this.ADT = ADT;
    }

    public String getOperating_System() {
        return Operating_System;
    }

    public void setOperating_System(String operating_System) {
        Operating_System = operating_System;
    }

    public String getAdvance_Java() {
        return Advance_Java;
    }

    public void setAdvance_Java(String advance_Java) {
        Advance_Java = advance_Java;
    }

    public String getPHP() {
        return PHP;
    }

    public void setPHP(String PHP) {
        this.PHP = PHP;
    }

    public String getPython() {
        return Python;
    }

    public void setPython(String python) {
        Python = python;
    }

    public String getProject_1() {
        return Project_1;
    }

    public void setProject_1(String project_1) {
        Project_1 = project_1;
    }
}
