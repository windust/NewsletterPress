package org.cjug.NewsletterPress.library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Freddy
 * Date: 5/28/14
 * Time: 7:14 PM
 * Newsletter object that represents the actual newsletter
 */
public class Newsletter {
    int id;
    String name;
    Date newsletterDate;
    String title;
    List<Article> articles = new ArrayList<>();


}
