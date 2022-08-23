package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class streams {

	static ArrayList<String> names = new ArrayList<String>();
	static ArrayList<String> names1 = new ArrayList<String>();
	
	public static void withoutStreams() {
		
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alpha");
		names.add("Adam");
		names.add("Rams");
		int count = 0;
		
		for(int i =0 ;i<names.size()-1;i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count = count + 1;
			}
		}
		System.out.println("names starts with A:"+ count);

	}
	
	public static void usingStreamsFilter() {
	
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alpha");
		names.add("Adam");
		names.add("Rams");
		
	Long count =	names.stream().filter(param -> param.startsWith("A")).count();
	System.out.println("count::" + count);

/*	
	Stream.of("Abhijeet","Don","Alpha","Adam","Rams").filter(param ->
	{
	param.startsWith("A");
	}).count();	
	
*/	
// print all the names in arraylist without using loop
	
//	Stream.of("Abhijeet","Don","Alpha","Adam","Rams").filter(s -> s.length()>4).forEach(s -> System.out.println(s));
	
// to get only the first name which has length>4
	
	Stream.of("Abhijeet","Don","Alpha","Adam","Rams").filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println(s));
	
	}
	
	public static void streamMap()
	{
   // to make the filtered results in upper case
		
		Stream.of("Abhijeet","Don","Alpha","Adam","Rams").filter(s -> s.endsWith("t")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
	}
	
	
	public static void sortfilter()

	{
		Stream.of("Asbhijeet","Don","Alpha","Adam","Rams").filter(s -> s.startsWith("A")).sorted().forEach(s -> System.out.println(s));
		
	}
	
	public static void mergeStream()

	{
		names.add("haoi");
		names.add("liiuio");
		
		names1.add("ioi");
		names1.add("iiiyyy");
		
		Stream.concat(names.stream(), names1.stream()).forEach(s -> System.out.println(s));
		
		
	}
	
	public static void checkInStream()
	{
		names.add("haoi");
		names.add("liiuio");
	boolean b =	names.stream().anyMatch(s -> s.equalsIgnoreCase("HaOI"));
	System.out.println(b);
	Assert.assertTrue(b);
	}
	
	public static void convertStreamToList()
	{
		
		List<String> list = Stream.of("Asbhijeet","Don","Alpha","Adam","Rams").filter(s -> s.startsWith("A")).sorted().collect(Collectors.toList());
	
		System.out.println(list);
	}

	public static void printUniqueNumber()
	{
		
		List<Integer> li = Arrays.asList(2,2,2,5,6);
		li.stream().distinct().forEach(s -> System.out.println(s));
	}
	
	public static void sortArray()

	{
		
		List<Integer> lj = Arrays.asList(6,58,2,2,2,5,6);
	System.out.println(lj.stream().distinct().sorted().collect(Collectors.toList()).get(3));
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	//	withoutStreams();
		usingStreamsFilter();		
//	streamMap();
//	sortfilter();	
//	mergeStream();
//		checkInStream();
//	convertStreamToList();	
	//	printUniqueNumber();
	//	sortArray();
	}

}
