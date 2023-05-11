Feature: Login Funtionality
@test
Scenario: veriy login funtionlity with correct credentials

     Given user launch site url
     When  user enter correct username and correct password
     And   user click on button
     Then  Validate user navigates to home