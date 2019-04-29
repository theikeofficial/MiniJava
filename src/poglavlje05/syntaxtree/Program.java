package poglavlje05.syntaxtree;

import poglavlje05.syntaxtree.classdecl.ClassDeclList;
import poglavlje05.syntaxtree.visitor.Visitor;

public class Program {
    public MainClass mainClass;
    public ClassDeclList classDeclList;

    public Program(MainClass mainClass, ClassDeclList classDeclList) {
        this.mainClass = mainClass;
        this.classDeclList = classDeclList;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
