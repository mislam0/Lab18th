package OwnerCloning;

public class House implements Cloneable {
    private double size;
    private Owner owner;

    public House() {}

    public House(double size, Owner owner) {
        this.size = size;
        this.owner = owner;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        House clonedHouse = (House) super.clone();
        clonedHouse.owner = (Owner) owner.clone();
        return clonedHouse;
    }
}