package Classes;

import Interfaces.iActorBehaviuor;

public class TaxService implements iActorBehaviuor {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isReturn;

    /** Класс описывающий налогового инспектора */
    public TaxService() {
        this.name = "Tax audit";
        this.isReturn = false;
    }

    public String getName() {
        return name;
    }

    public boolean isReturn() {
        return this.isReturn;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        isTakeOrder = pickUpOrder;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

}
