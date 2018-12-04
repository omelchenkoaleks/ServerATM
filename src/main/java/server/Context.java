package server;

import server.strategy.Default;
import server.strategy.Strategy;
import server.visitor.Visitor;

import java.util.List;

public class Context {

    public String execute (List<String> request) {

        Visitor visitor = getVisitor(request.get(0));

        Strategy strategy = getStrategy(request.get(1));

        // здесь используется полиморфизм...
        return strategy.execute(visitor, request);
    }

    private Visitor getVisitor(String name) {

        try {


            return (Visitor) Class
                    .forName("server.visitor." + name)
                    .newInstance();

        } catch (Exception e) {
            return null;
        }
    }


    private Strategy getStrategy(String name) {

        try {

            return (Strategy) Class
                    .forName("server.strategy." + name)
                    .newInstance();


        } catch (Exception e) {
            return new Default();
        }
    }
}


