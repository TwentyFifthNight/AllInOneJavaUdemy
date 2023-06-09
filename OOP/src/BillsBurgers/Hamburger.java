package BillsBurgers;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double totalPrice = price;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat
                            + ", price is " + price);

        if(addition1Name != null){
            totalPrice += addition1Price;
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        }
        if(addition2Name != null){
            totalPrice += addition2Price;
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        }
        if(addition3Name != null){
            totalPrice += addition3Price;
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        }
        if(addition4Name != null){
            totalPrice += addition4Price;
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        }
        return totalPrice;
    }

}
