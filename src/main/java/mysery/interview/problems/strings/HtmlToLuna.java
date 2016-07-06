/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.strings;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 *
 * While preparing for your first round interview with Asana, you start
 * exploring Luna, Asana's in-house framework for automating Web application
 * creation. For practice - and fun! - you decide to implement a simple
 * HTML-to-Luna converter.
 *
 * To keep things straightforward, you will only consider 4 HTML tags: div, p,
 * b, img. Here is how valid HTML is constructed:
 *
 * an empty string is a valid HTML;
 * <img /> is valid HTML (note the whitespace character between img and /); if
 * HTML is valid HTML, then <div>HTML</div>,
 * <p>
 * HTML</p> and <b>HTML</b> are all valid. if HTML1 and HTML2 are both valid
 * HTML, then HTML1HTML2 is valid HTML.
 *
 * For example, <div><p>
 * <img /></p><b></b></div> is valid HTML, but <div><p>
 * </div> is invalid.
 *
 * The conversion of each tag is performed as follows:
 *
 * <div><arg1><arg2>...</div> → DIV([arg1, arg2, arg3, ... ]);
 * <p>
 * <arg1><arg2>...</p> → P([arg1, arg2, arg3, ... ]);
 * <b><arg1><arg2>...</b> → B([arg1, arg2, arg3, ... ]);
 * <img /> → IMG({})
 *
 * Example
 *
 * For html = "<div><img /></div>", the output should be htmlToLuna(html) =
 * "DIV([IMG({})])"; For html = "<div><p>
 * <img /></p><b></b></div>", the output should be htmlToLuna(html) =
 * "DIV([P([IMG({})]), B([])])"; For html = "<div><p>
 * </p><p>
 * </p><p>
 * </p></div>", the output should be htmlToLuna(html) = "DIV([P([]), P([]),
 * P([])])".
 *
 * Input/Output
 *
 * [time limit] 3000ms (java)
 *
 * [input] string html
 *
 * Valid HTML, containing only these 4 tags: div, p, b, img.
 *
 * Constraints: 0 ≤ html.length ≤ 6 · 104.
 *
 * [output] string
 *
 * The given HTML converted into the Luna format.
 *
 *
 * @author mysery
 */
public class HtmlToLuna {

    public static String htmlToLuna(String html) {

        if (html.length() < 3) {//seria invalido.
            return "";
        }
        Deque<String> stack = new ArrayDeque<>();
        String peek;
        StringBuilder aux;
        int first;
        for (int i = 0; i < html.length() - 3; i++) {
            String s = html.substring(i, i + 3);
            System.out.println(s);
            switch (s) {
                case "<di":
                    stack.push("DIV(");
                    i += 4;
                    break;
                case "<p>":
                    stack.push("P(");
                    i += 2;
                    break;
                case "<b>":
                    stack.push("B(");
                    i += 2;
                    break;
                case "<im":
                    stack.push("IMG({})");
                    i += 6;
                    break;
                case "</d":
                    peek = stack.peekFirst();
                    aux = new StringBuilder();
                    first = 0;
                    while (!"DIV(".equals(peek)) {
                        if (first++ > 0) {
                            aux.insert(0, ", ");
                        }
                        aux.insert(0, stack.pollFirst());
                        peek = stack.peekFirst();
                    }
                    stack.push(stack.pollFirst() + "[" + aux + "])");
                    i += 3;
                    break;
                case "</p":
                    peek = stack.peekFirst();
                    aux = new StringBuilder();
                    first = 0;
                    while (!"P(".equals(peek)) {
                        if (first++ > 0) {
                            aux.insert(0, ", ");
                        }
                        aux.insert(0, stack.pollFirst());
                        peek = stack.peekFirst();
                    }
                    stack.push(stack.pollFirst() + "[" + aux + "])");
                    i += 3;
                    break;
                case "</b":
                    peek = stack.peekFirst();
                    aux = new StringBuilder();
                    first = 0;
                    while (!"B(".equals(peek)) {
                        if (first++ > 0) {
                            aux.insert(0, ", ");
                        }
                        aux.insert(0, stack.pollFirst());
                        peek = stack.peekFirst();
                    }
                    stack.push(stack.pollFirst() + "[" + aux + "])");
                    i += 3;
                    break;
            }

        }

        return stack.pollFirst();
    }
}
