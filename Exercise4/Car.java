public class Car {
    String brand;
    String color;
    Person owner;
    

    Car(String brand, String color, Person ownerName) {
        this.brand=brand;
        this.color=color;
        this.owner=ownerName;
    
        
}
    void myCar() {
        System.out.println(owner.name + "'s car is " + brand + " and is color " + color);

}
}