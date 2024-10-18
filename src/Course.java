public class Course {
    private String courseName;
    private String instructor;
    private int credits;

    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCredits() {
        return credits;
    }

    // Feature Envy: Course class is too focused on handling Student data
    public void assessStudentProgress(Student student) {
        System.out.println("Assessing student progress for " + student.getMajor());
        if (student.getGpa() >= 3.5) {
            System.out.println("Student is on the honor roll.");
        } else if (student.getGpa() < 2.0) {
            System.out.println("Student is on academic probation.");
        } else {
            System.out.println("Student is in good standing.");
        }

        if (student.getCredits() >= 120) {
            System.out.println("Student has enough credits to graduate.");
        } else {
            System.out.println("Student needs more credits to graduate.");
        }
    }

    public void enrollStudentInCourse(Student student) {
        System.out.println("Enrolling student with GPA: " + student.getGpa() + " in " + this.courseName);
        if (student.getCredits() >= this.credits) {
            System.out.println("Student has enough credits to take this course.");
        } else {
            System.out.println("Student does not have enough credits for this course.");
        }
    }
}