package poglavlje05.syntaxtree.expression;

import poglavlje05.syntaxtree.visitor.Visitor;

public class Div extends Exp {
    public Exp left;
    public Exp right;

    public Div(Exp left, Exp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
