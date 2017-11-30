package BarProject;

public class Drink {
    private String name;
    private int price;


    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o instanceof Drink){
            Drink temp = (Drink) o;
            return temp.name.equals(name);
        }
        return false;
    }
}
