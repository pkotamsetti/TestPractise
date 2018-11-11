@Asos
Feature: Asos Registration
Scenario: Asos Registration

Given The new user is on homepage
When User enters the valid details
|email|kotamsetti72@gmail.com|
|firstname|James|
|lastname|Anderson|
|password|Testing2017|
|DOB_D|15|
|DOB_M|June|
|DOB_Y|82|


Then User must be registered