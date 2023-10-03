import java.util.Scanner;



public class Reverse {
    public static void main(String[] args) {

        //REVERSING NUMBER
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number to be reversed");
//        int num = input.nextInt();
//        int rev = 0;
//        while(num > 0)
//        {
//            int rem = num % 10;
//
//            rev = rev * 10 + rem;
//
//            num = num / 10;
//        }
//        System.out.println("Reversed number:"+" "+rev);

        // REVERSING STRING

        Scanner input = new Scanner(System.in);
        String str = input.next();

        String rev = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println("Original String:" + " "+str);
        System.out.println("Reversed String:" + " "+rev);
    }
}
