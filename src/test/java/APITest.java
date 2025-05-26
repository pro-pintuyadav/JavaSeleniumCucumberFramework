import com.prevails.Employee;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class APITest {
    @Test
    public void FirstAPITest()
    {
        Map<String,Object> emp=new HashMap<>();
        emp.put("name","PYadav");
        emp.put("designation","Manager");
        //Employee emp=new Employee("PName","Manager");
        given().header("Authorization","Bearer Token")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(emp)
                .when()
                .get("https://fake-json-api.mock.beeceptor.com/user")
                .then()
                .statusCode(200);
//                .and()
//                .body("data.name","Automation");
    }
}
