

Feature: Application feature
  I want to use this template for my feature file
  
  Background:  
  Given setup the entries in database
  When launch the browser from config variables
  And hit the home page url of the banking site

 @RegressionTest @NetBanking
  Scenario: NetBanking user page default login
  
    Given User is on NetBanking landing page
    When user login to application with "admin" and 1234
    Then I validate the outcomes
    And check more outcomes

	@RegressionTest @Mortgage 
  Scenario: Mortgage user page default login
  
    Given User is on NetBanking landing page
    When user login to application with user and "1245"
    Then I validate the outcomes
    And check more outcomes
    


