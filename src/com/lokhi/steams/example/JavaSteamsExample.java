package com.lokhi.steams.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
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
		System.out.println(squareRooteofNumber); // will print the square root of each number in numberList
		
		// 2.filter
		/**
		 * The filter method is used to select elements as per the Predicate passed as argument.
		 */
		
		List<String> stringList = Arrays.asList("Rama","Lokesh","Sitha", "Ntr", "Jeevan","Ravan", "Rajesh");
		List<String> filterList= stringList.stream().filter(s->s.startsWith("R")).collect(Collectors.toList()); // filtering above list whose name starts with R
		System.out.println(filterList);
		
		//3.sorted
		
		/**
		 *  The sorted method is used to sort the stream.
		 */
		
		List<String> namesList = Arrays.asList("Reflection","Collection","Stream", "Java", "8");
		List<String> sortedList= namesList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
