
import java.util.Scanner;


public class IncomeTax {

    
    public static void main(String[] args) {
    Scanner conchoiceS = new Scanner(System.in);
    Scanner TempS = new Scanner(System.in);
    byte choice;
    double firstTemp=0;
    double secondTemp=0;
    
    System.out.println("Please enter your choice.");
    System.out.println("Choices:");
    System.out.println("1 For celcius to Fahrenhiet.");
    System.out.println("2 For Farenheit to Celcius.");
    choice = conchoiceS.nextByte();
    
    
    
    if(choice==1)
    {
        System.out.println("If so, then please enter the Celcius Temp.");
        firstTemp = TempS.nextDouble();
        
        secondTemp = (firstTemp*1.8)+32;
    }
    else if(choice==2)
    {
        System.out.println("If so, then please enter the Fahrenhiet Temp.");
        firstTemp = TempS.nextDouble();
        
        secondTemp = (firstTemp-32)/1.8; 
    }
        System.out.println("The final, new temp is: "+secondTemp);  
        
        
        
        
    }
}
