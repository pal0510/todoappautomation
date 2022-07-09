package app.actions;

import app.forms.ItemList;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class FilterItemsActions extends UIInteractionSteps {
    @Step("Filter items by {0}")
    public void by(String filter) {
        $(ItemList.filterButtonWithLabel(filter)).click();
    }
}
