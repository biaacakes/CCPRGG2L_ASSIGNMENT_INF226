public class App {
    public static void main(String[] args) throws Exception {
        // item in form of a diaper
        // Polymorphic variable
        GroceryItem item1= new Diaper();
        item1.name= "Uni-Love";
        item1.showItemName();
        
        // item in form of a napkin
        GroceryItem item2= new Napkin();
        item2.name= "Modess";
        item2.showItemName();

        // Cashier object
        Cashier c1= new Cashier();
        item1.price= 1000;
        item2.price=500;

        //Checkout
        c1.checkOut(item1);
        c1.checkOut(item2);

        //Price
        c1.showItemPrice(item1);
        c1.showItemPrice(item2);

        GroceryItem[] itemArray= new GroceryItem[2];
        itemArray[0] = item1;
        itemArray[1] = item2;

    
        int totalAmount= 0;
        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
         totalAmount +=itemArray[i].price;
        }

        System.out.println("Total Purchased Amount: " + totalAmount);

        Dog mydog = new Dog();
        mydog.eat();
  }
}
