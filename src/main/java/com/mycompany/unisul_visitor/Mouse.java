package com.mycompany.unisul_visitor;



public class Mouse implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }



}
