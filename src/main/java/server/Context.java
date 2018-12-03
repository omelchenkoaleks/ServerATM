package server;

import strategy.*;

import java.util.List;

public class Context {

    public String execute (List<String> request) {

        return getStrategy(request.get(0)).execute(request);
    }

    private Strategy getStrategy(String name) {

        switch (name) {
            case "GetBalance" : return new GetBalance();
            case "CreateCard" : return new CreateCard();
            case "PayAmount"  : return new PayAmount();
            default           : return new Default();
        }
    }
}


