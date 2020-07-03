package main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    int[] array;
   @Before
    public void init(){
       array = new int[] {3,4,5,6,7,8,9};
   }
   @Test
    public void emptyTest(){
       assertEquals(true,true);
   }
   @Test
    public void findSixReturnThree(){
       int returnValue = BonusBinarySearch.binarySearch(array,6);
       assertEquals(returnValue, 3);
   }
}
