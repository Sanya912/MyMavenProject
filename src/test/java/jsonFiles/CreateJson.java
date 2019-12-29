package jsonFiles;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.testng.annotations.Test;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJson {
    @Test(priority = 1)
    void createJsonFile() throws IOException {
        JSONObject jsonObject = new JSONObject();

        JSONObject jsonObject1 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        jsonObject1.put("Age", "28");
        jsonObject1.put("Sport","basketball");
        jsonObject1.put("Language","Java");
        jsonArray.add(jsonObject1);




        jsonObject.put("Array", jsonArray);

        try(FileWriter file =new FileWriter("C:\\Users\\melik\\OneDrive\\Desktop\\Test\\JsonTestData\\file1.txt")){
//            file.write(jsonObject.toJSONString());
            file.write(jsonObject.toJSONString());
            System.out.println("Json is copied");
            System.out.println("Json :\n "+ jsonObject);
        } catch (Exception e){
            new Throwable("Error during creation a json file");
    }

}
}
