package fizzBuzz;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FizzBuzzEngineTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void engineShouldReturn1WhenInputIs1(){
        FizzBuzzEngine.engine(1);
        Assert.assertEquals("1", outputStreamCaptor.toString().trim());
    }
    @Test
    public void engineShouldReturn12FizzWhenInputIs3(){
        FizzBuzzEngine.engine(3);
        Assert.assertEquals("12Fizz", outputStreamCaptor.toString().trim());
    }

}
