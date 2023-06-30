package Domen;
/** Класс горячих напитков вендингового аппарата */
public class HotDrink extends Product {
    /**Введение температуры напитка */
    private int temperature;
    /** Геттер и сеттер */
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    /** Конструкторы */
    public HotDrink(int price, int place, String name, long id) {
        super(price, place, name, id);
        this.temperature = 100;
    }

    public HotDrink(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    /** Переопределение toString */
    @Override
    public String toString() {
        return super.toString() + "\ntemperature=" + temperature + "\n";
    }

}
