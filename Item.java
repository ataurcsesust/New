package Project;

import java.io.*;
import java.util.*;

public class Item implements Serializable {
    private String ItemName, ItemGroup;
    private int Itemid;
    private float ItemPrice;

    public static ArrayList<Item> ItemList = new ArrayList<Item>();
    static {
        // Initial Products
        ItemList.add(new Item("Laptop", "Electronics", 1, 55000));
        ItemList.add(new Item("Phone", "Electronics", 2, 25000));
        ItemList.add(new Item("Shirt", "Clothing", 3, 1500));
        ItemList.add(new Item("Shoes", "Footwear", 4, 2200));
        ItemList.add(new Item("Book", "Stationery", 5, 400));
        ItemList.add(new Item("Headphones", "Electronics", 6, 3000));
        ItemList.add(new Item("Watch", "Accessories", 7, 1500));
    }

    static Scanner in = new Scanner(System.in);
    static File f = new File("Item.dat");

    public Item(String ItemName, String ItemGroup, int Itemid, float ItemPrice) {
        this.ItemName = ItemName;
        this.ItemGroup = ItemGroup;
        this.Itemid = Itemid;
        this.ItemPrice = ItemPrice;
    }

    // Getters and Setters
    public String getItemName() { return ItemName; }
    public void setItemName(String itemName) { ItemName = itemName; }
    public String getItemGroup() { return ItemGroup; }
    public void setItemGroup(String itemGroup) { ItemGroup = itemGroup; }
    public int getItemid() { return Itemid; }
    public void setItemid(int itemid) { Itemid = itemid; }
    public float getItemPrice() { return ItemPrice; }
    public void setItemPrice(float itemPrice) { ItemPrice = itemPrice; }

    // View methods and file read/write logic as before (exactly your original)
}
