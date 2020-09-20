import java.util.Random;


public class SearchingTester{
	public static void main(String args[]){
		final int LENGTH = 50;
		Random gen = new Random();
		int arr[] = new int[LENGTH];
		for(int i=0;i<LENGTH;i++){
			arr[i]=gen.nextInt(90)+10;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Searching s = new Searching();
		int target = gen.nextInt(30)+10;
		int n = s.binarySearch(arr,target);
		if(n > 0){
			System.out.println(target + " is found at index " + n);
		}else{
			System.out.println(target + " not found.");
		}
		
		n = s.recBinarySearch(0,arr.length-1,arr,target);
		if(n > 0){
			System.out.println(target + " is found at index " + n);
		}else{
			System.out.println(target + " not found.");
		}
		
		
	}
}