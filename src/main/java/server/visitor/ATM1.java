package server.visitor;

import server.strategy.*;

public class ATM1 implements Visitor {

    @Override
    public boolean visit(CreateCard strategy) {
        return false;
    }

    @Override
    public boolean visit(GetBalance strategy) {
        return true;
    }

    @Override
    public boolean visit(PayAmount strategy) {
        return true;
    }

    @Override
    public boolean visit(CashIn strategy) {
        return false;
    }

    @Override
    public boolean visit(BlockCard strategy) {
        return false;
    }
}
