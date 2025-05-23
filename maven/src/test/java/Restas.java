import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Restas {
    @Test
    public void test1(){
        Response reponce= RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(reponce.getStatusCode());
        System.out.println(reponce.asString());
        System.out.println(reponce.getTime());
        System.out.println(reponce.getStatusLine());
        System.out.println(reponce.getHeader("content_type"));

        int statusCode = reponce.getStatusCode();

        Assert.assertEquals(statusCode,200);
    }
}
