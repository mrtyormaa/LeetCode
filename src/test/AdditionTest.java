package test;

import leetcode.solutions.Addition;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

import static org.junit.Assert.*;


/**
 * Created by asutosh on 6/22/15.
 */
public class AdditionTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void checkAddition(){
        int result  = Addition.Add(3, 4);
        assertEquals("Result must be 7", 7, result);
    }

    @Test
    public void yetAnotherAdditionTest(){
        int result  = Addition.Add(5, 4);
        assertEquals("Random Shit", 9, result);
    }
}