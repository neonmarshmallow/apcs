import java.util.Scanner;
import java.lang.Math;
public class Lab09i
{
    public static void main(String[] args)
    {
        //Everything that is commented out if from a previous attempt on making another algorithim for the lab.
        Scanner input = new Scanner(System.in);
        System.out.print("Base 10 number: ");
        int base10 = input.nextInt();
        System.out.print("Convert to base: ");
        int baseAny = input.nextInt();
        int num1, num2;
        int orgn = base10;
        //int i = 0;
        //int temp;
        //int xpnt = 0;
        //int inc = 1;
        String out1 = "";
        String out2 = "";

        while(base10 > 0)
        {
            num1 = base10 % baseAny;
            base10 = base10 / baseAny;

            switch(num1)
            {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    out2 = String.valueOf(num1);
                    break;
                case 10:
                    out2 = "A";
                    break;
                case 11:
                    out2 = "B";
                    break;
                case 12:
                    out2 = "C";
                    break;
                case 13:
                    out2 = "D";
                    break;
                case 14:
                    out2 = "E";
                    break;
                case 15:
                    out2 = "F";
                    break;
            }

            out1 = out2 + out1;
        }
        System.out.println(orgn + " base 10 is " + out1 + " in base " + baseAny);

        /* do
        {
            System.out.println(base10);
            System.out.println(i);
            i = (int) Math.pow(baseAny,xpnt);
            xpnt++;

            while(i < base10)
            {
                base10 -= (i * inc);
                inc++;
                System.out.println("minus " + base10);
            }
        }
        while(i < base10); */
    }
}