package server.strategy;

import java.util.List;

public class PayAmount implements Strategy {

    @Override
    public String execute(List<String> request) {
        return "Paid 200";
    }
}
