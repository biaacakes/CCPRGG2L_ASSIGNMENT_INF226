public class Pet {
    
    // ATTRIBUTES
    String name;
    int age;
    Person owner;

    Pet(String name, int age, Person ownerName) {
        this.name = name;
        this.age = age;
        this.owner = ownerName;
    }
    void showOwner(Person owner) {
        System.out.println("My name is " + this.name + ". My owner name is " + owner.name);
 }
}