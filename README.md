## Introduction

The assignment is used to highlight the use gitflow and testing in development. The Assignment includes developing a software component that stores information about surveys and the responses to that survey.

The Software component will be done in java it should have no interface or external storage. It will only contain a controller class with methods that support various different features related to a survey application. I will use Junit testing to test if the code is correct. A test-driven approach was followed when creating this project.

### [ Test Coverage Tool ](https://www.guru99.com/test-coverage-in-software-testing.html)

Test coverage is defined as a metric in Software Testing that measures the amount of testing performed by a set of test. It will include gathering information about which parts of a program are executed when running the test suite to determine which branches of conditional statements have been taken.

In simple terms, it is a technique to ensure that your tests are testing your code or how much of your code you exercised by running the test.

#### ItelliJ Code Coverage

IntelliJ IDEA has a code coverage runner built in. This allows me to use a code coverage tool without the need to download external coverage tools such as EMMA or JaCoCo.

To run the code coverage tool you simply just have to click a single button:

![](https://github.com/chriskavanagh97/SoftwareQualityTesting/blob/TestCovageTool/src/Images/CodeCoverageButton.png)

Once the code coverage tool has been run, I am given a repor on my code showing the % covered in each of my classes and the overall code coverage.

![](https://github.com/chriskavanagh97/SoftwareQualityTesting/blob/TestCovageTool/src/Images/CodeCoverageReport.png)

As you can clearly see I have a reasonably high 95%. This is naturally from continuous pull requests and checklists to ensure my code is written to a good standard. although my code coverage can still be improved. In Survey i have 62% and question 80%. With this I should go to both classes and ensure all code is being used.

![](https://github.com/chriskavanagh97/SoftwareQualityTesting/blob/TestCovageTool/src/Images/CodeCoverageReport2.png)

As you can see the code coverage has now increased to 97%. Although not a lot it does portray how it should be and can be used and would be very beneficial in larger projects where the original code coverage may not be as high.