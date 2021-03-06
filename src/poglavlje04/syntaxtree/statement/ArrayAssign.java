package poglavlje04.syntaxtree.statement;

import poglavlje04.syntaxtree.Identifier;
import poglavlje04.syntaxtree.expression.Exp;
import poglavlje04.syntaxtree.visitor.Visitor;

public class ArrayAssign extends Statement {
    public Identifier arrayName;
    public Exp indexVal;
    public Exp rValue;

    public ArrayAssign(Identifier arrayName, Exp indexVal, Exp rValue) {
        this.arrayName = arrayName;
        this.indexVal = indexVal;
        this.rValue = rValue;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
