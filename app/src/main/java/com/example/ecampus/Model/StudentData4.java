package com.example.ecampus.Model;

public class StudentData4 {


    private String Student_Enroll_No;
    private String Software_Engg;
    private String OOMD;
    private String Computer_Network;
    private String Java;
    private String Microprocessor;
    private String Advance_Web_Page_Design;
    private String EDP;

    public StudentData4() {
    }

    public StudentData4(String student_Enroll_No, String software_Engg, String OOMD, String computer_Network, String java, String microprocessor, String advance_Web_Page_Design, String EDP) {
        Student_Enroll_No = student_Enroll_No;
        Software_Engg = software_Engg;
        this.OOMD = OOMD;
        Computer_Network = computer_Network;
        Java = java;
        Microprocessor = microprocessor;
        Advance_Web_Page_Design = advance_Web_Page_Design;
        this.EDP = EDP;
    }

    public String getStudent_Enroll_No() {
        return Student_Enroll_No;
    }

    public void setStudent_Enroll_No(String student_Enroll_No) {
        Student_Enroll_No = student_Enroll_No;
    }

    public String getSoftware_Engg() {
        return Software_Engg;
    }

    public void setSoftware_Engg(String software_Engg) {
        Software_Engg = software_Engg;
    }

    public String getOOMD() {
        return OOMD;
    }

    public void setOOMD(String OOMD) {
        this.OOMD = OOMD;
    }

    public String getComputer_Network() {
        return Computer_Network;
    }

    public void setComputer_Network(String computer_Network) {
        Computer_Network = computer_Network;
    }

    public String getJava() {
        return Java;
    }

    public void setJava(String java) {
        Java = java;
    }

    public String getMicroprocessor() {
        return Microprocessor;
    }

    public void setMicroprocessor(String microprocessor) {
        Microprocessor = microprocessor;
    }

    public String getAdvance_Web_Page_Design() {
        return Advance_Web_Page_Design;
    }

    public void setAdvance_Web_Page_Design(String advance_Web_Page_Design) {
        Advance_Web_Page_Design = advance_Web_Page_Design;
    }

    public String getEDP() {
        return EDP;
    }

    public void setEDP(String EDP) {
        this.EDP = EDP;
    }
}
