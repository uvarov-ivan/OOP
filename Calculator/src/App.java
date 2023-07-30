import Control.Controller;
import Control.iGetView;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
        iGetView view = new View();
        
        Controller contr = new Controller(view);
        contr.run();
    }
}
