package pack1;


import java.util.ArrayList;

public class StudentClass {

    public static final int ACADEMIC = 0;
    public static final int PRE_AP = 1;
    public static final int AP = 2;

    private String className;
    private int type;
    private double majorWeight;
    private double otherWeight;
    private double minorWeight;
    private ArrayList<Assignment> assignments;


    public StudentClass(String className, int type) {
        this.className = className;
        this.type = type;
        if (type == ACADEMIC) {
            this.majorWeight = 0.55;
            this.otherWeight = 0.15;
            this.minorWeight = 0.3;
        } else if (type == PRE_AP) {
            this.majorWeight = 0.6;
            this.otherWeight = 0.1;
            this.minorWeight = 0.1;
        } else if (type == AP) {
            this.majorWeight = 0.7;
            this.otherWeight = 0.1;
            this.minorWeight = 0.2;
        }

        assignments = new ArrayList<Assignment>();

    }

    /**
     * Other
     * 15 aca
     * 10 pre ap
     * 10 ap
     * Minor
     * 30 aca
     * 30 pre ap
     * 20 ap
     * Major
     * 55 aca
     * 60 pre ap
     * 70 ap
     */


    public String getClassName() {
        return className;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public double getMajorWeight() {
        return majorWeight;
    }

    public double getMinorWeight() {
        return minorWeight;
    } //todo methods not used? should have used them somewhere else?

    public double getOtherWeight() {
        return otherWeight;
    }

    public double getType() {
        return type;
    }

    public void addAssignment(Assignment x) {
        assignments.add(x);
    }

    public double average() {

        return (minorAverage() * minorWeight) + (majorAverage() * majorWeight) + (otherAverage() * otherWeight);

    }

    public double minorAverage() {

        int minNum = 0;
        double minTotal = 0;

        for (int i = 0; i < assignments.size(); i++) {
            if (assignments.get(i).getCategory() == Assignment.MINOR) {
                minNum++;
                minTotal += assignments.get(i).getGrade();
            }
        }
        return minTotal / minNum;
    }

    public double majorAverage() {

        int majNum = 0;
        double majTotal = 0;


        for (int i = 0; i < assignments.size(); i++) {
            if (assignments.get(i).getCategory() == Assignment.MAJOR) {
                majNum++;
                majTotal += assignments.get(i).getGrade();
            }
        }
        return majTotal / majNum;
    }

    public double otherAverage() {
        int otherNum = 0;
        double otherTotal = 0;

        for (int i = 0; i < assignments.size(); i++) {
            if (assignments.get(i).getCategory() == Assignment.OTHER) {
                otherNum++;
                otherTotal += assignments.get(i).getGrade();
            }
        }

        return otherTotal / otherNum;
    }


}
