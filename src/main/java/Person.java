import java.util.ArrayList;

public class Person {
    private String name;
    private int wallet;
    private ArrayList<Drink> drinks;

    
    public Person(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.drinks = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public void adjustWallet(int amount) {
        wallet = wallet + amount;
    }

    public int drinksCount() {
        return this.drinks.size();
    }

    public boolean sufficientFunds(Drink drink) {
        return this.wallet >= drink.getPrice();
    }

    public void addDrink(Drink drink) {
        this.drinks.add(drink);
    }

    public void buyDrink(Drink drink) {
        if (sufficientFunds(drink)) {
            addDrink(drink);
            adjustWallet(-drink.getPrice());
        }
    }
}
