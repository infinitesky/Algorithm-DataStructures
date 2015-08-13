package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,6,8,4,10,2, 7};
		
		insertSort(a);
		
		System.out.println(a);
		
		
	}
	
	public static void insertSort(int[] A){
		  for(int i = 1; i < A.length; i++){
		    int value = A[i];
		    int j = i - 1;
		    while(j >= 0 && A[j] > value){
		      A[j + 1] = A[j];
		      j = j - 1;
		    }
		    A[j + 1] = value;
		  }
		}

}
