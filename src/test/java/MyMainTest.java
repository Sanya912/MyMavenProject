import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class MyMainTest {



    public static void main(String[] args) {
        String json = "{\"key1\":\"value1\",\"key2\":\"value2\",\"key3\":\"value3\"}";

        DocumentContext parse = JsonPath.parse(json);
        System.out.println(parse.jsonString());
    }
}