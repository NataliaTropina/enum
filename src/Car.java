public class Car {

//Создайте класс автомобиль с полями:
//Название;
//Объем бака в литрах;
//Fuel fuel Тип топлива.
//Пусть у автомобиля будет метод - рассчитать стоимость полного бака, он должен расчитывать сколько стоит заправить полный бак.  (отредактировано)

    private String title;
    private int volumeOfTank;
    private Fuel fuel;

    public Car (String title, int volumeOfTank, Fuel fuel){
        this.title = title;
        this.volumeOfTank = volumeOfTank;
        this.fuel = fuel;
    }

    public String toString(){
        return String.format("%d , volume of tank: %d L, Fuel: %s",
                title,
                volumeOfTank,
                fuel);
    }

    public double fullTankCost (){
        return volumeOfTank * fuel.getPrice();
    }

}
