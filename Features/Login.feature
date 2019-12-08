@Asos
Feature: Asos Registration
Scenario: Asos Registration

Given The new user is on homepage
When User enters the valid details

|email|password|firstname|lastname|dob_d|dob_m|dob_y|
|kotamsetti72@gmail.com|James|Anderson|Testing|15|june|82|


Then User must be registered