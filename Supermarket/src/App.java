import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.PromotionalClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviuor;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        iActorBehaviuor client1 = new OrdinaryClient("Boris");
        iActorBehaviuor client2r = new OrdinaryClient("*****Vlad*****", true);
        iActorBehaviuor client3r = new OrdinaryClient("*****Vlad222*****", true);
        iActorBehaviuor clientV1 = new SpecialClient("Prezident",1001);
        iActorBehaviuor clientV2r = new SpecialClient("****Tsar****",1002, true);
        iActorBehaviuor clientV3r = new SpecialClient("****Tsar222****",1003, true);
        iActorBehaviuor cliantP1 = new PensionerClient("Sergey Nikolay",1111);
        iActorBehaviuor tax = new TaxService();
        iActorBehaviuor clientA1 = new PromotionalClient("Pavlik", 2001, "Testing promo");
        iActorBehaviuor clientA2 = new PromotionalClient("Kolia", 2002, "Testing promo");
        iActorBehaviuor clientA3 = new PromotionalClient("Vadik", 2003, "Testing promo");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2r);
        magnit.acceptToMarket(client3r);
        magnit.acceptToMarket(clientV1);
        magnit.acceptToMarket(clientV2r);
        magnit.acceptToMarket(clientV3r);
        magnit.acceptToMarket(cliantP1);
        magnit.acceptToMarket(tax);
        magnit.acceptToMarket(clientA1);
        magnit.acceptToMarket(clientA2);
        magnit.acceptToMarket(clientA3);

        magnit.updateVip();
        magnit.update();
    }
}
