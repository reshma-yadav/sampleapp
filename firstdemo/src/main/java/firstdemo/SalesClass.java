package firstdemo;

public class SalesClass {

	public void display() {
		int[] arr= {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			System.out.println("Array Size:"+arr.length);
			
			
		}
			
	}
	
	public void print() {
		System.out.println("Print ALl Array Number:");
		display();
	}
}
