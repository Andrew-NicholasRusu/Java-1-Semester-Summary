package Exception_Handling;

import java.io.*;
public class BinaryFileExceptionExample {

    public static void readBinaryFile(String filename) {
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream(filename))) {

            // reading binary data - multiple exceptions possible
            int intValue = dis.readInt(); // EOFException if file ends
            double doubleValue = dis.readDouble(); // EOFException possible
            String stringValue = dis.readUTF(); // UTFDataFormatException
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            System.out.println("Stack trace: " + e.getStackTrace()[0]);
        } catch (EOFException e) {
            System.out.println("Unexpected end of file: " + e.getMessage());
            // Handle partial data recovery
        } catch (UTFDataFormatException e) {
            System.out.println("Corrupt string data: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("General I/O error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readBinaryFile("data.bin");
    }
}
