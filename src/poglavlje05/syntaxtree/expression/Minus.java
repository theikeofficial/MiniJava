package poglavlje05.syntaxtree.expression;

import poglavlje05.syntaxtree.visitor.Visitor;

public class Minus extends Exp {
    public Exp left;
    public Exp right;

    public Minus(Exp left, Exp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
