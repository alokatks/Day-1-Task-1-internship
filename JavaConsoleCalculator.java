import java.util.Scanner;//mendatroy to use scannner and taking input

public class JavaConsoleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a simple Java calculator.");
        boolean running = true;//defining running here
        while (running) {
            System.out.println("Choose an operation you want to perform:");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("5 - Exit calculator");
            System.out.print("Please enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 5) { //ending pointy oc calculator
                running = false;
                System.out.println("You pressed 5: Goodbye! Visit again.");
                break;
            }

            System.out.print("Please enter your first number: ");
            double number1 = sc.nextDouble();//taking input of first number
            System.out.print("Please enter your second number: ");
            double number2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(number1, number2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(number1, number2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(number1, number2));
                    break;
                case 4:
                    if (number2 == 0) { //here we handle satuation when nemurator is 0
                        System.out.println("Error: Division by zero!");
                    } else {
                        System.out.println("Result: " + divide(number1, number2));
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
    }

