package javatraining;

public enum Drinks {
    HORLICKS(5), RUM(12), BEER;

    private int price;

    Drinks(int price) {
        this.price = price;
    }

    Drinks() {
        this.price = 30;
    }

    public int getPrice() {
        return price;
    }
}

class Test1 {
    public static void main(String[] args) {
        final Drinks[] drinks = Drinks.values();
        for(Drinks d : drinks){
            System.out.println(d.getPrice());
        }
    }
}