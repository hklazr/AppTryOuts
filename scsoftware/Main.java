package assess.scsoftware;

public class Main {
    public static void main(String[] args) {
        
    Items item1 = new Items ("Apple");
    Items item2 = new Items ("Orange");
    Items item3 = new Items ("Pear");
    Items item4 = new Items ("Cat");

    ShoppingCart sc = new ShoppingCart(0);
    sc.addToCart (item1);
    System.out.println();
}
}
