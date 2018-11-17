/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10travisexercise;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.Arrays;
/**
 *
 * @author Ahssan
 */
public class Lab10TravisExercise {
    public static <T> int linearSearch(List<T> list, Predicate<T> check)
    {
        for(int i=0;i<list.size();i++)
        {
            if(check.test(list.get(i)))
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<String> firstElementTest = Arrays.asList("apple", "banana", "grapes", "orange");
        List<Integer> otherElementTest=Arrays.asList(1,2,3,4,5);
        List<String> noElementTest = Arrays.asList("red","blue","green");
        Predicate<String> firstElementTestPredicate = i -> (i=="apple");
        Predicate<Integer> otherElementTestPredicate = x -> (x==4);
        Predicate<String> noElementTestPredicate = s -> (s=="yellow");
        System.out.print("Testing to see that the first element in a String list matches the predicate: ");
        System.out.println(Lab10TravisExercise.<String>linearSearch(firstElementTest, firstElementTestPredicate));
        System.out.print("Testing to see that another element in an Integer list matches the predicate: ");
        System.out.println(Lab10TravisExercise.<Integer>linearSearch(otherElementTest, otherElementTestPredicate));
        System.out.print("Testing to see that no element in a String list matches the predicate: ");
        System.out.println(Lab10TravisExercise.<String>linearSearch(noElementTest, noElementTestPredicate));
        
    }
    
}
