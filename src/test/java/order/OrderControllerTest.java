//package order;
//
//import com.xiedaimala.shopping_cart.web.order.controller.OrderController;
//import com.xiedaimala.shopping_cart.web.order.view.CreateOrderRequest;
//import com.xiedaimala.shopping_cart.web.order.view.CreateOrderResponse;
//import org.junit.Test;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import static org.junit.Assert.assertEquals;
//
//public class OrderControllerTest {
//    private OrderController orderController = new OrderController();
//
//    @Test
//    public void shouldCreateOrder() {
//        ResponseEntity<CreateOrderResponse> response = orderController.createOrder(new CreateOrderRequest());
//        assertEquals(response.getStatusCode(), HttpStatus.CREATED);
//    }
//
//    @Test
//    public void shouldDeleeteOrder() {
//        ResponseEntity<DeleteOrderResponse> response = orderController.deleteOrder("134");
//        assertEquals(response.getStatusCode(), HttpStatus.OK);
//    }
//}
