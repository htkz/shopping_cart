//package cart;
//
//import org.junit.Test;
//import org.springframework.http.HttpStatus;
//
//
//import static org.junit.Assert.assertEquals;
//
//public class CartControllerTest {
//    private CartController cartController = new CartController();
//
//    @Test
//    public void shouldGetCart() {
//        ResponseEntity<GetCartResponse> response = cartController.getCart("2431");
//        assertEquals(response.getStatusCode(), HttpStatus.OK);
//
//    }
//
//    @Test
//    public void shouldListCarts() {
//        ResponseEntity<ListCartResponse> response = cartController.listCarts();
//        assertEquals(response.getStatusCode(), HttpStatus.OK);
//    }
//
//    @Test
//    public void shouldUpdateCart() {
//        ResponseEntity<UpdateCartResponse> response = cartController.updateCart("43", new Cart());
//        assertEquals(response.getStatusCode(), HttpStatus.OK);
//    }
//}
