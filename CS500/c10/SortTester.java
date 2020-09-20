public class SortTester{
    public static void main(String args[]){
        int array[] = {64,25,12,22,11,36,1,9,23,54};

        Sorting.selectionSort(array);
        
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.print("\n");
        
        array = new int[]{64,25,12,22,11,36,1,9,23,54};
        
        Sorting.insertionSort(array);
        
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.print("\n");
    }
}