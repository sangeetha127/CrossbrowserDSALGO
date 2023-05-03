Feature: Evaluate Graph Module

  @tag23
  Scenario: User select Graph module from drop down
    Given user able to click on dropdown for Graph
    When user select Graph option
    And user clicks on Graph topic 

  @tag24
  Scenario Outline: User is able to click tryhere page and run valid python code
    Given click Try here button and navigate to tryEditor page
    When user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And Graph User click on run button
    Then User should be presented with run output

    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |

  @tag24
  Scenario Outline: User is able to navigate to tryhere page and run invalid python code
    Given click Try here button and navigate to tryEditor page
    When user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And Graph User click on run button
    Then Graph User should get alert message

    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         1 |

  @tag25
  Scenario Outline: User is able to navigate to tryhere page and run valid python code
  	Given user select graph representations
    And click Try here button and navigate to tryEditor page
    When user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And Graph User click on run button
    Then User should be presented with run output

    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |

  @tag25
  Scenario Outline: User is able to navigate to tryhere page and run invalid python code
    
    Given click Try here button and navigate to tryEditor page
    When user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And Graph User click on run button
    Then Graph User should get alert message

    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         1 |

  @tag26
  Scenario: user select graph practice questions
	Given user select practice questions from graph
	And user navigate back and sign out from project
	

