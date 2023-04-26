package BillsBurgers;

public class DeluxeHamburger2 {
    String breadRollType;
    String meat;
    double price;
    Hamburger hamburger;

    public DeluxeHamburger2() {
        this.breadRollType = "White";
        this.meat = "bacon";
        this.price = 19.10;
        //hamburger = new Hamburger(breadRollType,meat,price);
        hamburger.addHamburgerAddition1("chips",2);
        hamburger.addHamburgerAddition2("drinks",3);
    }



    public double totalPrice(){
        return price + hamburger.itemizeHamburger();
    }
}
