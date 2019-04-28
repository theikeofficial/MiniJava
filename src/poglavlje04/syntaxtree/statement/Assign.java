package poglavlje04.syntaxtree.statement;

import poglavlje04.syntaxtree.Identifier;
import poglavlje04.syntaxtree.expression.Exp;

public class Assign extends Statement {
    Identifier lValue;
    Exp rValue;

    public Assign(Identifier lValue, Exp rValue) {
        this.lValue = lValue;
        this.rValue = rValue;
    }
}