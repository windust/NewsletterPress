package org.cjug.NewsletterPress.storage;

import org.cjug.NewsletterPress.library.Newsletter;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Freddy
 * Date: 5/28/14
 * Time: 7:13 PM
 * NewsletterProvider Layer for
 */
public interface NewsletterProvider {
    List<Newsletter> retrieveNewsletters();
    Newsletter createNewsletter();
    void removeNewsletter (int id);
    void updateNewsletter (Newsletter newsletter);



}
