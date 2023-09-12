package parse;

import Service.SayingsService;
import model.Sayings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SayingsParse {
    @Autowired
    SayingsService service;

    @Scheduled(fixedDelay = 10000)
    public void parseSayngs() {
        String url = "https://socratify.net/";
        try {
            Document doc = Jsoup.connect(url)
                    .timeout(1000)
                    .get();
            Elements content = doc.select("div.b-list-quote2__item ");
            for (Element c : content) {
                String quote = c.getElementsByClass("b-list-quote2__item-text js-quote-text").text();
                String author = c.getElementsByClass("b-list-quote2__item-category").text();
                if (!service.isExist(quote)) {
                    Sayings obj = new Sayings();
                    obj.setQuote(quote);
                    service.save(obj);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
