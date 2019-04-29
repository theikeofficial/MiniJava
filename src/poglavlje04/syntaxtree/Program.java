package poglavlje04.syntaxtree;

import poglavlje04.syntaxtree.classdecl.ClassDeclList;

public class Program {
    public MainClass mainClass;
    public ClassDeclList classDeclList;

    public Program(MainClass mainClass, ClassDeclList classDeclList) {
        this.mainClass = mainClass;
        this.classDeclList = classDeclList;
    }
}
