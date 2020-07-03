package test;
import main.BalancedBrackets;
import org.junit.Test;


import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void  lcBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void stringBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(("Launch[Code!]")));
    }
    @Test
    public void bracketFirstReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void missingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void singleBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void fail(){

    }
    @Test
    public void equalStrings(){
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]"));

    }
    @Test
    public void sameDude(){
        assertSame("hey", BalancedBrackets.hasBalancedBrackets("[]"), BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void notNullExample(){
        assertNotNull(BalancedBrackets.hasBalancedBrackets("[]"));
    }


}
