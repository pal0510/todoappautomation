package app.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class LaunchAppAction extends UIInteractionSteps {

    
    public void navigateToToDoPage() {
        navigateToPageNamed("angular.app");
    }
}
