package server.strategy;

import server.visitor.Visitor;

import java.util.List;

public class Default implements Strategy {

    @Override
    public String execute(Visitor visitor, List<String> request) {

        return "Error strategy not found";
    }
}
