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
    public void shouldReturnFizzWhenInputIs5(){
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
    public void shouldReturnFizzWhenInputIs15(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(15);
        assertEquals("FizzBuzz",result);
    }
    @Test
    public void shouldReturnFizzWhenInputIsMultipleOf15(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(15);
        assertEquals("FizzBuzz",result);
    }
    @Test
    public void shouldReturnFizzWhenInputIsMultipleOf5(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(10);
        assertEquals("Buzz",result);
    }
    @Test
    public void shouldReturnNullWhenInputIsAnotherOne(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(2);
        assertEquals(null,result);
    }


}