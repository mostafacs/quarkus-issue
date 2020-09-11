//package demo.quarkus.product;
//
//import io.quarkus.test.junit.QuarkusTest;
//import org.junit.jupiter.api.Test;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.CoreMatchers.is;
//
//@QuarkusTest
//public class ProductTest {
//
//    @Test
//    public void testHelloEndpoint() {
//        given()
//          .when().get("/product")
//          .then()
//             .statusCode(200);
//             //.body(is("hello"));
//    }
//
//}