import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        int num = 7;
        //using while_loop
        int prev = 0;
        int curr = 1;
        int count = 2; // any number of which fibonacci number is to found out, must be more than 2
                       // if less than 2, then return n only, bcz fibo(1)=1, fibo(0)=0

        while( num >= count)
        {
            int temp = curr;
            curr = curr + prev;
            prev = temp;
            count++;
        }
        System.out.println(curr);
    }
}
