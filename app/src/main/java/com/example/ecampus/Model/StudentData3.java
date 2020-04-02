package com.example.ecampus.Model;

public class StudentData3 {

    private String Student_Enroll_No;
    private String Data_Structures;
    private String Digital_Technique;
    private String Computer_Hardware;
    private String Object_Oriented_Prog;
    private String PDBMS;
    private String EVS;

    public StudentData3() {
    }

    public StudentData3(String student_Enroll_No, String data_Structures, String digital_Technique, String computer_Hardware, String object_Oriented_Prog, String PDBMS, String EVS) {
        Student_Enroll_No = student_Enroll_No;
        Data_Structures = data_Structures;
        Digital_Technique = digital_Technique;
        Computer_Hardware = computer_Hardware;
        Object_Oriented_Prog = object_Oriented_Prog;
        this.PDBMS = PDBMS;
        this.EVS = EVS;
    }


    public String getStudent_Enroll_No() {
        return Student_Enroll_No;
    }

    public void setStudent_Enroll_No(String student_Enroll_No) {
        Student_Enroll_No = student_Enroll_No;
    }

    public String getData_Structures() {
        return Data_Structures;
    }

    public void setData_Structures(String data_Structures) {
        Data_Structures = data_Structures;
    }

    public String getDigital_Technique() {
        return Digital_Technique;
    }

    public void setDigital_Technique(String digital_Technique) {
        Digital_Technique = digital_Technique;
    }

    public String getComputer_Hardware() {
        return Computer_Hardware;
    }

    public void setComputer_Hardware(String computer_Hardware) {
        Computer_Hardware = computer_Hardware;
    }

    public String getObject_Oriented_Prog() {
        return Object_Oriented_Prog;
    }

    public void setObject_Oriented_Prog(String object_Oriented_Prog) {
        Object_Oriented_Prog = object_Oriented_Prog;
    }

    public String getPDBMS() {
        return PDBMS;
    }

    public void setPDBMS(String PDBMS) {
        this.PDBMS = PDBMS;
    }

    public String getEVS() {
        return EVS;
    }

    public void setEVS(String EVS) {
        this.EVS = EVS;
    }
}
