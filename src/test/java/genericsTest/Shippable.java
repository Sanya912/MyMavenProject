package genericsTest;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Shippable implements Shipping<Shoes> {
    private static Shoes shoes;


    public void ship(Shoes shoes){

    }
List<?> list = new ArrayList<>();
    @Test
    void impleTestGenerics(){
//        ship(new Shoes("nike"));
//        ship(new Shoes("nikes"));
        ship(new Shoes("Nike",100));
        ship(new Shoes("Nike",1300));
        System.out.println(shoes.list);
//        ship(new Shoes(100));
    }


}
