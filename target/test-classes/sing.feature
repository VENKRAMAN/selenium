Feature: To validate the email field of the gmail application

Background:
Given To launch the chrome browser and maximize the window

Scenario: To validate email with valid username and click next button
When To launch the url of the gmail application
And To pass the valid username in email field
And To click the next button
And To check whether navigate to homepage or not
Then To close the browser


Scenario Outline: To validate the positive and negative combination email field
When user has to hit gmail url
And user has to pass the data"<emailfield>" in email field
And user has to hit the click button
Then user has to close the browser

Examples:
|emailfield|
|raji6@gmail.com|
|vr921718@gmail.com|
|1234@gmail.com|
|ghjjk@gmail.com|