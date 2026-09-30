import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    void shouldCalculateOrderTotal() {
        OrderService service = new OrderService();

        double result = service.calculateTotal(1000, 2);

        assertEquals(5000, result);
    }
}