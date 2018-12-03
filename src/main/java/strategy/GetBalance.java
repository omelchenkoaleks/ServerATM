package strategy;

import java.util.List;

public class GetBalance implements Strategy {

    @Override
    public String execute(List<String> request) {
        return "Balance 1000";
    }
}
