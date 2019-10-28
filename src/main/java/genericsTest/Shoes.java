package genericsTest;

import java.util.ArrayList;
import java.util.List;

public class Shoes {
    String jordan;
    int price;
   static List<Shoes> list = new ArrayList<Shoes>();

    Shoes(){

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "jordan='" + getJordan() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

    Shoes(String jordan, int price){
        this.jordan=jordan;
        this.price=price;
        list.add(this);

    }

    public String getJordan() {
        return jordan;
    }

    public void setJordan(String jordan) {
        this.jordan = jordan;
    }
    public static String  getMe(){
        return "Good";
    }
}
