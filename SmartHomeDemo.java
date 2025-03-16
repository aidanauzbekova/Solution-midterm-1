import java.util.Scanner;

public class SmartHomeDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SmartHomeController controller = new SmartHomeController();
        SmartHomeFactory factory = new BasicSmartHomeFactory();

        while (true) {
            System.out.println("\nSmart Home Control System");
            System.out.println("1. Add Light");
            System.out.println("2. Add Thermostat");
            System.out.println("3. Add Security System");
            System.out.println("4. Turn ON all devices");
            System.out.println("5. Turn OFF all devices");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Light Name: ");
                    String lightName = scan.nextLine();
                    controller.addDevice(factory.createLight(lightName));
                    System.out.println("Light added.");
                    break;
                case 2:
                    System.out.print("Enter Thermostat Name: ");
                    String thermostatName = scan.nextLine();
                    controller.addDevice(factory.createThermostat(thermostatName));
                    System.out.println("Thermostat added.");
                    break;
                case 3:
                    controller.addDevice(new SecuritySystemAdapter(new LegacySecuritySystem()));
                    System.out.println("Security System added.");
                    break;
                case 4:
                    controller.turnAllOn();
                    break;
                case 5:
                    controller.turnAllOff();
                    break;
                case 6:
                    System.out.println("Exiting Smart Home System.");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
