public class OrderService {

    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        OrderService service = new OrderService();

        double total = service.calculateTotal(1000, 2);

        System.out.println("Order total: " + total);
    }
}