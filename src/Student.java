public class Student {
    private double gpa;
    private String major;
    private int creditHours;

    public double getGpa() {
        return this.gpa;
    }

    public String getMajor() {
        return this.major;
    }

    public int getCredits() {
        return this.creditHours;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setCredits(int credits) {
        this.creditHours = credits;
    }
}