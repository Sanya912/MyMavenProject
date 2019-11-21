package concurrencyRunnable;

import org.testng.annotations.Test;

public class RunnableTest implements Runnable{

    @Test
    void testRunnable(){
        System.out.println("ffff");

    }

    @Override
    public void run() {
        System.out.println("Ger");
    }
}
