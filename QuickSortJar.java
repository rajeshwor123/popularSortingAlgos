import java.util.ArrayList;
public class QuickSortJar {
    public static void quickSort(ArrayList<Integer> arr, int head , int tail){
        if(head<tail){
            int pindex = partition(arr,head,tail);
            quickSort(arr, head , pindex-1);
            quickSort(arr, pindex+1, tail);
        }
    }

    public static int partition(ArrayList<Integer> arr, int head , int tail){
        int pivot = arr.get(tail);
        int pindex = head - 1;
        for(int i = head; i <= tail-1 ; i++){
            if(arr.get(i) <= pivot){
                pindex = pindex + 1;
                int temp = arr.get(i);
                arr.set(i,arr.get(pindex));
                arr.set(pindex,temp);
            }
        }
        int temp = arr.get(pindex+1);
        arr.set(pindex+1,arr.get(tail));
        arr.set(tail,temp);
        return(pindex+1);
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(1);
        arr.add(2);
        int head = 0 ;
        int tail = arr.size()-1;

        quickSort(arr, head, tail);
        System.out.println("quicksort"+arr);
    }
}
