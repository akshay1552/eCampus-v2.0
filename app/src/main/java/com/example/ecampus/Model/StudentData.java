package com.example.ecampus.Model;

public class StudentData {

    private String Student_Enroll_No;
    private String Engineering_Physics;
    private String Maths_I;
    private String Basics_of_Communication;
    private String Fundamentals_of_Electrical_Engg;
    private String Basics_of_Computer_Engg;
    private String Computer_Workshop;

    public StudentData() {
    }

    public StudentData(String student_Enroll_No, String engineering_Physics, String maths_I, String basics_of_Communication, String fundamentals_of_Electrical_Engg, String basics_of_Computer_Engg, String computer_Workshop) {
        Student_Enroll_No = student_Enroll_No;
        Engineering_Physics = engineering_Physics;
        Maths_I = maths_I;
        Basics_of_Communication = basics_of_Communication;
        Fundamentals_of_Electrical_Engg = fundamentals_of_Electrical_Engg;
        Basics_of_Computer_Engg = basics_of_Computer_Engg;
        Computer_Workshop = computer_Workshop;
    }

    public String getStudent_Enroll_No() {
        return Student_Enroll_No;
    }

    public void setStudent_Enroll_No(String student_Enroll_No) {
        Student_Enroll_No = student_Enroll_No;
    }

    public String getEngineering_Physics() {
        return Engineering_Physics;
    }

    public void setEngineering_Physics(String engineering_Physics) {
        Engineering_Physics = engineering_Physics;
    }

    public String getMaths_I() {
        return Maths_I;
    }

    public void setMaths_I(String maths_I) {
        Maths_I = maths_I;
    }

    public String getBasics_of_Communication() {
        return Basics_of_Communication;
    }

    public void setBasics_of_Communication(String basics_of_Communication) {
        Basics_of_Communication = basics_of_Communication;
    }

    public String getFundamentals_of_Electrical_Engg() {
        return Fundamentals_of_Electrical_Engg;
    }

    public void setFundamentals_of_Electrical_Engg(String fundamentals_of_Electrical_Engg) {
        Fundamentals_of_Electrical_Engg = fundamentals_of_Electrical_Engg;
    }

    public String getBasics_of_Computer_Engg() {
        return Basics_of_Computer_Engg;
    }

    public void setBasics_of_Computer_Engg(String basics_of_Computer_Engg) {
        Basics_of_Computer_Engg = basics_of_Computer_Engg;
    }

    public String getComputer_Workshop() {
        return Computer_Workshop;
    }

    public void setComputer_Workshop(String computer_Workshop) {
        Computer_Workshop = computer_Workshop;
    }
}
