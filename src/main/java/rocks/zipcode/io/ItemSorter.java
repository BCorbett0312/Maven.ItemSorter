package rocks.zipcode.io;


import java.util.Comparator;




/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] myList;
    public ItemSorter(Item[] items) {
        myList = items;

    }

    public Item[] sort(Comparator<Item> comparator) {
        for(int i = 0; i< myList.length;i++){
            for( int j = i; j>0; j--){
                if(comparator.compare(myList[j], myList[j-1])<0){
                    Item temp = myList[j];
                    myList[j] = myList[j-1];
                    myList[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
        return myList;
    }
}
