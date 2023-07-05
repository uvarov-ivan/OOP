package Classes;

public class PromotionalClient extends Actor {

    private int promId;
    private String namePromo;
    private int numPromoClient;

    /**
     * Класс описывающий акционных клиентов
     * 
     * @param name      Имя клиента
     * @param promId    ID акционного клиента, будет сквозным и не будет единой с "номером промоклиента"
     * @param namePromo Название акции
     */
    public PromotionalClient(String name, int promId, String namePromo) {
        super(name + " - № промоклиента " + countPromoClient);
        this.promId = promId;
        this.namePromo = namePromo;
        this.numPromoClient = countPromoClient; // номер промоклиента
        super.status = 2; // Статус клиента (2 - акции)
        super.isReturn = false; // Флаг возврата, у акционных клиентов возврата нет по умочланию
        countPromoClient++; // Увеличивает счётчик акционных клиентов
    }

    private static int maxNumPromoClient;// максимальное количество клиентов по акции

    static {
        maxNumPromoClient = 10;
    }

    public static int getMaxPromoClient() {
        return maxNumPromoClient;
    }

    private static int countPromoClient; // счётчик акционных клиентов

    public static int getCount() {
        return countPromoClient;
    }

    static {
        countPromoClient = 1;
    }


    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setMakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setTakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public int getStatus() {
        return this.status;
    }

    public boolean isReturn() {
        return this.isReturn;
    }


}
