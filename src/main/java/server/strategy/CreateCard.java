package server.strategy;

import java.util.List;

public class CreateCard implements Strategy {

    @Override
    public String execute(List<String> request) { return "Created 100000";
    }
}
