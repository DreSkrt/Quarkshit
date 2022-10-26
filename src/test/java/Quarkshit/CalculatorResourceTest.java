package Quarkshit;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculatorResourceTest {

    @Test
    public void testCalculator() {
        given()
          .when().get("/Calculator/add/40/20")
          .then()
             .statusCode(200)
             .body(is("60"));
    }
    
}
