import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBar {
    Drink beer;
    Bar bar;
    Person person;

    @Before
    public void before() {
        bar = new Bar(20);
        beer = new Drink("Beer", 4);
        bar.addDrink(beer);
        person = new Person("Jardine", 50);
    }


    @Test
    public void barIsntFull() {
        assertEquals(false, bar.isFull());
    }

    @Test
    public void canAddDrink() {
        assertEquals(1, bar.getStockCount());
    }

    @Test
    public void canRemoveDrink() {
        assertEquals(1, bar.getStockCount());
        bar.removeDrink(beer);
        assertEquals(0, bar.getStockCount());
    }

    @Test
    public void returnRemovedDrink() {
        Drink removed = bar.removeDrink(beer);
        assertEquals(removed, beer);
    }

    @Test
    public void testHasItem() {
        assertEquals(true, bar.hasItem(beer));
    }

    @Test
    public void testServe() {
        bar.serve(person, beer);
        assertEquals(0, bar.getStockCount());
        assertEquals(1, person.drinksCount());
        assertEquals(46, person.getWallet());
    }


}
