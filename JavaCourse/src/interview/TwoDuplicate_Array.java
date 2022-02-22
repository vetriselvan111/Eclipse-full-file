package interview;

public class TwoDuplicate_Array {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {15,20,25,30};
		
		int[] arr2 = new int[] {15,30,45,49,50,12};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i]==arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
		}
			
		}
	}

