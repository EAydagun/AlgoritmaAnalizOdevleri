package alg;


import java.util.Date;
import java.util.Random;

public class algoritmalar {
	
	private double swap;
	private double comparison;
	
	public algoritmalar(){
		this.comparison=0;
		this.swap=0;
	}
	
	private double getComparison(){
		return comparison;
	}
	   
	private double getSwap(){
		return swap;
	}
	
	private void ALG_BubbleSort(int[] array){
		
		for (int i =array.length-1; i>0; i--) {
			for(int j=0;j<i;j++){
				int temp;
				if(array[j]>array[j+1]){
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
					swap++;
				}
				comparison++;
			}
		}
	}
	private int[] ALG_InsertionSort(int[] array){
		 int j;           
	     int temp;                
	     int i;  

	     for (j = 1; j < array.length; j++)    
	    {
	           temp = array[ j ];
	           for(i = j - 1; i >= 0; i--) 
	          {
	        	   if(array[ i ] < temp){
	        		   array[ i+1 ] = array[ i ];
	        		   swap++;
	        	   }
	        	   comparison++;
	                
	          }
	         array[ i+1 ] = temp;
	     }
	     return array;
	}
public  void ALG_QuickSort(int[] arr, int low, int high) {
		
		
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
				comparison++;
			}
 
			while (arr[j] > pivot) {
				j--;
				comparison++;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
				swap++;
			}
			comparison++;
		}
 
		
		if (low < j){
			ALG_QuickSort(arr, low, j);
			comparison++;
		}
			
 
		if (high > i){
			ALG_QuickSort(arr, i, high);
			comparison++;
		}
		
	}
private void  ALG_SelectionSort(int array[]){
	
	for (int i = 0; i < array.length-1; i++) {
		int en_kucuk_index=i;
		for (int j = i+1; j < array.length; j++) {
			if(array[j]<array[en_kucuk_index]){
				en_kucuk_index=j;
				comparison++;
			}
		}
		if(en_kucuk_index!=i){
			int temp=array[i];
			array[i]=array[en_kucuk_index];
			array[en_kucuk_index]=temp;
			swap++;
			comparison++;
		}
		
		
	}
}
	public static void main(String[] args) {
		int lenght=100;
		System.out.println("BUBBLE SORT");
		
		for(int i=0;i<10;i++){
			Random r=new Random();
			int[] array=new int[lenght];
			for (int j = 0; j < array.length; j++) {
				array[j]=r.nextInt();
			}
			
			algoritmalar s=new algoritmalar();
			s.ALG_BubbleSort(array);

			
			System.out.println(lenght+"       "+s.getComparison()+"               "
					+ "      "+s.getSwap()+"         ");
			
			lenght*=2;
		}
	
		System.out.println("Insertion SORT");
		
		for(int i=0;i<10;i++){
			Random r=new Random();
			int[] array=new int[lenght];
			for (int j = 0; j < array.length; j++) {
				array[j]=r.nextInt();
			}
			algoritmalar in=new algoritmalar();
			in.ALG_InsertionSort(array);
			
			System.out.println(lenght+"       "+in.getComparison()+"               "
					+ "      "+in.getSwap()+"         ");
			
			lenght*=2;
		}
		
		System.out.println("Quick SORT");
	
		for(int i=0;i<10;i++){
			Random r=new Random();
			int[] array=new int[lenght];
			for (int j = 0; j < array.length; j++) {
				array[j]=r.nextInt();
			}
			
			algoritmalar quick=new algoritmalar();
			quick.ALG_QuickSort(array, 0, array.length-1);
			

			System.out.println(lenght+"       "+quick.getComparison()+"               "
					+ "      "+quick.getSwap()+"         ");
			
			lenght*=2;
		}
		System.out.println("SELECTION SORT");
		
		for(int i=0;i<10;i++){
			Random r=new Random();
			int[] array=new int[lenght];
			for (int j = 0; j < array.length; j++) {
				array[j]=r.nextInt();
			}
			
			algoritmalar sel=new algoritmalar();
			sel.ALG_SelectionSort(array);
			
			
			System.out.println(lenght+"       "+sel.getComparison()+"               "
					+ "      "+sel.getSwap()+"         ");
			
			lenght*=2;
		}


	
	}
}
