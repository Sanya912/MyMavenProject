package simpleTests;

import com.google.gson.internal.$Gson$Preconditions;
import net.minidev.json.JSONUtil;
import org.junit.Test;

import java.util.stream.IntStream;

public class MyTests {

    @Test
    public void testSplit() {
        String alexTest = "Alex test splitting";
        String[] splitA = alexTest.split(" ");
        for (int i = 0; i < splitA.length; i++) {
            System.out.print(splitA[i] + "+\n");
        }
        System.out.print(splitA[0]);
    }

    @Test
    public void testFormat(){
        System.out.println(sums(3,4,5,6,7));
        //Better way
        int[] listOfNumbers = {5,4,13,7,7,8,9,10,5,92,11,3,4,2,1};
        System.out.println(IntStream.of(listOfNumbers).sum());

    }

    int sums(int ...a){
        int total = 0;
        for(int num : a){
            total = num + total;
        }
        return total;
    }

    @Test
    public void testString(){
        String fi = "lop";
        String sec = "lopit";

        System.out.println(sec.replace(fi, ""));

    }



}
