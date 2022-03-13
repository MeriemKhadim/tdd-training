package fizzBuzz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;


public class FizzBuzzListFactoryTest {
    @Test
    public void listFacoryShouldReturnAListWichContainsOnly1WhenInputIs1(){

        List result= FizzBuzzListFactory.listFactory(1);

        Assert.assertEquals(List.of(1),result);
    }
    @Test
    public void listFacoryShouldReturnAListWichContains1And2WhenInputIs2(){

        List result= FizzBuzzListFactory.listFactory(2);

        Assert.assertEquals(List.of(1,2),result);
    }
    @Test
    public void listFacoryShouldReturnAListWichContains1And2And3WhenInputIs3(){

        List result= FizzBuzzListFactory.listFactory(3);

        Assert.assertEquals(List.of(1,2,3),result);
    }

}
