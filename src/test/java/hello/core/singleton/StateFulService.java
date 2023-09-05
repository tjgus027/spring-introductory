package hello.core.singleton;

public class StateFulService {
    private int price;

    void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price;
    }

    int getPrice(){
        return price;
    }
}
