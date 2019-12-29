package filePackage;

import org.testng.annotations.Test;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Scanner;

public class ConsoleSamplePrint {
    @Test
    void rText() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Test\\Leo.txt"));
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string);
        }
    }

    @Test
    void rText1() throws IOException {
        FileReader fileReader = new FileReader("D:\\Test\\Leo.txt");
        int i = 0;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
    }

    @Test
    void rText2() throws IOException {
        Scanner scanner = new Scanner(new File("D:\\Test\\Leo.txt"));
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }

    @Test
    void testPath() throws IOException {
        File file = new File(getClass().getClassLoader().getResource("File.txt").getFile());
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String test;
        while((test = bufferedReader.readLine()) != null){
            System.out.println(test);
        }


    }


}


