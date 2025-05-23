import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
public class restassured {

    @Test
    public void test1(){
        Response responce = get("https://reqres.in/api/users?page=2");

        System.out.println("Responce : "+responce.asString());
        System.out.println("Status code : "+responce.getStatusCode());
        System.out.println("Body : "+responce.getBody().asString());
        System.out.println("Time taken : "+responce.getTime());
        System.out.println("Header : "+responce.getHeader("contant_type"));
        int statuscode =responce.getStatusCode() ;
        Assert.assertEquals(statuscode,200);
    }
    @Test
    void test2(){
        baseURI="https://reqres.in/api";
        given().get("/users?page=2").then().
                statusCode(200).body("x.data[1]",equalTO(8));
    }
}
