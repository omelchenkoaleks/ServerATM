package server.strategy;

import server.visitor.Visitor;

import java.util.List;

public class CreateCard implements Strategy {

    @Override
    public String execute(Visitor visitor, List<String> request) {
        // Эта строчка вся суть шаблона Посетитель - полиморфизм используется -
        // в результате будет б
        if (visitor.visit(this))
        return "Created 100000";
    }
}
