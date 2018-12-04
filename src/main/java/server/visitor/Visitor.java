package server.visitor;

import server.strategy.*;

public interface Visitor {
    // перегрузка методов (каждый метод будет проверять
    // можно ли этому посетителю выполнять такую функцию)
    // т.е. мы определяем поведение посетителя для каждой команды
    boolean visit(CreateCard strategy);
    boolean visit(GetBalance strategy);
    boolean visit(PayAmount strategy);
    boolean visit(CashIn strategy);
    boolean visit(BlockCard strategy);
}
