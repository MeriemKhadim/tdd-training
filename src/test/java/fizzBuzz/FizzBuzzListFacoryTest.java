package fizzBuzz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;


public class FizzBuzzListFacoryTest {
    @Test
    public void listFacoryShouldReturnAListWichContainsOnly1WhenInputIs1(){

        List result=FizzBuzzListFacory.listFactory(1);

        Assert.assertEquals(List.of(1),result);
    }
}
