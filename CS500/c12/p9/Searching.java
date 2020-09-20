public class Searching{
	public int linearSearch(int arr[], int x){
		int n = arr.length;
		for(int index=0;index<n;index++){
			if(arr[index]==x){
				return index;
			}
		}
		return -1;
	}
	
	public int binarySearch(int arr[], int x){
		int min=0,max=arr.length-1,mid=0;
		
		while(min<=max){
			mid=min+(max-min)/2;
			if(arr[mid]==x){
				return mid;
			}
			
			if(arr[mid] < x){
				min=mid+1;
			}else{
				max=mid-1;
			}
		}
		return -1;
	}
	
	public int recBinarySearch(int min, int max, int arr[], int target){
		if(min<=max){
			int mid = min+(max-min)/2;
			
			if(target == arr[mid]){
				return mid;
			}
			
			if(target < arr[mid]){
				return recBinarySearch(min, mid-1, arr, target);
			}
			
			return recBinarySearch(mid+1, max, arr, target);
		}
		return -1;
	}
}