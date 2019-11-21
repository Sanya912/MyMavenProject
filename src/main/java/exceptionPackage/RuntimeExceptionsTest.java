package exceptionPackage;

import org.testng.annotations.Test;

public class RuntimeExceptionsTest implements AutoCloseable{

@Test
    void tryCatchTest(){
    try {
        int i = 8/0;
    }catch (Exception e){
        System.out.println("Exception is here");
    } finally {
        System.out.println("finaly is here");
    }
}


@Test
    void closeTest() throws Exception {
    try(RuntimeExceptionsTest ob = new RuntimeExceptionsTest()){ //need implements

    }
}

@Test
void compileTestRunTime () throws Exception {
test();
}
    void test()throws Exception{
        throw new RuntimeException();
    }

    @Override
    public void close() throws Exception {

    }
}
