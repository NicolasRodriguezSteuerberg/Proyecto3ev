import Controller.Controller;
import Controller.ObserverTablas;
import View.IMenu;
import View.Vista;

public class App {

    public static void main(String[] args) {
        Controller.crearArrays();
        Controller.anadirObserver();
        Controller obx = new Controller();

    }
}
