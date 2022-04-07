package edu.parinya.softarchdesign.behavioral;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {
	// You need to implement this class
    private Subscription subscription;
    private final String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public void onNext(News item) {
        if(item != null){
            System.out.printf("%s get the news *** %s: %s\n", this.name, item.getTopic(), item.getContent());
        }else {
            System.out.printf(" Error !!! : onNext item == Null ");
        }
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.printf(" Error !!!");
    }

    @Override
    public void onComplete() {
        System.out.printf(" Complete !!!");
    }
}
