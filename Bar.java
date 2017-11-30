package BarProject;
import java.util.ArrayList;

public class Bar {
    private Manager manager;
    private Bartender bartender;
    private ArrayList<Customer> customers;
    private ArrayList<Drink> drinks;
    private int income;

    public Bar(Manager manager, Bartender bartender) {
        this.manager = manager;
        this.bartender = bartender;
        this.bartender.setBar(this);
        customers = new ArrayList<>();
        drinks = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void cash(Drink drink) {
        income += drink.getPrice();
        drinks.remove(drink);
    }

    private int getIncome(){
        return income;
    }
}
