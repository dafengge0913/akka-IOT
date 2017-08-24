package com.github.dafengge0913.akkaiot;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class IotSupervisor extends AbstractActor {

    private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

    public static Props props() {
        return Props.create(IotSupervisor.class);
    }

    @Override
    public void preStart() throws Exception {
        log.info("IoT Application started");
    }

    @Override
    public void postStop() throws Exception {
        log.info("IoT Application stopped");
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder().build();
    }

}
