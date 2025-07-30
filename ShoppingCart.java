package Project;

import java.util.*;

public class ShoppingCart {
    public static ArrayList<Item> cartItems = new ArrayList<>();
    public static float total = 0;

    public static void AddToCart(Item i) {
        cartItems.add(i);
        total += i.getItemPrice();
    }

    public static void RemoveItem(int id) {
        Iterator<Item> iterator = cartItems.iterator();
        while (iterator.hasNext()) {
            Item i = iterator.next();
            if (i.getItemid() == id) {
                total -= i.getItemPrice();
                iterator.remove();
                break;
            }
        }
    }

    public static void ClearCart() {
        cartItems.clear();
        total = 0;
    }

    public static float TotalPrice() {
        total = 0;
        for (Item i : cartItems) {
            total += i.getItemPrice();
        }
        return total;
    }

    public static ArrayList<Item> getCartItems() {
        return cartItems;
    }
}
