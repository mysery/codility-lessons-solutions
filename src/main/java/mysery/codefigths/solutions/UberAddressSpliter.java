/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codefigths.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mysery
 */
/*


Address of a website often has the following form: <protocol>://<domain>.com[/<context>] where <protocol>, <domain> and <context> are non-empty strings consisting of lowercase English letters.
Note that there may be no <context> part in an address.

We need an algorithm that splits an address into an array of its parts: <protocol>, <domain> and <context> (if there is one).

Example

    For address = "http://codefights.com", the output should be
    splitAddress(address) = ["http", "codefights"];
    For address = "http://stackoverflow.com/questions", the output should be
    splitAddress(address) = ["http", "stackoverflow", "questions"].

Input/Output

    [time limit] 3000ms (java)

    [input] string address

    A valid website address.

    Constraints:
    15 ≤ address.length ≤ 35.

    [output] array.string

    Address elements <protocol>, <domain> and <context> placed in the given order.


*/
public class UberAddressSpliter {
    
    String[] splitAddress(String address) {
    List<String> l = new ArrayList<>(3);
    int protocol = address.indexOf("://", 0);
    if (protocol >0){
        l.add(address.substring(0,protocol));
        int domain = address.indexOf(".com", protocol+3);
        if (domain >0){
            l.add(address.substring(protocol+3, domain));
            int context = address.indexOf("/", domain+4);
            if (context >0)
                l.add(address.substring(context+1,address.length()));
        }
    }
    
    
    return l.toArray(new String[]{});
}

    
}
