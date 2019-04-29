package poglavlje04.syntaxtree.visitor;

import poglavlje04.syntaxtree.Identifier;
import poglavlje04.syntaxtree.MainClass;
import poglavlje04.syntaxtree.Program;
import poglavlje04.syntaxtree.classdecl.ClassDeclExtends;
import poglavlje04.syntaxtree.classdecl.ClassDeclSimple;
import poglavlje04.syntaxtree.expression.And;
import poglavlje04.syntaxtree.expression.ArrayLength;
import poglavlje04.syntaxtree.expression.ArrayLookup;
import poglavlje04.syntaxtree.expression.Call;
import poglavlje04.syntaxtree.expression.False;
import poglavlje04.syntaxtree.expression.IdentifierExp;
import poglavlje04.syntaxtree.expression.IntegerLiteral;
import poglavlje04.syntaxtree.expression.LessThan;
import poglavlje04.syntaxtree.expression.Minus;
import poglavlje04.syntaxtree.expression.NewArray;
import poglavlje04.syntaxtree.expression.NewObject;
import poglavlje04.syntaxtree.expression.Not;
import poglavlje04.syntaxtree.expression.Plus;
import poglavlje04.syntaxtree.expression.This;
import poglavlje04.syntaxtree.expression.Times;
import poglavlje04.syntaxtree.expression.True;
import poglavlje04.syntaxtree.formal.Formal;
import poglavlje04.syntaxtree.methoddecl.MethodDecl;
import poglavlje04.syntaxtree.statement.ArrayAssign;
import poglavlje04.syntaxtree.statement.Assign;
import poglavlje04.syntaxtree.statement.Block;
import poglavlje04.syntaxtree.statement.If;
import poglavlje04.syntaxtree.statement.Print;
import poglavlje04.syntaxtree.statement.While;
import poglavlje04.syntaxtree.type.BooleanType;
import poglavlje04.syntaxtree.type.IdentifierType;
import poglavlje04.syntaxtree.type.IntArrayType;
import poglavlje04.syntaxtree.type.IntType;
import poglavlje04.syntaxtree.vardecl.VarDecl;

public interface Visitor {
    public void visit(Program n);
    public void visit(MainClass n);
    public void visit(ClassDeclSimple n);
    public void visit(ClassDeclExtends n);
    public void visit(VarDecl n);
    public void visit(MethodDecl n);
    public void visit(Formal n);
    public void visit(IntArrayType n);
    public void visit(BooleanType n);
    public void visit(IntType n);
    public void visit(IdentifierType n);
    public void visit(Block n);
    public void visit(If n);
    public void visit(While n);
    public void visit(Print n);
    public void visit(Assign n);
    public void visit(ArrayAssign n);
    public void visit(And n);
    public void visit(LessThan n);
    public void visit(Plus n);
    public void visit(Minus n);
    public void visit(Times n);
    public void visit(ArrayLookup n);
    public void visit(ArrayLength n);
    public void visit(Call n);
    public void visit(IntegerLiteral n);
    public void visit(True n);
    public void visit(False n);
    public void visit(IdentifierExp n);
    public void visit(This n);
    public void visit(NewArray n);
    public void visit(NewObject n);
    public void visit(Not n);
    public void visit(Identifier n);
}