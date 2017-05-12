import java.util.*;
import java.lang.*;

/**
 * 
 */
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int selection = showMenu(input);
        handleSelection(input, selection);
    }

    // Shows the starting menu for the complex number calculator
    // Gives the user a number option menu for
    // add, div, mag and ang
    public static int showMenu(Scanner input) {
        System.out.println("Simple Complex Number Calculator");
        System.out.println("Select an Operation");
    
        int selection = 0;
        
        while (selection < 1 || selection > 5) {
            System.out.println("1. add\n2. div\n3. mag\n4. ang\n5. Exit");
            selection = input.nextInt();
        }

        return selection;
    }

    // Takes the selection entered by the user
    // Asks for the complex numbers to be entered
    // And calls the appropriate method
    public static void handleSelection(Scanner input, int selection) {
        Numbers nums;

        switch (selection) {
            case 1:
                nums = getComplexValues(input, true);
                add(nums);
                break;
            case 2:
                nums = getComplexValues(input, true);
                div(nums);
                break;
            case 3:
                nums = getComplexValues(input, false);
                mag(nums);
                break;
            case 4:
                nums = getComplexValues(input, false);
                ang(nums);
                break;
            case 5:
                System.out.println("Bye");
                break;
        }
    }

    // Gets the complex numbers entered in by the user
    // Uses the boolean to decide whether 1 or 2 complex numbers are needed
    // 1 complex number for mag & angle
    // 2 complex numbers for add & div
    // Returns an object of the entered numbers to be computed
    public static Numbers getComplexValues(Scanner input, Boolean needsTwo) {
        Numbers nums = new Numbers();

        System.out.println("1st Complex Number: x+yi");

        System.out.println("What is the value of x?");
        nums.x = input.nextDouble();

        System.out.println("What is the value of y?");
        nums.y = input.nextDouble();

        if (needsTwo) {
            System.out.println("2nd Complex Number: u+vi");
            System.out.println("What is the value of u?");
            nums.u = input.nextDouble();

            System.out.println("What is the value of v?");
            nums.v = input.nextDouble();
        }

        return nums;
    }

    // Adds complex numbers
    public static void add(Numbers nums) {
        double first = nums.x + nums.u;
        double second = nums.y + nums.v;

        System.out.printf("(%.1f + %.1fi) + (%.1f + %.1fi) = %.1f + %.1fi\n", nums.x, nums.y, nums.u, nums.v, first, second);
    }

    // Divides complex numbers
    public static void div(Numbers nums) {
        double firstNum = nums.x * nums.u + nums.y * nums.v;
        double firstDen = nums.u * nums.u + nums.v * nums.v;
        double secondNum = nums.y * nums.u + nums.x + nums.v;
        double secondDen = nums.u + nums.u + nums.v * nums.v;

        double firstResult = firstNum / firstDen;
        double secondResult = secondNum / secondDen;

        System.out.printf("(%.1f + %.1fi) / (%.1f + %.1fi) = %.1f + %.1fi\n", nums.x, nums.y, nums.u, nums.v, firstResult, secondResult);
    }

    // Takes the magnitude of a complex number
    public static void mag(Numbers nums) {
        double result = Math.sqrt(nums.x * nums.x + nums.y * nums.y);   

        System.out.printf("| (%.1f + %.1fi) | = %.1f\n", nums.x, nums.y, result);  
    }

    // Gets the angle of a complex number
    public static void ang(Numbers nums) {
        double result = Math.atan(nums.y / nums.x);
        System.out.printf("ang (%.1f + %.1fi) = %.1f\n", nums.x, nums.y, result); 
    }
}
