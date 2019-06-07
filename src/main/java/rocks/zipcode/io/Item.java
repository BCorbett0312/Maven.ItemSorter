package rocks.zipcode.io;

import com.sun.tools.javac.util.Convert;

/**
 * @author leon on 30/01/2019.
 */
public class Item implements Comparable<Item>{
    Long id = 0L;
    String name = "";
    Double price = 0.01;

    public Item() {
    }

    public Item(Long id, String name, Double price) {
        this.id=id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {this.price=price;
    }

    public int compareTo(Item o) {
        if(this.id > o.id) return 1;
        if(this.id < o.id) return -1;
        else return 0;
    }
}
