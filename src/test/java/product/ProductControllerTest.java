//package product;
//
//import order.CreateOrderRequest;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.TestExecutionListeners;
//
//import static org.junit.Assert.assertEquals;
//
//public class ProductControllerTest {
//    @Before
//    StatementFactory statementFactory = new StatementFactory();
//    ProductDao productDao = new ProductDao(statementFactory.getObject());
//    ProductController productController = new ProductController(productDao);
//    private String testId = "14";
//
//    @Test
//    public void shouldGetProduct() {
//        ResponseEntity<GetProductResponse> response = productController.getProducts(testId);
//        assertEquals(response.getStatusCode(), HttpStatus.OK);
//    }
//
//    @Test
//    public void shouldListProducts() {
//        ResponseEntity<ListProductsResponse> response = productController.listProducts();
//        assertEquals(response.getStatusCode(), HttpStatus.OK);
//    }
//
//    @Test
//    public void shouldCreateProduct() {
//        ResponseEntity<CreateProductResponse> response = productController.createProduct(new CreateOrderRequest());
//        assertEquals(response.getStatusCode(), HttpStatus.CREATED);
//    }
//
//    @Test
//    public void shouldUpdateProduct() {
//        ResponseEntity<UpdateProductResponse> response = productController.updateProduct(testId, new UpdateProductRequest());
//        assertEquals(response.getStatusCode(), HttpStatus.OK);
//    }
//}
