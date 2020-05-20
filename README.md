## Introduction

The assignment is used to highlight the use gitflow and testing in development. The Assignment includes developing a software component that stores information about surveys and the responses to that survey.

The Software component will be done in java it should have bro interface or external storage. It will only contain a controller class with methods that support various different features related to a survey application. I will use Junit testing to test if the code is correct. A test-driven approach was followed when creating this project.


### [TDD](https://www.guru99.com/test-driven-development.html)

Test-Driven Development starts with designing and developing tests for every small functionality of an application. TDD instructs developers to write new code only if an automated test has failed. This avoids duplication of code. The full form of TDD is Test-driven development.

![Test Scenario](https://www.guru99.com/images/8-2016/081216_0811_TestDrivenD2.png)

#### Process

As shown above it is clearly highlighted to make tests first and then code to pass these tests. 

[Test Creation](https://github.com/chriskavanagh97/SoftwareQualityTesting/commit/bc2e70bc46daf7696cf159c074a0f3a8ec103c8e)

In the link above you can clearly see I added three tests and they currently all fail. This is then followed by another commit with functionality added so these tests pass.

[Test Pass](https://github.com/chriskavanagh97/SoftwareQualityTesting/commit/b6756977d2a903ded798dc995538623d75151dec)

This is the process Test Driven Development should follow.

In my code I added unit tests and integration tests

**Unit Tests:** concentrates on each unit of the software as implemented in source

**Validation Testing** focuses on validating the system against the requirements 
