package com.mycompany.unisul_visitor;



public class Monitor implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }



}
