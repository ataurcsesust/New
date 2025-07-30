package Project;

import java.io.Serializable;
import java.util.*;

public class Customer implements Serializable {
    public static ArrayList<Customer> CustomerList = new ArrayList<>();
    public String name;
    public String email;
    public int password;
    public int id;

    public Customer(String name, String email, int password, int id) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    // Registration and other methods as before
}
