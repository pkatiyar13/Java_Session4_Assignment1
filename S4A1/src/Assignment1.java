
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numbers = {1,2,3,4,5,6,7,8,9};
		System.out.println("All the elements of array in correct order:");
		for(int i=0; i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println("\nAll the elements of array in reverse order:");
		for(int i=numbers.length-1;i>=0;i--){
			System.out.print(numbers[i]+" ");
		}
		
	}

}
