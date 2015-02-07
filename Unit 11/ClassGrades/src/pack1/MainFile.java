package pack1;


import java.util.Scanner;

public class MainFile {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);


        System.out.println("Class name?");
        String cName = imput.nextLine();
        System.out.println("Class type? 0 for Academic, 1 for PRE_AP, 2 for AP.");
        int type = imput.nextInt();



        StudentClass stu = new StudentClass(cName, type);

        while (true) {


            System.out.println("Menu: \n1: Add Assignment \n2: Remove Assignment \n3: Modify assignment \n4: View class info \n5: Exeunt ");
            byte choice = imput.nextByte();


            if (choice == 1) //add assignment
            {
                System.out.println("Enter the name of the assignment:"); //todo program not pausing to enter name
                String name = imput.next();
                System.out.println("Enter the grade.");
                double grade = imput.nextDouble();
                System.out.println("Please enter the category. 0 for Other, 1 for Minor, 2 for Major.");
                int category = imput.nextInt();
                stu.addAssignment(new Assignment(name, grade, category));

            } else if (choice == 2) { //remove assignment
                for (int w = 0; w < stu.getAssignments().size(); w++) {
                    System.out.println(w + ": " + stu.getAssignments().get(w).toString());
                }


                System.out.println("Please select an assignment to remove. Give the index.");
                byte removeIndex = imput.nextByte();

                stu.getAssignments().remove(removeIndex);

                System.out.println("Removed.");

            } else if (choice == 3) { //modify assignment
               

                for (int m = 0; m < stu.getAssignments().size(); m++) {
                    System.out.println(m + ": " + stu.getAssignments().get(m).toString());
                }

                System.out.println("Please select an assignment to change. Give the index, starting from 0.");
                byte index = imput.nextByte();

                System.out.println("What do you want to change.");
                System.out.println("1: Name \n 2: Grade \n 3: Category \n 4: Cancel");
                byte changeChoice = imput.nextByte();

                if (changeChoice == 1) {
                    System.out.println("Name to change to?");
                    String newName = imput.nextLine();

                    stu.getAssignments().get(index).setAssignmentName(newName);
                } else if (changeChoice == 2) {
                    System.out.println("Grade to change to?");
                    double newGrade = imput.nextDouble();
                    stu.getAssignments().get(index).setGrade(newGrade);

                } else if (changeChoice == 3) {
                    System.out.println("Category to change to? Enter 0 for Academic, 1 for Pre AP, 2 for AP.");
                    byte newCategory = imput.nextByte();
                    stu.getAssignments().get(index).setCategory(newCategory);

                } else {
                    System.out.println("Cancelling...");
                    //nothing
                }


            } else if (choice == 4) { //class info
                System.out.println("Class Name: " + stu.getClassName());

                System.out.println("Minor Grades:");
                for (int p = 0; p < stu.getAssignments().size(); p++) {
                    if (stu.getAssignments().get(p).getCategory() == Assignment.MINOR) {
                        System.out.println(stu.getAssignments().get(p));
                    }

                }
                System.out.print("Minor Average: ");
                System.out.println(stu.minorAverage());


                System.out.println("Major Grades:");
                for (int p = 0; p < stu.getAssignments().size(); p++) {
                    if (stu.getAssignments().get(p).getCategory() == Assignment.MAJOR) {
                        System.out.println(stu.getAssignments().get(p));
                    }

                }
                System.out.print("Major Average: ");
                System.out.println(stu.majorAverage());

                System.out.println("Other Grades:");
                for (int p = 0; p < stu.getAssignments().size(); p++) {
                    if (stu.getAssignments().get(p).getCategory() == Assignment.OTHER) {
                        System.out.println(stu.getAssignments().get(p));
                    }

                }
                System.out.print("Other Average: ");
                System.out.println(stu.otherAverage());

                System.out.print("Overall Average: ");
                System.out.println(stu.average());

            } else if (choice == 5) {
                System.exit(0);
            } else {
                System.err.println("Error: Invalid");
            }


        }
    }

}
