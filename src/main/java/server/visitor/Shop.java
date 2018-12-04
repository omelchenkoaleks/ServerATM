package server.visitor;

import server.strategy.*;

public class Shop implements Visitor {

    @Override
    public boolean visit(CreateCard strategy) {
        return false;
    }

    @Override
    public boolean visit(GetBalance strategy) {
        return false;
    }

    // Сумма оплаты...
    @Override
    public boolean visit(PayAmount strategy) {
        return true;
    }

    // Наличные средства...
    @Override
    public boolean visit(CashIn strategy) {
        return false;
    }

    @Override
    public boolean visit(BlockCard strategy) {
        return false;
    }
}
