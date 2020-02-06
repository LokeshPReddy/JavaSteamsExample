package com.lokhi.steams.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author LOKHI
 * 
 *  The Stream API is used to process collections of objects
 *
 */
public class JavaSteamsExample {

	public static void main(String[] args) {
		
		/**
		 * There are 3 different operations in Steams..
		 *
		 */
		// 1.Map
		/**
		 * The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
		 * following Example..
		 */
		List<Integer> numberList= Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> squareRooteofNumber= numberList.stream().map(x->x*x).collect(Collectors.toList()); 
		System.out.println("syso->"+squareRooteofNumber); // will print the square root of each number in numberList
		
		// 2.filter
		/**
		 * The filter method is used to select elements as per the Predicate passed as argument.
		 */
		
		List<String> stringList = Arrays.asList("Rama","Lokesh","Sitha", "Ntr", "Jeevan","Ravan", "Rajesh");
		List<String> filterList= stringList.stream().filter(s->s.startsWith("R")).collect(Collectors.toList()); // filtering above list whose name starts with R
		System.out.println("syso->"+filterList);
		
		//3.sorted
		
		/**
		 *  The sorted method is used to sort the stream.
		 */
		
		List<String> namesList = Arrays.asList("Reflection","Collection","Stream", "Java", "8");
		List<String> sortedList= namesList.stream().sorted().collect(Collectors.toList());
		System.out.println("syso->"+sortedList);
		
		// And there are 3 terminal operations.. 
		//1. Collect
		/**
		 * The collect method is used to return the result of the intermediate operations performed on the stream.
		 * all above examples are using collect
		 */
		//2. Foreach
		/**
		 * The forEach method is used to iterate through every element of the stream.
		 */
		//Example
		filterList.forEach(s->System.out.println(s));
		
		//3. reduce. 
		/**
		 * The reduce method is used to reduce the elements of a stream to a single value.
		   The reduce method takes a BinaryOperator as a parameter.
		 */

		int evenNum = numberList.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println("syso->"+evenNum);
	}
}
