package Model;

import Control.iGetModel;

public class Divid implements iGetModel {
    /**
     * Класс деления
     */

    @Override
    public ComplexNum action(ComplexNum firstNum, ComplexNum secondNum) {
        int a1 = firstNum.getRealPart();
        int b1 = firstNum.getImaginariPart();
        int a2 = secondNum.getRealPart();
        int b2 = secondNum.getImaginariPart();
        ComplexNum res = new ComplexNum((a1 * a2 + b1 * b2) / (a2 * a2 + b2 * b2), (b1 * a2 - a1 * b2) / (a2 * a2 + b2 * b2));
        return res;
    }
    
}
