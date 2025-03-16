import java.util.Scanner;

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ExternalPaymentGateway externalGateway = new MockExternalGateway();

        while (true) {
            System.out.println("\nOnline Payment Gateway");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. Cryptocurrency");
            System.out.println("4. Exit");
            System.out.print("Select payment method: ");

            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 4) {
                System.out.println("Exiting Payment Gateway.");
                break;
            }

            System.out.print("Enter amount to pay: ");
            double amount = scan.nextDouble();
            scan.nextLine();

            String paymentType = "";
            switch (choice) {
                case 1:
                    paymentType = "creditcard";
                    break;
                case 2:
                    paymentType = "paypal";
                    break;
                case 3:
                    paymentType = "crypto";
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            PaymentMethod payment = PaymentFactory.getPaymentMethod(paymentType);
            PaymentAdapter adapter = new PaymentAdapter(payment, externalGateway);
            adapter.processPayment(amount);
        }
    }
}
