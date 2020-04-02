package com.example.ecampus.Model;

public class StudentData2 {

    private String Student_Enroll_No;
    private String Engg_Chemistry;
    private String Maths_2;
    private String BCE;
    private String Programming_In_C;
    private String Communication_Skills;
    private String Generic_Skills;
    private String WPD;

    public StudentData2() {
    }

    public StudentData2(String student_Enroll_No, String engg_Chemistry, String maths_2, String BCE, String programming_In_C, String communication_Skills, String generic_Skills, String WPD) {
        Student_Enroll_No = student_Enroll_No;
        Engg_Chemistry = engg_Chemistry;
        Maths_2 = maths_2;
        this.BCE = BCE;
        Programming_In_C = programming_In_C;
        Communication_Skills = communication_Skills;
        Generic_Skills = generic_Skills;
        this.WPD = WPD;
    }

    public String getStudent_Enroll_No() {
        return Student_Enroll_No;
    }

    public void setStudent_Enroll_No(String student_Enroll_No) {
        Student_Enroll_No = student_Enroll_No;
    }

    public String getEngg_Chemistry() {
        return Engg_Chemistry;
    }

    public void setEngg_Chemistry(String engg_Chemistry) {
        Engg_Chemistry = engg_Chemistry;
    }

    public String getMaths_2() {
        return Maths_2;
    }

    public void setMaths_2(String maths_2) {
        Maths_2 = maths_2;
    }

    public String getBCE() {
        return BCE;
    }

    public void setBCE(String BCE) {
        this.BCE = BCE;
    }

    public String getProgramming_In_C() {
        return Programming_In_C;
    }

    public void setProgramming_In_C(String programming_In_C) {
        Programming_In_C = programming_In_C;
    }

    public String getCommunication_Skills() {
        return Communication_Skills;
    }

    public void setCommunication_Skills(String communication_Skills) {
        Communication_Skills = communication_Skills;
    }

    public String getGeneric_Skills() {
        return Generic_Skills;
    }

    public void setGeneric_Skills(String generic_Skills) {
        Generic_Skills = generic_Skills;
    }

    public String getWPD() {
        return WPD;
    }

    public void setWPD(String WPD) {
        this.WPD = WPD;
    }
}
