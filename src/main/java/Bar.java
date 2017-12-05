import java.util.ArrayList;

public class Bar {
    private ArrayList<Drink> stock;
    private int capacity;

    public Bar(int capacity) {
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public boolean isFull() {
        return getStockCount() >= capacity;
    }

    public void addDrink(Drink drink) {
        this.stock.add(drink);
    }

    public Drink removeDrink(Drink drink) {
        int index = stock.indexOf(drink);
        return this.stock.remove(index);
    }

    public boolean hasItem(Drink drink) {
        return this.stock.contains(drink);
    }

    public void serve(Person customer, Drink drink) {
        if (hasItem(drink)) {
            removeDrink(drink);
            customer.buyDrink(drink);
        }
    }
}
