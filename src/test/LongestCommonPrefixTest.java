package test;

import static org.junit.Assert.*;

import leetcode.solutions.LongestCommonPrefix;
import org.testng.annotations.Test;

/**
 * Created by asutosh on 6/22/15.
 */
public class LongestCommonPrefixTest {
    @Test
    public void checkResult(){
        String[] str = new String[]{"asutosh","asutfgsrgbdh","asutskgnkjfhngkjhnkhn"};
        String result = LongestCommonPrefix.longestCommonPrefix(str);
        assertEquals("Result must be asut", "asut", result);
    }

}