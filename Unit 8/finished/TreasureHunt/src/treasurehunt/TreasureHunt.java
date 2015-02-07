package treasurehunt;
import java.util.Scanner;
public class TreasureHunt {
    public static void main(String[] args) {
        String hunt;
        Scanner huntS = new Scanner(System.in);
        int startLoca;
        System.out.println("Please enter a string to search.");
        hunt = huntS.next();
        char[] huntArray = hunt.toCharArray();
        for (int i = 0; i < hunt.length(); i++) {
            if (huntArray[i] == 't' || huntArray[i] == 'T') {
                //System.out.println();
                System.out.println(hunt.indexOf('t'));
                startLoca = hunt.indexOf('t');
                if (startLoca == -1) {
                    System.out.println("Treasure not Found");
                } else {
                    System.out.println("Treasure was found at " + startLoca);
                }
            }
        }
    System.out.println("-1");
    }
}
