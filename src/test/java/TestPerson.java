import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {
    Person person;
    Drink beer;
    Bar bar;

    @Before
    public void before() {
        person = new Person("Jardine", 50);
        bar = new Bar(20);
        beer = new Drink("Beer", 4);
        bar.addDrink(beer);
    }

    @Test
    public void hasName() {
        assertEquals("Jardine", person.getName());
    }

    @Test
    public void hasFunds() {
        assertEquals(50, person.getWallet());
    }

    @Test
    public void doesNotHaveDrinks() {
        assertEquals(0, person.drinksCount());
    }

    @Test
    public void hasSufficientFunds() {
        assertEquals(true, person.sufficientFunds(beer));
    }

    @Test
    public void canAddDrink() {
        person.addDrink(beer);
        assertEquals(1, person.drinksCount());
    }


}
