package app.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import app.forms.ItemForm;

import java.util.List;

/**
 * Actions related to adding a new item to the list
 */
public class AddNewItemActions extends UIInteractionSteps {

    @Step("add a todo called '{0}'")
    public void itemCalled(String todoItem) {
        $(ItemForm.NEW_ITEM).sendKeys(todoItem, Keys.ENTER);
    }

    @Step("add todo items: {0}")
    public void itemsCalled(List<String> todoItems) {
        todoItems.forEach(this::itemCalled);
    }

    public String prompt() {
        return $(ItemForm.NEW_ITEM).getAttribute("placeholder");
    }
}
