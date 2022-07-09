Feature: Managing ToDo Items

  
  # Add a Simple Item
  Scenario: Adding a single item
    Given User opens the Todo Application
    When she adds "Complete the Coding Assignment"
    Then her todo list should contain:
      | Complete the Coding Assignment |


 #Adding Multiple Items
  Scenario: Adding Multiple item
    Given User opens the Todo Application
    When she adds "Complete the Coding Assignment"
    And she adds "Attend the Interview"
    Then her todo list should contain:
      | Complete the Coding Assignment |
      | Attend the Interview |
     
  #Adding Items to an exisitng List
    
    Scenario: Adding items to an existing list
    Given User has a todo list containing
      | Complete the Coding Assignment |
    When she adds "Attend The Interview"
    Then her todo list should contain:
      | Complete the Coding Assignment |
      | Attend The Interview |
    And the remaining item count should show "2 items left"
    
  #Message on Blank Page
    
    Scenario: User should get help when adding item for the first time
    Given User opens the Todo Application
    Then the application should suggest how to add them 
    
    #Message on Blank Page
    
    Scenario: Mark an Item Complete
    Given User has a todo list containing
      | Complete the Coding Assignment |
      | Attend The Interview |
    When she completes "Complete the Coding Assignment"
    And she filters the list to show Completed tasks
    Then her todo list should contain:
      | Complete the Coding Assignment |
      
      
      Scenario: Mark an Item Delete
    Given User has a todo list containing
      | CompleteTheCodingAssignment |
      | AttendTheInterview |
    When she deletes "CompleteTheCodingAssignment"
 
    Then her todo list should contain:
      | AttendTheInterview |
      
    
      

    