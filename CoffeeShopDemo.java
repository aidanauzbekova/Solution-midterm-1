import java.util.Scanner;

public class CoffeeShopDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Coffee Shop!");
        System.out.println("Choose your coffee base:");
        System.out.println("1. Espresso");
        System.out.println("2. Cappuccino");
        System.out.println("3. Latte");
        System.out.println("4. Americano");
        System.out.print("Enter choice: ");

        int coffeeChoice = scan.nextInt();
        scan.nextLine();

        String coffeeType = "";
        switch (coffeeChoice) {
            case 1: coffeeType = "espresso"; break;
            case 2: coffeeType = "cappuccino"; break;
            case 3: coffeeType = "latte"; break;
            case 4: coffeeType = "americano"; break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        Coffee coffee = CoffeeFactory.getCoffee(coffeeType);

        while (true) {
            System.out.println("\nWould you like to add extras?");
            System.out.println("1. Milk ($0.50)");
            System.out.println("2. Caramel Syrup ($0.75)");
            System.out.println("3. Whipped Cream ($1.00)");
            System.out.println("4. Chocolate Syrup ($0.80)");
            System.out.println("5. Finish Order");
            System.out.print("Enter choice: ");

            int addOnChoice = scan.nextInt();
            scan.nextLine();

            switch (addOnChoice) {
                case 1: coffee = new MilkDecorator(coffee); break;
                case 2: coffee = new CaramelDecorator(coffee); break;
                case 3: coffee = new WhippedCreamDecorator(coffee); break;
                case 4: coffee = new ChocolateDecorator(coffee); break;
                case 5:
                    System.out.println("\nYour final order: " + coffee.getDescription());
                    System.out.println("Total cost: $" + coffee.getCost());
                    System.out.println("Thank you for your order!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}