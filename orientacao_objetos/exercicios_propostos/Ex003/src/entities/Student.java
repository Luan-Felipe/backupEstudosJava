package entities;

public class Student {
    public String name;
    public double firstQuarterGrade;
    public double secondQuarterGrade;
    public double thirdQuarterGrade;
    public String passOrNot;

    public double calculeFinalGrade() {
        return firstQuarterGrade + secondQuarterGrade + thirdQuarterGrade;
    }

    public void isApproved() {
        if (calculeFinalGrade() >= 60.0) passOrNot = "PASS";
        else passOrNot = "FAILED";
    }

    public String toString(){
        if (passOrNot.equals("PASS")) return "FINAL GRADE = " + String.format("%.2f%n", calculeFinalGrade()) + passOrNot;
        else return "FINAL GRADE = " + String.format("%.2f%n", calculeFinalGrade()) + passOrNot + String.format("%nMISSING %.2f", (60 - calculeFinalGrade())) + " POINTS";
    }
}
