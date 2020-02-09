import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;

public class CsvTest {
    @Test
    void testCsv() throws IOException {
        try (FileWriter fileWriter = new FileWriter("D:\\myTest.csv")) {
            fileWriter.append("Hi thereS");
            fileWriter.append(",");
            fileWriter.append("sec");
            fileWriter.append("\n");
            fileWriter.append("secLine");
            fileWriter.append("\n");
            fileWriter.append("Leo");
            fileWriter.flush();
        }
    }
}
