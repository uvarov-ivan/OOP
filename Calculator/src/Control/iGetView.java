package Control;

import Model.ComplexNum;

public interface iGetView {
    /**
     * Интерфейс вьюшки

     */
    public String prompt(String msg); //Чтение с клавиатуры
    public ComplexNum genNum (String msg);// Генератор комплексных чисел
}
