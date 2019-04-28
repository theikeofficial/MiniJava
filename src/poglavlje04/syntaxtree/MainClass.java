package poglavlje04.syntaxtree;

import poglavlje04.syntaxtree.statement.Statement;

public class MainClass {
    Identifier className;
    Identifier argsName;
    Statement statement;

    public MainClass(Identifier className, Identifier argsName, Statement statement) {
        this.className = className;
        this.argsName = argsName;
        this.statement = statement;
    }
}