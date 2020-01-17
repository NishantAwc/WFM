	Feature: Login to WFM Application and verify StrategicSite form submitted successfully

@StrategicSiteFormTest
Scenario: Open the browser and signIn
Given : Intialize the browser 
When : Navigate to "https://industowers.sharepoint.com/sites/idocumentum/wfmdev" Url
And : Enter username and password with follwing details
|p-akash.verma@industowers.com|user@123|
And : Click on SignIn Button 
Then : Verify Home Page is open and SignIn is successful

@StrategicSiteFormTest
Scenario: Navigate to StrategicSite Form
Given : Signin is successful
When : Click on StrategicSite link on the Home Page
Then : Verify StrategicSite form is open

@StrategicSiteFormTest
Scenario: Select values on the NormalSite Form
Given : StrategicSite form is open
When : Enter values for StrategicSite form with following details
|1000 |INDUS01 |INDUS01 |1234 |123 |987|564|This form is for test purpose|This form is for test purpose|This form is for test purpose|This form is for test purpose|This form is for test purpose|1000|1200|231|BudgetHead01|PreferredSupplier01|This form is for test purpose|This form is for test purpose|This form is for test purpose|This form is for test purpose|This form is for test purpose|
Then : Verify Values enetred successfully

@StrategicSiteFormTest
Scenario: Validate StrategicSite form is submitted Successfully
Given : Values are entered successfully
When : Click on Submit Button
Then : Verify Form is submitted