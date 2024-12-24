import java.util.*;
class bubblesort {

	int i,j,temp;
	void sort(int a[]){
		for(i=0;i<a.length-1;i++){
			for(j=0;j<a.length-i-1;j++){
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		
		}
	
	System.out.println("Sorted list :");
        	
        	for (int e : a){
        		System.out.print(e+" ");
        	}
	
	}
}

public class bsort {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		bubblesort b = new bubblesort();
		System.out.print("size of array :");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter array elements:");
		for (int i = 0; i < a.length; i++) {
            		a[i] = sc.nextInt();
        	}
        	b.sort(a);
        	
	}
}
