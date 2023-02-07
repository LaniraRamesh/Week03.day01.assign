package assignment01;

import java.util.Arrays;

public class MissingElements01 {
	public static void main(String[] args) {
		int[] arr= {1,2,4,5,7,6,8};
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<arr.length;i++) {
			j=i+1;
			
		if(arr[i]!=j) {
			System.out.println(j);
			break;
			
		}	
		}
		
	}

}
