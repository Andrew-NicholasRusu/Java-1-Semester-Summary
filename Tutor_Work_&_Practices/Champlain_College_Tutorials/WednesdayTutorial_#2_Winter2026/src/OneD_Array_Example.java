import java.util.Random;

public class OneD_Array_Example {
    float[] arr = new float[5];

    public void setArray() {
        for (int i = 0; i < arr.length; i++) {
            Random rand = new Random();
            arr[i] = rand.nextFloat();
        }
    }

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        OneD_Array_Example a = new OneD_Array_Example();
        a.setArray();
        a.printArray();
    }
}

