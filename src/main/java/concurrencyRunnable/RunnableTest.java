package concurrencyRunnable;

import org.testng.annotations.Test;

import java.lang.reflect.Executable;
import java.util.logging.Logger;

public class RunnableTest implements Runnable{


    @Test
    void testRunnable(){
        System.out.println("ffff");
        run();

    }

    @Override
    public void run() {
        System.out.println("Ger");
    }

    @Test
    void runnableTesting() {
        System.out.println("he");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("End");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("start407");
    }
}
