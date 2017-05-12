import java.util.*;

public class Calculator
{
    public static void main(String[] args)
    {
        showMenu();   
    }

    public static void showMenu() {
        System.out.println("Simple Complex Number Calculator");
        System.out.println("Select an Operation");
    
        int selection = 0;
        Scanner input = new Scanner(System.in);
        
        while (selection < 1 || selection > 5) {
            System.out.println("1. add\n2. div\n3. mag\n4. ang\n5. Exit");
            selection = input.nextInt();
        }

        Numbers nums = getComplexValues(input);

        switch (selection) {
            case 1:
                add();
                break;
            case 2:
                div();
                break;
            case 3:
                mag();
                break;
            case 4:
                ang();
                break;
            case 5:
                System.out.println("Bye");
                break;
        }
    }

    public static Numbers getComplexValues(Scanner input) {
        Numbers nums = new Numbers();

        System.out.println("1st Complex Number: x+yi");
        System.out.println("2nd Complex Number: u+vi");

        System.out.println("What is the value of x?");
        nums.x = input.nextInt();

        System.out.println("What is the value of y?");
        nums.y = input.nextInt();

        System.out.println("What is the value of u?");
        nums.u = input.nextInt();

        System.out.println("What is the value of v?");
        nums.v = input.nextInt();

        return nums;
    }

    public static void add() {
         
    }

    public static void div() {
        
    }

    public static void mag() {
        
    }

    public static void ang() {
        
    }
}
