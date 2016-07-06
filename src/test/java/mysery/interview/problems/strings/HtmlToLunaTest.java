/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.strings;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class HtmlToLunaTest {
    
    public HtmlToLunaTest() {
    }

    /**
     * Test of htmlToLuna method, of class HtmlToLuna.
     */
    @Test
    public void testHtmlToLuna() {
        String html = "<div><img /></div>";
        String expected = "DIV([IMG({})])";
        assertEquals(expected, HtmlToLuna.htmlToLuna(html));
        html = "<div><p><img /></p><b></b></div>";
        expected = "DIV([P([IMG({})]), B([])])";
        assertEquals(expected, HtmlToLuna.htmlToLuna(html));
        html = "<div><p></p><p></p><p></p></div>";
        expected = "DIV([P([]), P([]), P([])])";
        assertEquals(expected, HtmlToLuna.htmlToLuna(html));
        //Invalid HTML
        html = "<div><p></div>";
        expected = "DIV([P(])";
        assertEquals(expected, HtmlToLuna.htmlToLuna(html));
        
    }
    
}
