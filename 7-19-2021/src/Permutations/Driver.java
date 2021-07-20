package Permutations;
import java.util.Arrays;
/*
 
 Weekly Coding Challenge:

Given array of distinct integers, print all permutations of the array.
For example :
array : [10, 20, 30]

Permutations are :

[10, 20, 30]
[10, 30, 20]
[20, 10, 30]
[20, 30, 10]
[30, 10, 20]
[30, 20, 10]

Pick up an array of your choice and write the code that will print all the permutations.
 
 */

public class Driver {
	public static void main(String[] args) {
		int[] input = new int[args.length];
		for(int i = 0; i<args.length; i++){
			input[i] = Integer.parseInt(args[i]);
		}
		
		for(int i = 0; i<input.length; i++){
			int[] arr = input.clone();
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			recursiveArr(arr, 1);
			
		}
		
		
	}
	public static void recursiveArr(int[] arr, int index){
		System.out.println(Arrays.toString(arr));
		if(index<arr.length-1){
			int temp = arr[index];
			arr[index] = arr[index+1];
			arr[index+1] = temp;
			recursiveArr(arr, index+1);
		}
	}
}
