package fizzBuzz;

public class FizzBuzzEngine {
    public static void engine(int i) {

FizzBuzzListFactory.listFactory(i).forEach(element-> System.out.print(FizzBuzzConverter.convert((int) element)));
    }
}
