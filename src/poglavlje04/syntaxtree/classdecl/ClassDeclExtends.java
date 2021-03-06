package poglavlje04.syntaxtree.classdecl;

import poglavlje04.syntaxtree.Identifier;
import poglavlje04.syntaxtree.methoddecl.MethodDeclList;
import poglavlje04.syntaxtree.vardecl.VarDeclList;
import poglavlje04.syntaxtree.visitor.Visitor;

public class ClassDeclExtends extends ClassDecl {
    public Identifier className;
    public Identifier superClassName;
    public VarDeclList varDeclList;
    public MethodDeclList methodDeclList;

    public ClassDeclExtends(Identifier className, Identifier superClassName, VarDeclList varDeclList, MethodDeclList methodDeclList) {
        this.className = className;
        this.superClassName = superClassName;
        this.varDeclList = varDeclList;
        this.methodDeclList = methodDeclList;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
