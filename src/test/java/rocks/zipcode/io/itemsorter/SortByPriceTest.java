package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;

import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;

import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {
    @Test
    public void test1(){
        Item item3 = new Item(0L, "Apple", 1.0);
        Item item2 = new Item(1L, "Banana", 6.5);
        Item item1 = new Item(2L, "Cherry", 2.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item1, item2};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        Item item1 = new Item(6L, "Harold", 70.5);
        Item item2 = new Item(3L, "Fluffy", 32.2);
        Item item3 = new Item(90L, "Wilbur", 84.1);
        Item[] itemsToSort = {item2, item3, item1};
        Item[] expected = {item2, item1, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = new PriceComparator();

        Item[] actual = itemSorter.sort(comparator);

        Assert.assertEquals(expected, actual);

    }



}
