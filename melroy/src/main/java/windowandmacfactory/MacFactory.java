package windowandmacfactory;

import abs.Button;
import abs.UiFactory;
import framework.MacButton;

public class MacFactory implements UiFactory {

	@Override
	public Button createButtton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

}
