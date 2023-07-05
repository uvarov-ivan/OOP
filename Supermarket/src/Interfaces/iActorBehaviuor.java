package Interfaces;

import Classes.Actor;

public interface iActorBehaviuor {

    public boolean isTakeOrder() ;
    public boolean isReturn() ;
    public boolean isMakeOrder() ;
    public void setTakeOrder(boolean takeOrder) ;
    public void setMakeOrder(boolean makeOrder) ;
    Actor getActor();
    
}
