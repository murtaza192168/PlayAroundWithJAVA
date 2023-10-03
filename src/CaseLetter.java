import java.util.Scanner;

public class CaseLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        char ch = str.trim().charAt(1);
        // checking the case of the letters
        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println(ch +" " + "is a lowercase letter");
        }
        else {System.out.println(ch +" " + "is an Uppercase letter");}


       // System.out.println(ch);
    }
}
