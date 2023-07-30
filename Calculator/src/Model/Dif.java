package Model;

import Control.iGetModel;

public class Dif implements iGetModel{
    /**
     * Класс вычитания
     */

    @Override 
    public ComplexNum action(ComplexNum firstNum, ComplexNum secondNum) {
        int a1 = firstNum.getRealPart();
        int b1 = firstNum.getImaginariPart();
        int a2 = secondNum.getRealPart();
        int b2 = secondNum.getImaginariPart();
        ComplexNum res = new ComplexNum(a1 - a2, b1 - b2);
        return res;
    }
    
}
