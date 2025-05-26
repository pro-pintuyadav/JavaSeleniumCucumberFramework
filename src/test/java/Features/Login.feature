@smoke
Feature: This is a Login Page Feature
    @smoke1
    Scenario: This is a Login Page-1 Scenario
        Given I am on the login page
        When I enter my username and password
        Then I should be redirected to the home page
        And I should see a welcome message

    @smoke2
    Scenario: This is a Login Page-2 Scenario
        Given I am on the login page
        When I enter my username and password
        Then I should be redirected to the home page
        And I should see a welcome message

    @smoke3
    Scenario: This is a Login Page-3 Scenario
        Given I am on the login page
        When I enter my username and password
        Then I should be redirected to the home page
        And I should see a welcome message

    @store
    Scenario: Validate add to cart functionality
        Given I am on the store page
        When I add an item to the cart
        Then I should see the item in the cart
    @cart
    Scenario: Verify Cart Items
        Given I am on the cart page
        When I view the items in the cart
        Then I should see the correct items listed