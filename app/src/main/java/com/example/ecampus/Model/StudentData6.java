package com.example.ecampus.Model;

public class StudentData6 {

    private String Student_Enroll_No;
    private String NMA;
    private String Computer_Security;
    private String Software_Testing;
    private String Data_Analytics_using_R;
    private String Linux_Adminstration;
    private String MM;
    private String Project_2;

    public StudentData6() {
    }

    public StudentData6(String student_Enroll_No, String NMA, String computer_Security, String software_Testing, String data_Analytics_using_R, String linux_Adminstration, String MM, String project_2) {
        Student_Enroll_No = student_Enroll_No;
        this.NMA = NMA;
        Computer_Security = computer_Security;
        Software_Testing = software_Testing;
        Data_Analytics_using_R = data_Analytics_using_R;
        Linux_Adminstration = linux_Adminstration;
        this.MM = MM;
        Project_2 = project_2;
    }

    public String getStudent_Enroll_No() {
        return Student_Enroll_No;
    }

    public void setStudent_Enroll_No(String student_Enroll_No) {
        Student_Enroll_No = student_Enroll_No;
    }

    public String getNMA() {
        return NMA;
    }

    public void setNMA(String NMA) {
        this.NMA = NMA;
    }

    public String getComputer_Security() {
        return Computer_Security;
    }

    public void setComputer_Security(String computer_Security) {
        Computer_Security = computer_Security;
    }

    public String getSoftware_Testing() {
        return Software_Testing;
    }

    public void setSoftware_Testing(String software_Testing) {
        Software_Testing = software_Testing;
    }

    public String getData_Analytics_using_R() {
        return Data_Analytics_using_R;
    }

    public void setData_Analytics_using_R(String data_Analytics_using_R) {
        Data_Analytics_using_R = data_Analytics_using_R;
    }

    public String getLinux_Adminstration() {
        return Linux_Adminstration;
    }

    public void setLinux_Adminstration(String linux_Adminstration) {
        Linux_Adminstration = linux_Adminstration;
    }

    public String getMM() {
        return MM;
    }

    public void setMM(String MM) {
        this.MM = MM;
    }

    public String getProject_2() {
        return Project_2;
    }

    public void setProject_2(String project_2) {
        Project_2 = project_2;
    }
}
