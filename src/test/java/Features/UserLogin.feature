Feature: User Login

  Scenario 1: Successful Login
    Given the user is on the login page
    When the user enters valid credentials
    And clicks the login button
    Then the user's name should be displayed on the account dashboard


#  Scenario 2: Unsuccessful Login with Incorrect Password
#    Given the user is on the login page
#    When the user enters a valid username
#    And an invalid password
#    And clicks the login button
#    Then the user should see an error message indicating invalid credentials