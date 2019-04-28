package poglavlje04.syntaxtree.expression;

import poglavlje04.syntaxtree.Identifier;

public class Call extends Exp {
    Exp object;
    Identifier methodName;
    ExpList argsExp;

    public Call(Exp object, Identifier methodName, ExpList argsExp) {
        this.object = object;
        this.methodName = methodName;
        this.argsExp = argsExp;
    }
}
