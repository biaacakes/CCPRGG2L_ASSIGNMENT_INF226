public class Person {
    
    String name;
    int age;
    
    Person (String personName, int personAge) {
        this.name = personName;
        this.age = personAge;

    
    }  
    void addFriend (Person Friend){
        System.out.println(this.name + " is friends with " + Friend.name);
    }
    void addClassmate (Person Classmate){
        System.out.println(this.name + " is classmates with " + Classmate.name);
}
}