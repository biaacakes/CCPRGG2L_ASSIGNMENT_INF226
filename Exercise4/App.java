public class App {
    public static void main(String[] args) { 
    
    Person Me= new Person("Bianca", 19);

    Person Friend= new Person("Samantha", 19);

    Me.addFriend(Friend);
    
    Pet Dog = new Pet("Bochow", 1, Me);
    Dog.showOwner(Me);

    Person Classmate= new Person("Lliyah", 19);

    Person Classmate2= new Person("Jini", 19);

    Person Classmate3= new Person("Jeanne", 19);

    Me.addClassmate(Classmate);
    Me.addClassmate(Classmate2);
    Me.addClassmate(Classmate3);
   
    Car Ecosport = new Car("Ford Ecosport", "Black", Me);
    Ecosport.myCar();

    
    }
}