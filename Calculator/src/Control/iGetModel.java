package Control;

import Model.ComplexNum;

public interface iGetModel {
    /**
     * Итерфейс действий калькулятора
     * @param firstNum Вещественная часть комплексного числа
     * @param secondNum Мнимая часть комплексного числа
    
     */
    public ComplexNum action(ComplexNum firstNum, ComplexNum secondNum);
}
