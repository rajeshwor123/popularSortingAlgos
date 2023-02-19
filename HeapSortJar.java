import java.util.ArrayList;
import java.util.Collections;


public class HeapSortJar {
    public static void maxHeapify(ArrayList<Integer> arr, int index, int heapSize){
     int leftNode = 2 * index;
     int rightNode = 2*index + 1;
     int largest = index;
     if(leftNode <= heapSize && arr.get(leftNode) > arr.get(largest) ){
         largest = leftNode;
     }
     if(rightNode <= heapSize && arr.get(rightNode) > arr.get(largest) ){
         largest = rightNode;
     }
     if(largest != index){
         Collections.swap(arr,index,largest);
         maxHeapify(arr,largest,heapSize);
     }
    }

    public static void buildMaxHeap(ArrayList<Integer> arr, int heapSize){
        for(int index = arr.size()/2; index>=0;index-- ){
            maxHeapify(arr,index,heapSize);
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(1);
        arr.add(2);

        int heapSize = arr.size()-1;
        buildMaxHeap(arr,heapSize);
        for(int j = arr.size()-1; j >= 1; j--){
            Collections.swap(arr,0, j);
            heapSize = heapSize -1;
            maxHeapify(arr,0, heapSize);
        }
        System.out.println(arr);
    }
}
