package app.forms;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class ItemList {
    
	public static By TODO_ITEMS = By.cssSelector(".todo-list label");
    public static By NUMBER_OF_ITEMS_LEFT = By.cssSelector(".todo-count strong");
    public static By NUMBER_OF_ITEMS_LEFT_MESSAGE = By.cssSelector(".todo-count");

    public static By completedItemCheckboxFor(String item) {
        return By.xpath(format("//ul[@class='todo-list']//li[contains(.,'%s')]//input[@type='checkbox']", item));
    	

    }
    
    public static By deleteItemCheckboxFor(String item) {
        By by= By.xpath(format("//ul[@class='todo-list']//li[contains(.,'%s')]//input[@button='destroy']", item));
        
        //by.ena
        return by;
    }

    public static By listedTodoItemFor(String item) {
        return By.xpath(format("//ul[@class='todo-list']//li[contains(.,'%s')]", item));
    }

    public static By filterButtonWithLabel(String filter) {
        return By.linkText(filter);
    }
}
