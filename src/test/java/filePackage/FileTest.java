package filePackage;

import javafx.application.Application;
import org.apache.commons.io.IOUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileTest {

    @Test
    void testFile() {
        File file = new File("C:\\Users\\melik\\IntellijIdeaProjects\\MyMavenProject\\src\\main\\resources\\File.txt");
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println("File Exists: " + file.exists());
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());
            if (file.isFile()) {
                System.out.println("File size: " + file.length());
                System.out.println("File LastModified: " + file.lastModified());
            } else {
                for (File subfile : file.listFiles()) {
                    System.out.println("\t" + subfile.getName());
                }
            }
        }

    }

    @Test
    void readerTest() throws IOException {
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("File.txt");
        System.out.println(IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8));
    }

    @Test
    void readStream() throws IOException {
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("File.txt");
        System.out.println(IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8));

    }

    @Test
    void app(){

    }

    @Test
    void readStremInputFile() throws IOException { //read the whole file
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\melik\\IntellijIdeaProjects\\MyMavenProject\\src\\main\\resources\\File.txt");
        int i = 0;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
        fileInputStream.close();
    }

    @Test
    void createFileTest() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\testout.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        byte b[] = "Welcome to javaTpoint.".getBytes();
        bufferedOutputStream.write(b);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("success");
    }

    @Test
    void readerTest2() throws IOException {
        try (FileReader fileReader = new FileReader("C:\\Users\\melik\\IntellijIdeaProjects\\MyMavenProject\\src\\main\\resources\\File.txt")) {
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        }
    }

    @Test
    void bufferReaderTest() throws IOException {
        tesrBuffer().forEach(System.out::println);
        secondMethodPractice().forEach(System.out::println);
        tesing();

    }

    @Test
    void excelTest() throws IOException, InvalidFormatException {
      readExcelFile();
    }

    @Test
    void testPath() throws IOException {
        File file = new File(getClass().getClassLoader().getResource("File.txt").getFile());
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String test;
        while ((test = bufferedReader.readLine()) != null) {
            System.out.println(test);
        }
    }

    List<String> tesrBuffer() {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\melik\\IntellijIdeaProjects\\MyMavenProject\\src\\main\\resources\\File.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


    List<String> secondMethodPractice() throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("C:\\Users\\melik\\IntellijIdeaProjects\\MyMavenProject\\src\\main\\resources\\File.txt"))) {
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                list.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

void tesing() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(
                new FileReader("C:\\Users\\melik\\IntellijIdeaProjects\\MyMavenProject\\src\\main\\resources\\File.txt"))){
            int in=0;
            while((in = bufferedReader.read()) != -1){
                System.out.print((char)in);
            }
        }
}

void readExcelFile() throws IOException, InvalidFormatException {
    OPCPackage fs = OPCPackage.open(new File("D:\\Test\\excel.xlsx"));
    XSSFWorkbook wb = new XSSFWorkbook(fs);
    XSSFSheet sheet = wb.getSheetAt(0);
    XSSFRow row;
    XSSFCell cell;
    int rows; // No of rows
    rows = sheet.getPhysicalNumberOfRows();

    int cols = 0; // No of columns
    int tmp = 0;

    // This trick ensures that we get the data properly even if it doesn't start from first few rows
    for(int i = 0; i < 10 || i < rows; i++) {
        row = sheet.getRow(i);
        if(row != null) {
            tmp = sheet.getRow(i).getPhysicalNumberOfCells();
            if(tmp > cols) cols = tmp;
        }
    }

    for(int r = 0; r < rows; r++) {
        row = sheet.getRow(r);
        if(row != null) {
            for(int c = 0; c < cols; c++) {
                cell = row.getCell((short)c);
                if(cell != null) {
                    // Your code here
                }
            }
        }
    }
}




}
