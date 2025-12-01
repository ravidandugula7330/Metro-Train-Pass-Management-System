package com.codegnan.metrotrainpass.model;


// MetroPass model represents a Pass applied by a student.

public class MetroPass {

    private int passId;
    private String studentName;
    private String passType;  // Weekly / Monthly / Quarterly
    private String validity;  // Example: 7 Days / 30 Days / 90 Days
    private String status;    // PENDING / APPROVED / REJECTED / EXPIRED

    // No-arg constructor
    public MetroPass() { }

    // Parameterized constructor
    public MetroPass(int passId, String studentName, String passType, String validity, String status) {
        this.passId = passId;
        this.studentName = studentName;
        this.passType = passType;
        this.validity = validity;
        this.status = status;
    }

    // Getters and setters
    public int getPassId() { return passId; }
    public void setPassId(int passId) { this.passId = passId; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getPassType() { return passType; }
    public void setPassType(String passType) { this.passType = passType; }

    public String getValidity() { return validity; }
    public void setValidity(String validity) { this.validity = validity; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "MetroPass [Pass ID = " + passId + ", Student Name = " + studentName +
                ", Pass Type = " + passType + ", Validity = " + validity + ", Status = " + status + "]";
    }
}
