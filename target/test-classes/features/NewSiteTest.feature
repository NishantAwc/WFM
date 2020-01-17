Feature: Verify WFM New Site Form Submitted successfully

@NewSiteFormTest
Scenario: Open the browser and signIn
Given : Intialize the browser 
When : Navigate to "https://industowers.sharepoint.com/sites/idocumentum/wfmdev" Url
And : Enter username and password with follwing details
|p-akash.verma@industowers.com|user@123|
And : Click on SignIn Button 
Then : Verify Home Page is open and SignIn is successful


@NewSiteFormTest
Scenario: Navigate to NewSite Form
Given : Signin is successful
When : Click on New Site link on the Home Page
Then : Verify New Site form is open

@NewSiteFormTest
Scenario: Select values on the NewSite Form
Given : New Site form is open
When : Enter values with following details
|1000 |INDUS01 |INDUS01 |1234 |123 |This form is for test purpose|This form is for test purpose|This form is for test purpose|This form is for test purpose|This form is for test purpose|1000|1200|231|BudgetHead01|PreferredSupplier01|This form is for test purpose|This form is for test purpose|This form is for test purpose|This form is for test purpose|This form is for test purpose|This form is for test purpose|This form is for test purpose|
Then : Verify Values enetred successfully

@NewSiteFormTest
Scenario: Validate new form is submitted
Given : Values are entered successfully
When : Click on Submit Button
Then : Verify Form is submitted