/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codewars.solutions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class DRootTest {
    
    @Test
    public void Tests() {
      assertEquals( "Nope!" , DRoot.digital_root(16), 7);
      assertEquals( "Nope!" , DRoot.digital_root(942), 6);
      assertEquals( "Nope!" , DRoot.digital_root(132189), 6);
      assertEquals( "Nope!" , DRoot.digital_root(493193), 2);
    }
    
}
