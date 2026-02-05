package FactoryDesign;

public class Duplicates {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 20, 12, 5, 12, 35 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
