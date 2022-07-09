package app.forms;

import static java.lang.String.format;

import org.openqa.selenium.By;

public class DeleteForm {
	
	
	public static By ITEM = By.cssSelector(".todo-list label");
    public static By DELETED_BUTTON = By.cssSelector(".todo-count strong");
    public static By NUMBER_OF_ITEMS_LEFT_MESSAGE = By.cssSelector(".todo-count");
    
    public static By getDeletedButton(String item) {
		
    	
		return By.xpath("//button[@ng-click='removeTodo(todo)' ]");
    }
    
    public static By getToDOItem(String item) {
        
    	
    	return By.xpath(format("//*[.='%s' ]", item));

    	
    	
    	

		
    	
		
    }


}
