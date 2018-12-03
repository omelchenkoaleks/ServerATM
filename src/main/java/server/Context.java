package server;

import server.strategy.Default;
import server.strategy.Strategy;

import java.util.List;

public class Context {

    public String execute (List<String> request) {

        return getStrategy(request.get(0)).execute(request);
    }

    private Strategy getStrategy(String name) {

        try {

            // Более лучший способ реализовать switch()
            // - способ динамической загрузки указанного класса.

            return (Strategy) Class
                    .forName("server.strategy." + name)
                    .newInstance();


        } catch (Exception e) {
            return new Default();
        }

//        switch (name) {
//            case "GetBalance" : return new GetBalance();
//            case "CreateCard" : return new CreateCard();
//            case "PayAmount"  : return new PayAmount();
//            default           : return new Default();
//        }
    }
}


