package BarProject;

public class BarTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Bartender bartender = new Bartender(manager);
        Bar bar = new Bar(manager, bartender);

        Customer customer0 = new Customer();
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        bar.addCustomer(customer0);
        bar.addCustomer(customer1);
        bar.addCustomer(customer2);

        for (int i = 0; i < 30; i++) {
            Drink vodka = new Drink("vodka", 7);
            Drink beer = new Drink("beer", 5);
            Drink gingerAle = new Drink("ginger ale", 3);

            bar.addDrink(vodka);
            bar.addDrink(beer);
            bar.addDrink(gingerAle);
        }

        Drink myVodka = new Drink("vodka", 7);
        Drink myBeer = new Drink("beer", 5);
        Drink myGingerAle = new Drink("ginger ale", 3);

        bartender.sell(myBeer, customer0);

        System.out.println();
    }
}
