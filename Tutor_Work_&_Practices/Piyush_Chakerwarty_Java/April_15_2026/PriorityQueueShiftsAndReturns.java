import java.util.*;

public class PriorityQueueShiftsAndReturns {
    // Use PriorityQueues for Priority-based ordering
    // PriorityQueue Time Complexities:
        // O(1) for offer/poll/peek (most implementations)

    // Return index of parent of the node at index i
    static int parent(int i) {
        return (i - 1) / 2;
    }

    // Return index of left child
    static int leftChild(int i) {
        return 2 * i + 1;
    }

    // Return index of right child
    static int rightChild (int i) {
        return 2 * i + 2;
    }

    // Shift up to maintain max-heap property
    static void shiftUp (int i, ArrayList<Integer> arr) {
        while (i > 0 && arr.get(parent(i)) < arr.get(i)) {
            Collections.swap(arr, parent(i), i);
            i = parent(i);
        }
    }

    // Shift down to maintain max-heap property
    static void shiftDown(int i, ArrayList<Integer> arr, int size) {
        int maxIndex = i;
        int l = leftChild(i);
        if (l < size && arr.get(1) > arr.get(maxIndex)) maxIndex = l;
        int r = rightChild(i);
        if (r < size && arr.get(r) > arr.get(maxIndex)) maxIndex = r;

        if (i != maxIndex) {
            Collections.swap(arr, i, maxIndex);
            shiftDown(maxIndex, arr, size);
        }
    }

    // Insert a new element
    static void insert (int p, ArrayList<Integer> arr) {
        arr.add(p);
        shiftUp(arr.size() - 1, arr);
    }

    // Extract element with maximum priority
    static int pop(ArrayList<Integer> arr) {
        int size = arr.size();
        if (size == 0)
            return -1;
        int result = arr.get(0);
        arr.set(0, arr.get(size - 1));
        arr.remove(size - 1);
        shiftDown(0, arr, arr.size());
        return result;
    }

    // Get current maximum element
    static int getMax(ArrayList<Integer> arr) {
        if (arr.isEmpty())
            return - 1;
        return arr.get(0);
    }

    // Print heap
    static void printHeap(ArrayList<Integer> arr) {
        for (int x : arr)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> pq = new ArrayList<>(); // pq = name 

        insert(45, pq);
        insert(20, pq);
        insert(14, pq);
        insert(12, pq);
        insert(31, pq);
        insert(7, pq);
        insert(11, pq);
        insert(13, pq);
        insert(7, pq);

        System.out.print("Priority Queue after inserts: ");
        printHeap(pq);

        // Demonstrate getMax
        System.out.println("Current max element: " + getMax(pq));

        // Demonstrate extractMax
        pop(pq);
        System.out.println("Priority Queue after extracting max: ");
        printHeap(pq);
    }
}
