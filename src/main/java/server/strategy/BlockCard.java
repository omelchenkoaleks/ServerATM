package server.strategy;

import java.util.List;

public class BlockCard implements Strategy {

    @Override
    public String execute(List<String> request) {
        return "Blocked 100000";
    }
}
