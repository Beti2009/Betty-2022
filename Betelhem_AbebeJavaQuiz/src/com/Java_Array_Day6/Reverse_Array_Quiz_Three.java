package com.Java_Array_Day6;

public class Reverse_Array_Quiz_Three {	
	public static void main(String[] args) {
				
		int[] array = new int[] {5,4,3,2,1};
		
		System.out.println();
		
		System.out.print("Reversed Array "+ "=");
		for(int i=array.length-1; i>=0; i--) 
		System.out.print(array[i] + " ");
		
		System.out.println();
		System.out.println();
		
		System.out.print("Non Reversed Array (Orginal)"+ "=");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
			
			
			
	}	
}

//-Write a method called reverse() with an int array as a parameter.
//-The method should not return any value. In other words, the method is allowed to
//modify the array parameter.
//-In main() test the reverse() method and print the array both reversed and nonreversed.
//-To reverse the array, you have to swap the elements, so that the first element is
//swapped with the last element and so on.
//-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2,1}.
//Tip:
//-Create a new console project with the name ‘ReverseArrayChallenge’