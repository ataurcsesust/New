package Project;

import java.io.Serializable;

public class CheckOut implements Serializable {
    public static String Address = "";
    public static String Housenum = "";
    public static String State = "";
    public static String District = "";
    public static String Phoneno = "";
    public static String Pincode = "";

    public static void Details(String address, String housenum, String state, String district, String phoneno, String pincode) {
        Address = address;
        Housenum = housenum;
        State = state;
        District = district;
        Phoneno = phoneno;
        Pincode = pincode;
    }

    public static void PrintDetails() {
        System.out.println("Delivery Details:");
        System.out.println(Address + ", " + Housenum + ", " + District + ", " + State + ", " + Pincode + "\nPhone: " + Phoneno);
    }
}
