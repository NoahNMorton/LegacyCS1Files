package pack1;


public class Assignment {

    public static final int OTHER = 0;
    public static final int MINOR = 1;
    public static final int MAJOR = 2;
    private String assignmentName;
    private double grade;
    private int category;

    public Assignment(String assignmentName, double grade, int category) {
        this.assignmentName = assignmentName;
        this.grade = grade;
        this.category = category;
    }

    public String getAssignmentName() {
        return assignmentName;
    } //todo * method not needed?

    public int getCategory() {
        return category;
    }

    public double getGrade() {
        return grade;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        String categoryS = null;
        if (category == MAJOR) {
            categoryS = "Major";
        } else if (category == MINOR) {
            categoryS = "Minor";
        } else if (category == OTHER) {
            categoryS = "Other";
        }

        return "Assignment Name: " + assignmentName + "\nAssignment Score: " + grade + "\nAssignment Type: " + categoryS;

    }

}
