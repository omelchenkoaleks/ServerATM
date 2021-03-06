package server.strategy;

import server.visitor.Visitor;

import java.util.List;

public class BlockCard implements Strategy {

    @Override
    public String execute(Visitor visitor, List<String> request) {

        // Эта строчка вся суть шаблона Посетитель
        // в результате будет б
        if (!visitor.visit(this))
            return "Error access denied";

        return "Blocked 100000";
    }
}
