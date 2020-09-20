public class Sorting{
    public static void selectionSort(int arr[]){
        int n= arr.length;
        
        int min;
        int temp;
        
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    
    public static void insertionSort(int arr[]){
        int n = arr.length;
        int key, position;
        
        for(int i=1;i<n;i++){
            key=arr[i];
            position=i;
            
            while(position > 0 && key < arr[position-1]){
                arr[position]=arr[position-1];
                position--;
            }
            arr[position]=key;
        }
    }
}