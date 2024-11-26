import java.util.Scanner;

class TooLongException extends java.lang.Exception {
    public TooLongException(String message){
        super(message);
    }
}

class NegativeException extends java.lang.Exception {
    public NegativeException(String message1){
        super(message1);
    }
}

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        int choice;

        do {
            System.out.println("1.ADD");
            System.out.println("2.Subtract");
            System.out.println("3.divide");
            System.out.println("4.multiply");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();


            if (choice == 1) {
                try {
                    int c = a + b;
                    if (c > 1000) {
                        throw new TooLongException("Too long sum");
                    }
                    System.out.println("addition is: " + c);
                } catch (TooLongException e) {
                    System.out.println("Message: " + e.getMessage());
                }
            }
            else if(choice==2){
                try{
                    int c =a-b;
                    if(c<0){
                        throw new NegativeException("Answer is negative!");
                    }
                    System.out.println("Subtraction is: "+c);
                }
                catch (NegativeException e){
                    System.out.println("Message: "+ e.getMessage());
                }
            }

        }while(choice!=4);
    }
}