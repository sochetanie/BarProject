package BarProject;

public class Bartender {
    private Manager manager;
    private Bar bar;

    public Bartender(Manager manager) {
        this.manager = manager;
    }

    public void sell(Drink drink, Customer customer){
        bar.cash(drink);
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }
}
