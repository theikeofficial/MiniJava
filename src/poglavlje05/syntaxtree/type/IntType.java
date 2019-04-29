package poglavlje05.syntaxtree.type;

import poglavlje05.syntaxtree.visitor.Visitor;

public class IntType extends Type {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
