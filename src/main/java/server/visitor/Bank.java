package server.visitor;

import server.strategy.*;

public class Bank implements Visitor {

    @Override
    public boolean visit(CreateCard strategy) {
        return true;
    }

    @Override
    public boolean visit(GetBalance strategy) {
        return true;
    }

    @Override
    public boolean visit(PayAmount strategy) {
        return false;
    }

    @Override
    public boolean visit(CashIn strategy) {
        return true;
    }

    @Override
    public boolean visit(BlockCard strategy) {
        return true;
    }
}
