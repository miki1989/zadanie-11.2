import java.util.Comparator;

public class Warehouse implements Comparable<Warehouse> {

    private String name;
    private int amount;

    public Warehouse(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toString(){
        return "Nazwa produktu " + getName() + " ilość "+ getAmount() + " " + starsToProducts();
    }

    public String starsToProducts(){
        if (this.amount < 6 && this.amount > 0){
            return " ";
        }
        else if (this.amount < 16 && this.amount >= 6){
            return "*";
        }
        else if (this.amount < 26 && this.amount >= 16){
            return "**";
        }
        else if (this.amount < 36 && this.amount >= 26){
            return "***";
        }
        else if (this.amount < 46 && this.amount >= 36){
            return "****";
        }
        else if (this.amount < 56 && this.amount >= 46){
            return "*****";
        }
        else if (this.amount < 66 && this.amount >= 56){
            return "******";
        }
        else if (this.amount < 76 && this.amount >= 66){
            return "*******";
        }
        else if (this.amount < 86 && this.amount >= 76){
            return "********";
        }
        else if (this.amount < 96 && this.amount >= 86){
            return "*********";
        }
        else
        return "**********";
    }
    public int compareTo(Warehouse o){
        return Comparators.NAME.compare(this, o);
    }

    public static class Comparators {

        public static Comparator<Warehouse> NAME = new Comparator<Warehouse>() {
            @Override
            public int compare(Warehouse o1, Warehouse o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }

}
