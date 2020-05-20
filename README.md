# Review Check List
Code review is an increasingly common practice in development teams. It’s a workflow in which developers submit their code for feedback prior to merging branches, or deploying code to production. This feedback is usually given by colleagues, either other developers, a manager, or a tech lead. One of the most familiar forms of code review is the Github pull request, in which developers leave comments on specific lines of code and, ultimately, approve or reject the proposed changes. Due to this being an individual assignment i will be reviewing my own code through a review list.

I will use the following metrics to review my code for errors:

#### 1. **Understandable**

Is the code easy to understand, in relation to software development this means can I easily see what the code is doing, the inputs and the outputs. 

Some Aspects of Understandable code:

*Naming:*
Do the naming conventions make sense and do they have a meaning. Variables, methods funtions and classes all must have names that are understandable and don't cause confusion in the future.

*Format:* Is your code broken down; Code becomes less readable if your code is not broken down into small chunks. Code can be quite overwhelming when is it not organised and is large chunks.


#### 2. **Does it match function requirements**

Do these changes match the function requirements. Are the changes implemented functional , this helps restrict the addition of code that is not useful to the task on hand

#### 3. **Can it be easily tested or debugged**

Can the code added be easily tested and debugged if there is an error in the project functionality.

#### 4. **Can this solution be simplified further**

Here I should look through the code and ensure that I haven't over complicated my code. It is to ensure that I have coded in the most simplist way possible over complex codee can lead to future errors and confusion

#### 5. **Is this code repeated**

Code duplication should be checked, if there is code written for the same porpose in the project, that code should be removed or corrected.

#### 6. **Is there documentation**

Do comments exist that describe the intent of the code? Are all functions commented. If there is any incomplete code is this flagged with a suitable marker such as "TODO" 

**Example of how my review checklist is applied:**

 [Pull Request and Review Checklist](https://github.com/chriskavanagh97/SoftwareQualityTesting/pull/3)

Each member of the team will review code by checking if it passes the 6 stages. If the code doesn't pass a stage the member will be required to say why it doesn't pass this test and say how it should be changed.

The developer will then be required to make these changes, and create a new pull request with new changes 
=======
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

As you can see the code coverage has now increased to 97%. Although not a lot it does portray how it should be and can be used and would be very beneficial in larger projects where the original code coverage may not be as high