import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a long int number: "+" ");
        long number = input.nextLong();
        System.out.println("Enter the digit you want to make it count:"+" ");
        int digit = input.nextInt();

        int count = 0;
        while(number > 0)
        {
            long remainder = number % 10;
            if(remainder == digit)
            {
                count += 1;
            }
            number = number / 10;
        }
        System.out.println(count + " "+ "times" +" "+ digit+" "+"occured");
    }

}
