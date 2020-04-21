package com.buildappswithpaulo.observer_design_pattern;

import com.buildappswithpaulo.observer_design_pattern.controllers.Observer;
import com.buildappswithpaulo.observer_design_pattern.model.EmailTopic;
import com.buildappswithpaulo.observer_design_pattern.model.EmailTopicSubscriber;

public class Main {
    public static void main (String[] args) {
        EmailTopic topic = new EmailTopic();

        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("secondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");
        try {
            topic.register(firstObserver);
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        /*
        topic.register(secondObserver);
        topic.register(thirdObserver);

        firsObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        firsObserver.update();

        topic.postMessage("hey man!");
    */
    }

}
