package Classes;

import Interfaces.iActorBehaviuor;

public abstract class Actor implements iActorBehaviuor {
    protected String name;
    protected int status;
    protected boolean isReturn;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();
    abstract public int getStatus();
  

   
}
