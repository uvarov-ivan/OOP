package View;

import java.util.Scanner;

import Control.iGetView;
import Model.ComplexNum;

public class View implements iGetView {
    /**
     * Рускоязычная вьюшка
     */

    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg + " -> ");
        return in.nextLine();
    }

    @Override
    public ComplexNum genNum(String msgNum) {
        ComplexNum newNum = new ComplexNum(Integer.parseInt(prompt("Введите вещественную часть " + msgNum + " числа")),
               Integer.parseInt(prompt("Введите мнимую часть " + msgNum + " числа")));
        return newNum;
    }

}
