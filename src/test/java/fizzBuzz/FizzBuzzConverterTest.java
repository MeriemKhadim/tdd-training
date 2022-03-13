package fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzConverterTest {


    @Test
    public void shouldReturnFizzWhenInputIs3(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(3);
        assertEquals("Fizz",result);
    }

    @Test
    public void shouldReturnBuzzWhenInputIs5(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(5);
        assertEquals("Buzz",result);
    }


    @Test
    public void shouldReturnFizzWhenInputIsMultipleOf3(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(6);
        assertEquals("Fizz",result);
    }
    @Test
    public void shouldReturnFizzBuzzWhenInputIs15(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(15);
        assertEquals("FizzBuzz",result);
    }
    @Test
    public void shouldReturnFizzBuzzWhenInputIsMultipleOf15(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(15);
        assertEquals("FizzBuzz",result);
    }
    @Test
    public void shouldReturnBuzzWhenInputIsMultipleOf5(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(10);
        assertEquals("Buzz",result);
    }
    @Test
    public void shouldReturn2WhenInputIs2(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(2);
        assertEquals("2",result);
    }


}