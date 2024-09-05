package windowandmacfactory;

import abs.Button;
import abs.UiFactory;
import framework.WindowsButton;

public class WindowsFactory implements UiFactory {

	@Override
	public Button createButtton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

}
