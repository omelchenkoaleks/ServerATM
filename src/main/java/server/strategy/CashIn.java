package server.strategy;

import java.util.List;

public class CashIn implements Strategy {

    @Override
    public String execute(List<String> request) {
        return "Cash in 350";
    }
}
