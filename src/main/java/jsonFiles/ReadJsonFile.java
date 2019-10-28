package jsonFiles;

import com.google.gson.JsonObject;
import com.jayway.jsonpath.JsonPath;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadJsonFile {

//    @Test
    void readJsonFile(){
        JSONParser jsonParser = new JSONParser();

        try (FileReader fileReader = new FileReader("C:\\Users\\melik\\OneDrive\\Desktop\\Test\\JsonTestData\\file1.json")){

            Object object = jsonParser.parse(fileReader);
            List<String> list = JsonPath.read(object, "$.Payload[*].Age");
            list.forEach(System.out::println);

//            JSONArray jsonArray = (JSONArray) object;
//            System.out.println(jsonArray.toJSONString());
//            jsonArray.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    void readFileFromProject() throws IOException {
//        File file = new File("C:\\Users\\melik\\IntellijIdeaProjects\\MyMavenProject\\src\\main\\resources\\File.txt");
//        Scanner scanner = new Scanner(file);
//        while (scanner.hasNext()){
//            System.out.println(scanner.nextLine());
//        }

        File path = new File("C:\\Users\\melik\\IntellijIdeaProjects\\MyMavenProject\\src\\main\\resources\\File.txt");
//        Path path = Paths.get("C:\\Users\\melik\\IntellijIdeaProjects\\MyMavenProject\\src\\main\\resources\\File.txt");
        Scanner scanner = new Scanner(path);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();




    }



}
