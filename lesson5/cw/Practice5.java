package lesson5.cw;

public class Practice5 {
	
public static void main(String[] args) {
		int[] arr = {5,8,9,3,0,1-7,8,-9,11};
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		int amountPos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				amountPos++;
			}
		}
		
		int amountNeg = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				amountNeg++;
			}
		}
		
		System.out.print(amountNeg);
	}

}
