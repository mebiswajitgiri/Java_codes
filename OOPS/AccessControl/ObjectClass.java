package com.company.OOPS.AccessControl;

public class ObjectClass
{
    String name;
    int num ;

    public ObjectClass(String name,int num) {
        this.name = name;
        this.num= num;
    }

    public ObjectClass() {
        super();
    }

    @Override
    public int hashCode() {
        return this.num;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.num ==((ObjectClass) obj).num);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
