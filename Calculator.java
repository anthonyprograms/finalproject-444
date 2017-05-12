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

    public static void add() {

    }

    public static void div() {

    }

    public static void mag() {

    }

    public static void ang() {

    }
}
