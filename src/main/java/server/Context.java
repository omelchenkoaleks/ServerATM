package server;

import strategy.Strategy;

import java.util.List;

public class Context {

    public String execute (List<String> request) {

        return "";
    }

    private Strategy getStrategy(String name) {
        switch (request.get(0)) {
            case "GetBalance" : break;
            case "CreateCard" : break;
            case "PayAmount"  : break;
        }
    }
}


