package com.corejava.oops.object;
public class House {
    String address;
    String color;
    String area;

    public void openDoor(){
        System.out.println("open");
    }

    public void closeDoor(){
        System.out.println("close");
    }

    public void House(String address ,String color, String area){
        this.address = address;
        this.color = color;
        this.area = area;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", color='" + color + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public static void main(String[] args) {
        House house = new House();
        house.openDoor();
        house.closeDoor();
        house.House("Kundal", "pink", "kranti nagar");
        System.out.println(house);

    }
}
