package pages;

import wrappers.OpentapsWrappers;

public class AlertWindow extends OpentapsWrappers{
	
	public ViewLeadPage ClickOk() throws InterruptedException{
				acceptAlert();
				Thread.sleep(3000);
		return new ViewLeadPage();
	}	
}
