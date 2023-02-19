import java.util.ArrayList;

public class InsertionJar {

    public static ArrayList<Integer> insertion(ArrayList<Integer> arr){
        for(int j = 1; j <= arr.size()-1; j++){
            int key = arr.get(j);
            int i = j - 1;
            while(i > 0 && arr.get(i) > key){
                arr.set(i+1,arr.get(i));
                i = i-1;
            }
            arr.set(i+1,key);
        }
        return arr;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(1);
        arr.add(2);

        System.out.println("insertionSort"+insertion(arr));

    }
}
