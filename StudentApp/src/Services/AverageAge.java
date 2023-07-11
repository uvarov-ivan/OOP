package Services;

import java.util.List;

import Domen.Person;

public class AverageAge<T extends Person> {
    /**
     * Класс который считает средний возраст
     * @param list Список
     * @return Средний возраст участников списка
     */
    public double averageAge(List<T> list){
        double res = 0;
        
        for (T element : list) {
            res += (double)element.getAge();
        }
        res /= list.size();
        System.out.println("Average age = " + res + " years");
        return res;
    }
}
