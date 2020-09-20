import java.util.Random;

public class LListTester{
	public static void main(String args[]){
		Random gen = new Random();
		LList list = new LList();

		for(int i=0;i<30;i++){
			list.add(gen.nextInt(90)+10);
		}

		System.out.println(list);
		System.out.println(list.LLsize());

		list.selectionSort();
		System.out.println("\n" + list);
	}
}
