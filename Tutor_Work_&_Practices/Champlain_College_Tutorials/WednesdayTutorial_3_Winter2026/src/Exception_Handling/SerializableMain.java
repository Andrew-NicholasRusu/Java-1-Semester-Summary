package Exception_Handling;

import java.io.*;

public class SerializableMain {
    public static void main(String[] args) {
        String fileName = "Objects.dat";

        BankAccount originalAccount = new BankAccount("Andrew", 25000.0, 1234);
        System.out.println("--- Original Object ---");
        System.out.println(originalAccount);
        System.out.println();

        try (FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(originalAccount);
            System.out.println("Success: Object Serialized and packed into: " + fileName);

        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
        System.out.println("--- Restored Object ---");

        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            BankAccount restoredAccount = (BankAccount)  ois.readObject();
            System.out.println(restoredAccount);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization Error: " + e.getMessage());
        }
    }
}
