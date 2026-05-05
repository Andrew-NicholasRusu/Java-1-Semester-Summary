public class TwoD_Array_Example {
    int[][] arr2D = new int[4][5];
    int count = 1;

    public void setArray() {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = count++;
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.println(arr2D[i][j]);
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        TwoD_Array_Example a = new TwoD_Array_Example();
        a.setArray();
        a.printArray();
    }
}