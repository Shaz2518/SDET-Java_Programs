package arrayBased_Programs;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[] = { 5, 10, 45, 80, 91 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
