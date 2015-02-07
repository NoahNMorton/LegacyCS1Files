package discountshopping;

import java.util.Scanner;

public class DiscountShopping {

    public static void main(String[] args) {

        int FinPrice = 0;
        int FinDis = 0;
        Scanner priceS = new Scanner(System.in);
        Scanner disS = new Scanner(System.in);
        int price;
        int dis;
        double total;

        do {
            System.out.println("Please enter a price. Enter 0 to start entering discounts.");
            price = priceS.nextInt();
            FinPrice += price;
        } while (price > 0);

        do {
            System.out.println("Please enter the amounts off. Enter 0 to calc.");
            dis = disS.nextInt();

            FinDis -= dis;
        } while (dis > 0);

        System.out.println("Subtotal is: $" + FinPrice);
        System.out.println("With a discount of " + FinDis + " Dollars off,");
        total = FinPrice + FinDis;
        System.out.println("Final total is: $" + total);

    }
}
