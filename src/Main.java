public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Silk", 40,1,100.0);
        basket.add("Milk", 40,1,100.0);
        basket.print("Milk");
        System.out.println(basket.getTotalWeight());
    }
}
