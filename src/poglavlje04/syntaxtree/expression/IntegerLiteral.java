package poglavlje04.syntaxtree.expression;

import poglavlje04.syntaxtree.visitor.Visitor;

public class IntegerLiteral extends Exp {
    public int value;

    public IntegerLiteral(int value) {
        this.value = value;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
