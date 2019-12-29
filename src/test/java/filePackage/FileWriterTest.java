package filePackage;

import org.testng.annotations.Test;

import java.io.*;
import java.nio.file.Files;

public class FileWriterTest {

    @Test
    void fileWriterTesting() throws IOException {
        File file = new File("D:\\Test\\test\\test.xls");
        file.getParentFile().mkdir();
        PrintWriter printWriter = new PrintWriter(file);

    }

    @Test
    void typeFileWriter() throws IOException {
        File file = new File("D:\\Test\\tstCreation.txt");
        try(PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file)))){
            printWriter.print("Today's weather is : ");
            printWriter.println("Sunny");
            printWriter.println("Heee ");
            printWriter.print("On my WaY");
        }
    }

    @Test
    void secWriter() throws IOException {
        File file = new File("D:\\Test\\4secTest\\secTrTest\\ger\\gt\\tery\\living.xls");
        file.getParentFile().mkdirs();
        try(PrintWriter wr = new PrintWriter(new BufferedWriter(new FileWriter(file)))){
            wr.print("Here we go");
            wr.print("  MMMM");
        }

        //open and read file
        FileInputStream fileInputStream = new FileInputStream(file);
        int data =0;
        while((data = fileInputStream.read()) != -1 ){
            System.out.print((char)data);
        }
    }

    @Test
    void testObject() throws IOException, ClassNotFoundException { //bad
        ObjectOutputStream send = new ObjectOutputStream(new FileOutputStream("D:\\Test\\123tstCreation.txt"));
        send.writeShort(45889);
        send.flush();

        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("D:\\Test\\123tstCreation.txt"));
        System.out.println(obj.readShort());
        send.close();
        obj.close();
    }










    @Test
    void outTest() throws IOException {
try(PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("D:\\Test\\4.txt")))){
    printWriter.print("Hi again");
    }
try(FileInputStream fileInputStream = new FileInputStream(new File("D:\\Test\\4.txt"))){
    int te = 0;
    while((te= fileInputStream.read()) != -1){
        System.out.print((char)te);
    }

}
}











    }
