package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.iActorBehaviuor;

import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour {

    private List<iActorBehaviuor> queueOrd;
    private List<iActorBehaviuor> queueVip;

    /** Класс описывающий действия магазина */
    public Market() {
        this.queueOrd = new ArrayList<iActorBehaviuor>();// создал обычную очередь
        this.queueVip = new ArrayList<iActorBehaviuor>();// создал VIP-очередь
    }

    /** Метод описывающий процесс входа клиента в магазин */
    @Override
    public void acceptToMarket(iActorBehaviuor actor) {
        // if (actor.getActor().getStatus() == 2 && actor.getActor().getCount() >
        // actor.getActor().getMaxPromoClient())
        System.out.println("Клиент " + actor.getActor().getName() + " пришел в магазин ");
        takeInQueue(actor);
    }

    /** Метод описывающий процесс вклюяения клиента в очередь */
    @Override
    public void takeInQueue(iActorBehaviuor actor) {
        if (actor.getActor().getStatus() == 0 || actor.getActor().getStatus() == 1) {
            this.queueVip.add(actor);
            System.out.println("Клиент " + actor.getActor().getName() + " добавлен в VIP-очередь ");
        } else {
            this.queueOrd.add(actor);
            System.out.println("Клиент " + actor.getActor().getName() + " добавлен в очередь ");
        }

    }

    /** Прохождение обычной очереди */
    @Override
    public void update() {
        takeOrder(queueOrd);

    }

    /** Прохождение VIP-очереди */
    @Override
    public void updateVip() {
        takeOrder(queueVip);

    }

    @Override
    public void takeOrder(List<iActorBehaviuor> queue) {
        List<iActorBehaviuor> releaseActors = new ArrayList<>();
        for (iActorBehaviuor actor : queue) {
            if (!actor.isMakeOrder() && !actor.isReturn()) {
                actor.setMakeOrder(true);
                System.out.println("Клиент " + actor.getActor().getName() + " сделал заказ ");
            } else if (actor.isReturn()) {

                actor.setTakeOrder(true);
                releaseActors.add(actor);
                System.out.println("Клиент " + actor.getActor().getName() + " вернул заказ ");
            }
        }

        releaseFromQueue(releaseActors);
        queue.removeAll(releaseActors);
        giveOrder(queue);

    }

    @Override
    public void giveOrder(List<iActorBehaviuor> queue) {
        for (iActorBehaviuor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println("Клиент " + actor.getActor().getName() + " получил свой заказ ");
            }
        }
        releaseFromQueue(queue);

    }

    @Override
    public void releaseFromQueue(List<iActorBehaviuor> queue) {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviuor actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println("Клиент " + actor.getActor().getName() + " ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println("Клиент " + actor.getName() + " ушел из магазина ");
            queueOrd.remove(actor);
        }

    }

}
