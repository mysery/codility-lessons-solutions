/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.validateString;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class ValidateStringFormatTest {
    
    @Test
    public void testValidateString() {
        System.out.println("validateString");
        String word = "hdkasj {erwyiw}fdsfs{dd[dhdhd (dassss)]kkkk}";
        ValidateStringFormat instance = new ValidateStringFormat();
        assertTrue(instance.validateString(word));
        word = "{}[](){}(){}";
        assertTrue(instance.validateString(word));
        word = "[{()}]{()}";
        assertTrue(instance.validateString(word));
        word = "[}";
        assertFalse(instance.validateString(word));
        word = "[dddd}";
        assertFalse(instance.validateString(word));
        word = "[d{dd}d]][";
        assertFalse(instance.validateString(word));
        word = "{}}{][[]";
        assertFalse(instance.validateString(word));
    }
    
}
