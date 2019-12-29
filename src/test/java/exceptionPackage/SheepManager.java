package exceptionPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
public class SheepManager {

    private int sheepCount = 0;
    private void incrementAndReport() {
//        synchronized(this) { //same with and without
            System.out.print((++sheepCount)+" ");
//        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for(int i=0; i<10; i++)
                service.submit(manager::incrementAndReport);
        } finally {
            if(service != null) service.shutdown();
        }


        List<String> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList("45, 5,53,6")));
        System.out.println();
        list.forEach(System.out::print);

    }
}
