package app.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

import static app.forms.ItemList.*;

import java.util.List;
import java.util.stream.Collectors;

public class TodoListActions extends UIInteractionSteps {
    public List<String> currentItems() {
        return findAll(TODO_ITEMS)
                .stream()
                .map(WebElementFacade::getTextContent)
                .collect(Collectors.toList());
    }

    public Integer numberOfItemsLeft() {
        return Integer.parseInt($(NUMBER_OF_ITEMS_LEFT).getText());
    }

    public String numberOfItemsLeftMessage() {
        return $(NUMBER_OF_ITEMS_LEFT_MESSAGE).getText();
    }
}
