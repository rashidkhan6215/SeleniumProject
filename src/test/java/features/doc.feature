
Feature: Automate leaftaps Application
Scenario: TC001_login and logout

Given Lounch ChromeBrowser and Load Url
And enter username as DemoSalesManager
And enter password as crmsfa
When click on Login button
Then its navigated homepage
Then click on Logout button
Then close browser