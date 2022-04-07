package edu.parinya.softarchdesign.behavioral;

import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.ArrayList;

public class NewsPublisher implements Publisher<News> {

    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void publish(News news) {
        for (Subscriber subscriber : subscribers) {
            // send news
            subscriber.onNext(news);
        }
    }
}
