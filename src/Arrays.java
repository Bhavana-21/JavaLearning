
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Prokarma";
		char charArray[] = s.toCharArray(); // {'p', 'r', o///}
		for (int i = 0; i< charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		
		System.out.println("");


		// Sorting array in ascending order
		int a[]= {3, 5, 2, 8, 1, 6, 4};
		int temp;
		for (int i = 0; i < a.length; i++) { // reading the array from starting to till length 
		
		for (int j = 1; j < a.length; j++) { // Starting from 1 position to compare from next element
				if(a[j-1] > a[j]) {
					// Swapping elements
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;					
				}
			}
		}

		for (int i = 0; i< a.length; i++) {
			System.out.print(a[i]+" ");
		}   
		
		System.out.println(" ");
		System.out.println(" ");
		
		// 2-D Array
		int x[][] = {{4,5}, {1,2,3}, {6, 7, 8, 9}};
		for( int i = 0;  i< x.length; i++) {
			
			for (int j = 0; j <x[i].length; j++) {
				
				System.out.print(x[i][j] + " ");
			}
			System.out.println(" ");
		}
		

	}
}
