

Feature: Application feature
  I want to use this template for my feature file
  
  Background:  
  Given setup the entries in database
  When launch the browser from config variables
  And hit the home page url of the banking site

 @RegressionTest
  Scenario: Admin page default login
  
    Given User is on NetBanking landing page
    When user login to application with "admin" and 1234
    Then I validate the outcomes
    And check more outcomes

  Scenario: User page default login
  
    Given User is on NetBanking landing page
    When user login to application with user and "1245"
    Then I validate the outcomes
    And check more outcomes
    
    @SmokeTest @RegressionTest
      Scenario: User page default login
  
    Given User is on NetBanking landing page
    When user login to application
    |Rahul|
    |Dravid|
    |Rahuldravid@gmail.com|
    Then I validate the outcomes
    And check more outcomes

    @SmokeTest @RegressionTest @MobileTest
  Scenario Outline: User page default login
  
    Given User is on NetBanking landing page
    When user login to application with "<username1>" and "<pwd1>"
    Then I validate the outcomes
    And check more outcomes
    
    Examples:
    |username1 | pwd1 |
    | debituser | hello1 |
    | credit user| hello2|