package jacksonMapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JacksonMaps {
ObjectMapper objectMapper = new ObjectMapper();
    JsonNode jsonNode;

Stream<String> stre() throws IOException {
    return Files.lines(Paths.get("C:\\Users\\melik\\OneDrive\\Desktop\\Test\\jsonTest"));
}
//    Stream<String > metObjj() throws IOException {
//
//       return  stre().map(s -> {
//            try {
//                objectMapper.writeValue(s);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return Stream.empty();
//        }).collect(Collectors.toList());
//    }

    @Test
    void mapper() throws IOException {
        stre().forEach(System.out::println);

    }
}
