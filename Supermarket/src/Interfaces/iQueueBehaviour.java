package Interfaces;


import java.util.List;

import Classes.Actor;

public interface iQueueBehaviour {

    void takeInQueue(iActorBehaviuor actor);
    void releaseFromQueue(List<iActorBehaviuor> queue);
    void takeOrder(List<iActorBehaviuor> queue);
    // void returnOrder();
    void giveOrder(List<iActorBehaviuor> queue);
}
