package server.strategy;

import server.visitor.Visitor;

import java.util.List;

public interface Strategy {

    String execute(Visitor visitor, List<String> request);
}
