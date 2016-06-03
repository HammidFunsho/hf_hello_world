package com.coveros6.hello_world_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coveros5.hello_world5.EvenNumberGenerator;
public class EvenNumberGeneratorTest {
   @Test
   public void testRandomEvenNumberGenerator() {
	   
      int randomResult = EvenNumberGenerator.generateRandomEven();
      
      assertEquals(0,randomResult%2);
   }
}
