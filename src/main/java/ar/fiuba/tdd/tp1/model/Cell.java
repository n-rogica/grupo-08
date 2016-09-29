package ar.fiuba.tdd.tp1.model;

import ar.fiuba.tdd.tp1.model.interfaces.VisitorOfCell;

public abstract class Cell {
    protected String name;

    public String getName() {
        return this.name;
    }

    public void setName(String nameValue) {
        this.name = nameValue;
    }

    public abstract Object getDatum();

    public abstract String datumToString();

    public void accept(VisitorOfCell visitor) {
        visitor.visit(this);
    }
}
