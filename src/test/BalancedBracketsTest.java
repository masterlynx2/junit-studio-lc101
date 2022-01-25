package test;

import org.junit.Test;


import static org.junit.Assert.*;


public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBrackets(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test

    public void unBalancedBrackets(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[unbalanced"));
    }

    @Test
    public void excessiveBrackets(){

        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[Lions]["));
    }

    @Test

    public void nullString(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void doubleBrackets(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[[does it work?]]"));
    }
@Test
    public void  rightSideBracket(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets(" it work?]]"));
}
@Test
    public void invertedBrackets() {
    assertFalse(main.BalancedBrackets.hasBalancedBrackets("]["));
}
    @Test
    public void midBrackets(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("Tee[mo sucks]"));
    }

    @Test
    public void doubleLeftSideBrackets(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("Tee[[mo sucks"));
    }
    @Test

        public void twoBalancedBrackets(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[Teemo] [sucks]"));
    }
@Test
    public void nonBracketChar(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[--==-Teemo]*(&%$%^#_)(&*((&*^% [-=--sucks]"));
    }
    @Test
    public void unbalancedRightBrackets(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[Teemo [sucks]"));
    }
}
