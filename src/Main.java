import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double length = 0;
        double area = 0;
        double perimeter = 0;
        double hypotenuse = 0;
        String trash = "";

        System.out.print("\nEnter the width of the rectangle: ");
        if(in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.print("\nRun the program again and enter a valid input! " + trash + " Is a bad input!");
            System.exit(0);
        }

        System.out.print("\nEnter the Height of the rectangle: ");
        if(in.hasNextDouble())
        {
            length = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nRun the program again and enter a valid input! " + trash + " Is a bad input!");
            System.exit(0);
        }

        area = length * width;
        perimeter = (length *2 ) + (width * 2);

        System.out.println("\nThe area of the rectangle is " + area);
        System.out.println("\nThe perimeter of the rectangle is " + perimeter);

        hypotenuse = (length * length) + (width * width);
        System.out.println("\nThe Hypotenuse is " + Math.sqrt(hypotenuse));
    }
}