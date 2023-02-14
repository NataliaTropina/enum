public enum Fuel {

//С полем double price.
//Пусть будет несколько типов топлива:
//Бензин 95 по цене 1,57 за литр
//Бензин 98 по цене 1.76 за литр
//Дизель по цене 1,74 за литр

    PETROL95(1.57), PETROL98(1.76), DIESEL(1.74);

    private double price;

    Fuel(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

}
