package org.example;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      String url = "https://socratify.net/";
        try {
            Document document = Jsoup.connect(url).get();
            Elements content = document.select("div.b-list-quote2__item ");
            for (Element c:content){
              String quote =  c.getElementsByClass("b-list-quote2__item-text js-quote-text").text();
              String author = c.getElementsByClass("b-list-quote2__item-category").text();
              if(quote)

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}