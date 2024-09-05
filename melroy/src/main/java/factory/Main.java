

package factory;

import abs.Button;
import abs.UiFactory;
import windowandmacfactory.MacFactory;
import windowandmacfactory.WindowsFactory;


public class Main {
    private static Application configureApplication() {
        UiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

class Application {
    private Button button;

    public Application(UiFactory factory) {
        button = factory.createButtton();
    }

    public void paint() {
        button.click();
    }
}

