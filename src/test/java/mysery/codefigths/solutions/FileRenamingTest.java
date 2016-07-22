/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codefigths.solutions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class FileRenamingTest {

    /**
     * Test of fileNaming method, of class FileRenaming.
     */
    @Test
    public void testFileNaming() {
        String[] names = new String[]{"doc", "doc", "image", "doc(1)", "doc"};
        String[] expResult = new String[]{"doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"};
        assertArrayEquals(expResult, FileRenaming.fileNaming(names));
        names = new String[]{"a(1)", "a(6)", "a", "a", "a", "a", "a", "a", "a", "a"};
        expResult = new String[]{"a(1)", "a(6)", "a", "a(2)", "a(3)", "a(4)", "a(5)", "a(7)", "a(8)", "a(9)"};
        assertArrayEquals(expResult, FileRenaming.fileNaming(names));
        assertTrue(isFloat(1.2f));
        assertTrue(isFloat(1.000001f));
        assertFalse(isFloat(1.0f));
    }
    public boolean isFloat(float n) {
        return n % 1 != 0;
    }
}
