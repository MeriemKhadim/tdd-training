package fizzBuzz;

import java.util.List;
import java.util.stream.IntStream;


public class FizzBuzzListFactory {
    public static List listFactory(int i) {
       if(i==1) return List.of(1);
        return   IntStream.rangeClosed(1,i).boxed().toList();

    }
}
