 
package umletplugin.handlers.help;

import org.eclipse.e4.core.di.annotations.Execute;

import com.baselet.gui.MenuFactory;
import com.baselet.gui.eclipse.MenuFactoryEclipse;

public class RateUmletHandler {
	@Execute
	public void execute() {
		MenuFactoryEclipse.getInstance().doAction(MenuFactory.RATE_PROGRAM, null);
	}	
}