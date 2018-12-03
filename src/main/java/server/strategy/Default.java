package server.strategy;

import java.util.List;

public class Default implements Strategy {

    @Override
    public String execute(List<String> request) {
        return "Error strategy not found";
    }
}
