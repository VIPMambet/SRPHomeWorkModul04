// Класс Order отвечает только за данные о заказе

// Класс для расчета цены
class PriceCalculator {
    public double calculateTotalPrice(Order order) {
        return order.getQuantity() * order.getPrice() * 0.9;
    }
}

// Класс для обработки платежей
class PaymentProcessor {
    public void processPayment(String paymentDetails) {
        System.out.println("Payment processed using: " + paymentDetails);
    }
}

// Класс для отправки уведомлений
class EmailNotifier {
    public void sendConfirmationEmail(String email) {
        System.out.println("Confirmation email sent to: " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Laptop", 1, 1000.00);

        PriceCalculator calculator = new PriceCalculator();
        double totalPrice = calculator.calculateTotalPrice(order);
        System.out.println("Total price: " + totalPrice);

        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("Credit Card");

        EmailNotifier notifier = new EmailNotifier();
        notifier.sendConfirmationEmail("customer@example.com");
    }
}
