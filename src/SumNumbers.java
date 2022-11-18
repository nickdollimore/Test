import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number to sum to: ");
        int sumTotal = 0;
        int sumTo = reader.nextInt();
        int nr = 1;
        while (nr <= sumTo)  {
            System.out.println(nr);
            sumTotal = nr +sumTotal;
            nr++;}
            System.out.print("sumTotal is "+sumTotal);
            System.out.print("\n");
        }
    }

