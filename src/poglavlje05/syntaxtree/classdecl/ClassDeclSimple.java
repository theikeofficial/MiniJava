package poglavlje05.syntaxtree.classdecl;

import poglavlje05.syntaxtree.Identifier;
import poglavlje05.syntaxtree.methoddecl.MethodDeclList;
import poglavlje05.syntaxtree.type.Type;
import poglavlje05.syntaxtree.vardecl.VarDeclList;
import poglavlje05.visitor.TypeVisitor;
import poglavlje05.visitor.Visitor;

public class ClassDeclSimple extends ClassDecl {
    public Identifier className;
    public VarDeclList varDeclList;
    public MethodDeclList methodDeclList;

    public ClassDeclSimple(Identifier className, VarDeclList varDeclList, MethodDeclList methodDeclList) {
        this.className = className;
        this.varDeclList = varDeclList;
        this.methodDeclList = methodDeclList;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }
}
