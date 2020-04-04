package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		
		ArrayList<String> list = new ArrayList<String>();
		
		//2. Add five Strings to your list
		
		list.add("asdf");
		list.add("edddsefe");
		list.add("ss");
		list.add("ded");
		list.add("asgbdf");
		
		//3. Print all the Strings using a standard for-loop
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		
		for(String str : list) {
			System.out.println(str);
		}
		
		//5. Print only the even numbered elements in the list.
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 0; i < 100; i++) {
			numbers.add((int) (Math.random() * 100));
		}
		
		System.out.print("\nAll even numbers: ");
		
		for(int number : numbers) {
			if(number % 2 == 0) {
				System.out.print(number + " ");
			}
		}
		System.out.print("\nAll even numbers reversed: ");
		//6. Print all the Strings in reverse order.
		
		for(int i = numbers.size() - 1; i >= 0; i--) {
			if((int) numbers.get(i) % 2 == 0) {
				System.out.print(numbers.get(i) + " ");
			}
		}
		
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.print("\nStrings with e: ");
		
		boolean noE = true;
		
		for(String str : list) {
			
			for(int i = 0; i < str.length(); i++) {
				
				if(str.charAt(i) == 'e') {
					System.out.print(str + " ");
					noE = false;
					break;
				}
				
			}
		}
		
		if(noE) {
			System.out.print("No 'e' can be found");
		}
	}
}
