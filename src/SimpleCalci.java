import java.util.Scanner;

public class SimpleCalci {
    //without Switch

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int result = 0;
        while(true)

        {
            System.out.println("Enter values for calculaion: ");
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            System.out.println("Enter Operator:");
            char operator = input.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%')
            {
               if(operator == '+')
               {
                   result = n1 + n2;
               }
               if (operator == '-')
               {
                   result = n1 - n2;
               }
               if(operator == '*')
               {
                   result = n1 + n2;
               }
               if(operator == '/')
               {
                   if(n2 != 0)
                   {result = n1 / n2;}
               }
               if(operator == '%')
               {
                   result = n1 % n2;
               }
            }
            else if(operator == 'X' || operator == 'x')
            {
                break;
            }
            else{
                System.out.println("Invalid operator entered. Please try again!");
            }
            System.out.println(result);
        }
    }
}
