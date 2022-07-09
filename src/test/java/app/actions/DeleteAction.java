package app.actions;

import org.openqa.selenium.By;

import app.forms.DeleteForm;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class DeleteAction extends UIInteractionSteps {
    
    

	public void delete(String deletedToDO) {
		
		
		
		By textBox=DeleteForm.getToDOItem(deletedToDO)	;
		
		By crossButton= DeleteForm.getDeletedButton(deletedToDO);
		
		
		
		
		
		
		withAction().moveToElement(element(textBox)).build().perform();

		
		
		
	    crossButton.findElement(getDriver()).click();
		
	}


	
	
	
  
	
	
	
}
