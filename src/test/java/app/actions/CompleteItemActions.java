package app.actions;


import app.forms.ItemList;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class CompleteItemActions extends UIInteractionSteps {
    
    public void itemCalled(String completedTodo) {
        $(ItemList.completedItemCheckboxFor(completedTodo)).click();
    }

    
	public boolean isCompleted(String item) {
		
		
		
		
        return $(ItemList.listedTodoItemFor(item)).getAttribute("class").equals("completed");
    }

	
}
