package Control;

import Model.ComplexNum;
import Model.Dif;
import Model.Divid;
import Model.Multi;
import Model.Sum;

public class Controller {
    private iGetView view;
    /**
     * Контроллер калькулятора
     * @param view возможность выбора вьюшки
     */

    public Controller(iGetView view) {
        this.view = view;
    }

    public void run() {

        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            ComplexNum comNum1 = new ComplexNum(0, 0); // пришлось объявить здесь, чтобы сделать возможность выхода
            ComplexNum comNum2 = new ComplexNum(0, 0); // до ввода числа, иначе свитч ругается))
            String command = view.prompt("Введите желаемое действие:");
            com = Command.valueOf(command.toUpperCase());
            if (com.name() != "EXIT") {
                comNum1 = view.genNum("1");
                comNum2 = view.genNum("2");
            }

            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;

                case SUM:
                    System.out.println(new Sum().action(comNum1, comNum2));
                    break;

                case DIF:
                    System.out.println(new Dif().action(comNum1, comNum2));
                    break;

                case DIVID:
                    System.out.println(new Divid().action(comNum1, comNum2));
                    break;

                case MULTI:
                    System.out.println(new Multi().action(comNum1, comNum2));
                    break;

            }

        }

    }
}
