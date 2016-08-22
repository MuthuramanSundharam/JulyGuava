package pages;

import wrappers.OpentapsWrappers;

public class AlertWindow extends OpentapsWrappers{
	
	public ViewLeadPage ClickOk() throws InterruptedException{
				acceptAlert();
		return new ViewLeadPage();
	}	
}
