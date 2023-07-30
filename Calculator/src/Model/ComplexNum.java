package Model;

public class ComplexNum {

    private int realPart;
    private int imaginariPart;

    /**
     * Класс комплексного числа
     * 
     * @param realPart      вещественная часть
     * @param imaginariPart мнимая часть
     */
    public ComplexNum(int realPart, int imaginariPart) {
        this.realPart = realPart;
        this.imaginariPart = imaginariPart;
    }

    public int getRealPart() {
        return realPart;
    }

    public int getImaginariPart() {
        return imaginariPart;
    }

    @Override
    public String toString() {
        String i = Integer.toString(Math.abs(imaginariPart)) + "i";
        if (imaginariPart == 0) {
            i = "";
        } else if (Math.abs(imaginariPart) == 1){
            i = "i";
        } 
        if (imaginariPart < 0) {
            i = " - " + i;
        } else {
            i = " + " + i;
        }

        
        return (Integer.toString(realPart) + i);
    }

}
