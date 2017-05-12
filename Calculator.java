import java.util.*;
import java.lang.*;

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
                add(nums);
                break;
            case 2:
                div(nums);
                break;
            case 3:
                mag(nums);
                break;
            case 4:
                ang(nums);
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
        nums.x = input.nextDouble();

        System.out.println("What is the value of y?");
        nums.y = input.nextDouble();

        System.out.println("What is the value of u?");
        nums.u = input.nextDouble();

        System.out.println("What is the value of v?");
        nums.v = input.nextDouble();

        return nums;
    }

    public static void add(Numbers nums) {
        double first = nums.x + nums.u;
        double second = nums.y + nums.v;

        System.out.printf("( %.1f + %.1f i ) + ( %.1f + %.1f i ) = %.1f + %.1f i\n", nums.x, nums.y, nums.u, nums.v, first, second);
    }

    public static void div(Numbers nums) {
        
    }

    public static void mag(Numbers nums) {
        double result = Math.sqrt(nums.x * nums.x + nums.y * nums.y);   

        System.out.printf("| ( %.1f + %.1f i ) | = %.1f\n", nums.x, nums.y, result);  
    }

    public static void ang(Numbers nums) {
        
    }
}
