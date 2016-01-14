package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.*;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        RandomNameGenerator rand = new RandomNameGenerator(0);
        List<String> array = new ArrayList<String>();

        /*task_1*/
        System.out.println("Task one");
        for(int i=0; i<15; i++){
            String name = rand.next();
            array.add(name);
        }
        array.forEach(System.out::println);

        /*task_2*/
        System.out.println("\nTask two");
        array.stream().sorted().forEach(s -> System.out.println("Hello, " + s));

        /*task_3*/
        System.out.println("\nTask three");
        array.stream().filter(s -> array.indexOf(s) > 1).filter(s -> array.indexOf(s) < 5).forEach(s -> System.out.println("Hello, " + s));

        /*task_4*/
        System.out.println("\nTask four");
        array.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println("Hello, " + s));

        /*task_5*/
        System.out.println("\nTask five");
        List<Integer> num_array = new Random().ints(10, 0, 100).mapToObj(i -> new Integer(i)).collect(Collectors.toList());
        num_array.forEach(System.out::println);
        int count = (int) num_array.stream().filter(x -> x%2==0).count();
        System.out.println("Even numbers: " + count);

        /*task_6*/
        System.out.println("\nTask six");
        String my_name = "Dmitry";
        List<Character> char_array = my_name.chars().mapToObj(i -> new Character((char) i)).sorted((a,b)-> Character.toLowerCase(a)-Character.toLowerCase(b)).collect(Collectors.toList());
        char_array.forEach(System.out::println);

        /*task_7*/
        System.out.println("\nTask seven");
        String vowels_array= "aeiouy";
        count = (int) my_name.chars().mapToObj(x -> Character.toLowerCase(x)).filter(i -> vowels_array.indexOf(i) != -1).count();
        System.out.println("Different vowels in the name: " + count);
    }
}