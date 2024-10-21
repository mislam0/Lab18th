package OwnerCloning;

public class HouseTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Owner owner1 = new Owner("John");
        House house1 = new House(120.5, owner1);

        House house2 = (House) house1.clone();

        System.out.println("House 1 Owner: " + house1.getOwner().getName());
        System.out.println("House 2 Owner: " + house2.getOwner().getName());

        house2.getOwner().setName("Alice");

        System.out.println("After modifying owner in house 2:");
        System.out.println("House 1 Owner: " + house1.getOwner().getName());
        System.out.println("House 2 Owner: " + house2.getOwner().getName());
    }
}