package Project;

import java.io.*;
import java.util.*;

public class Administrator implements Serializable {
    public static ArrayList<Administrator> AdministratorList = new ArrayList<>();
    public String AdminName;
    public String adminemailid;
    public int AdminPassword;
    public int adminid;

    public Administrator(String AdminName, String adminemailid, int AdminPassword, int adminid) {
        this.AdminName = AdminName;
        this.adminemailid = adminemailid;
        this.AdminPassword = AdminPassword;
        this.adminid = adminid;
    }

    static File f = new File("Administrator.dat");
    static Scanner in = new Scanner(System.in);

    public static void writeto() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f))) {
            for (Administrator i : AdministratorList) {
                out.writeObject(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readfrom() {
        AdministratorList.clear();
        try (ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(f))) {
            while (true) {
                AdministratorList.add((Administrator) inStream.readObject());
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Other methods like login, edit, etc. same as original
}
