package org.example.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.Queue;

public class CoffeeOrderBoard {

    private static final Logger LOGGER = LogManager.getLogger(CoffeeOrderBoard.class);
    public static void main(String[] args){

        LOGGER.info("Logger info");
        LOGGER.error("Logger error");
        LOGGER.warn("Logger warning");
    final Queue<Order> orders;

//    public CoffeeOrderBoard(final Queue<Order> orders) {
//        this.orders = orders;
//    }
//    public void add(final String ordererName){
//        Objects.requireNonNull(ordererName, "Parameter [ordererName] must be specified");
//    }
}
}