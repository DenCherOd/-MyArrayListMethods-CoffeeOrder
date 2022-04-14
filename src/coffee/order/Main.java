package coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Den");
        coffeeOrderBoard.deliver(1);
        coffeeOrderBoard.add("Kolya");
        coffeeOrderBoard.add("Nastya");
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.add("Sasha");
    }
}