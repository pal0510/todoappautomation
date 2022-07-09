package app.steps;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import app.actions.AddNewItemActions;
import app.actions.CompleteItemActions;
import app.actions.DeleteAction;
import app.actions.FilterItemsActions;
import app.actions.LaunchAppAction;
import app.actions.TodoListActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepDefinitions {

    @Steps
    AddNewItemActions addItemAction;

    @Steps
    TodoListActions itemListAction;


    @Steps
    LaunchAppAction launchAppAction;
    
    @Steps
    FilterItemsActions filterItems;
    
    @Steps
    CompleteItemActions completeAction;
    
    @Steps
    DeleteAction deleteAction;


    @Given("(.*) opens the Todo Application")
    public void opens_the_Todo_Application(String actor) {
        launchAppAction.navigateToToDoPage();
    }
    
    @Given("User opens the Todo Application")
    public void user_opens_the_todo_application() {
    	launchAppAction.navigateToToDoPage();
    }

    @Given("User has a todo list containing")
    public void user_has_a_todo_list_containing(List<String> expectedItems) {
    	 launchAppAction.navigateToToDoPage();
         addItemAction.itemsCalled(expectedItems);
    }


    @When("she adds {string}")
    public void she_adds(String todoItem) {
        addItemAction.itemCalled(todoItem);
    }

    @Then("his/her todo list should contain:")
    public void the_todo_list_should_contain(List<String> expectedItems) {
    	
        assertThat(itemListAction.currentItems()).containsAll(expectedItems);
       
    }


    @And("the remaining item count should show {string}")
   public void theRemainingItemCountShouldShow(String remainingItemCountText) {
        assertThat(itemListAction.numberOfItemsLeftMessage()).isEqualTo(remainingItemCountText);
    }

    
    

    @When("he/she filters the list to show {word} tasks")
    public void filtersBy(String filter) {
        filterItems.by(filter);
    }

    

    @When("he/she completes {string}")
    public void sheCompletes(String completedTodo) {
        completeAction.itemCalled(completedTodo);
    }
    
    @When("he/she deletes {string}")
    public void sheDelets(String deletedToDO) {
        deleteAction.delete(deletedToDO);
    }

    @Then("the todo item called {string} should be marked as completed")
    public void theTodoItemCalledShouldBeMarkedAsCompleted(String todoItem) {
        assertThat(completeAction.isCompleted(todoItem)).isTrue();
    }
    
    @Then("the application should suggest how to add them")
    public void the_application_should_suggest_how_to_add_them() {
        assertThat(addItemAction.prompt()).isEqualTo("What needs to be done?");
    }


}
