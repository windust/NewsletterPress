package org.cjug.NewsletterPress;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: Freddy
 * Date: 5/27/14
 * Time: 5:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();

        strings.stream().filter(e -> e.startsWith("a"));
    }
}
