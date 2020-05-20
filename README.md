## Introduction

The assignment is used to highlight the use gitflow and testing in development. The Assignment includes developing a software component that stores information about surveys and the responses to that survey.

The Software component will be done in java it should have bro interface or external storage. It will only contain a controller class with methods that support various different features related to a survey application. I will use Junit testing to test if the code is correct. A test-driven approach was followed when creating this project.

# Sprint Backlog

The sprint backlog will contain all tasks associated with the software component with associate values based on estimation

### [Task estimation](https://www.tutorialspoint.com/estimation_techniques/estimation_techniques_planning_poker.html)

In Scrum Projects, estimation is done by the entire team during Sprint Planning Meeting. The objective of the Estimation would be to consider the User Stories for the Sprint by Priority and by the Ability of the team to deliver during the Time Box of the Sprint. The Scrum Estimation of User Stories is in terms of the degree of difficulty for each of the User Stories. To assess the degree of difficulty, a scale is used. I decided to use a well-known technique known as the poker technique. 

Planning Poker is played with a deck of cards. As Fibonacci sequence is used, the cards have numbers - 1, 2, 3, 5, 8, 13, 21, 34, etc. These numbers represent the Story Points. Normally a moderator would read out the task and team would select a card based on their estimation. If each member for example estimate the task to be 8 this would be the ideal representation. Normally the first estimations vary and teams discuss the estimation together for a few minutes. 

Although due to this assignment being an individual one, I had to trust my own estimations and create my own criteria. To do this I chose values based on the complexity of code expected combined with my experience and technical ability to provide this code.

Creteria:
1.	Do I have good experience in this type of code?
2.	Do I find it technically difficult?
3.	Are if statements included 
4.	Does it involve creating new objects 
5.	Are loops involved
6.	Does it involve iterating through a list?
7.	Is a test required
8.	Does It include retrieving information from a specified item in a list
9.	Does it include a 2nd method? 

There isn’t a set point system for each value it just allows me to think into the technical difficulty of each task. For example, if a task involves 5, 6, 7, 8 and answers no to 1 and yes to 2 well then it will be very difficult and will rank as 32. Then if something answers yes to 1 and no to 2 and only involves 3 well then it would rank as 1 as I would naturally find this easy. It is all based on how my personal opinion naturally would be different in a team.


#### Tasks

**Tasks involved with functionality coding**

*	Create survey - 1
*	Add a question and answers to the survey - 1
*	Get a list of all surveys - 8
*	Get a survey by name - 8
*	Creating a survey answer - 5
*	Adding a selection to a survey answer - 2
*	Getting all survey answers associated with a specific survey - 34
*	Get average deviation of a survey - 21
*	Get standard deviation of a survey - 34
*	Get maximum score of a survey - 8
*	Get minimum score of a survey - 8
*	Get standard deviation for a specific question on a survey- 34
*	Get maximum score for a specific question on a survey- 13
*	Get minimum score for a specific question on a survey- 13

**Comparison of two tasks**
To demonstrate my taught process of task estimation I will compare two of my tasks

1. Getting all survey answers associated with a specific survey
2. Adding a selection to a survey answer

| Question 	| Task 1 	| Task 2 	|
|----------	|--------	|--------	|
| 1        	| No    	 | Yes     |
| 2        	| Yes    	| No     	|
| 3        	| Yes    	| No     	|
| 4        	| No    	 | Yes     |
| 5        	| Yes     | No    	 |
| 6        	| Yes    	| No    	 |
| 7        	| Yes    	| Yes     |
| 8        	| Yes    	| No     	|
| 9        	| Yes    	| No     	|

**Task 1 :** As you can see the majority of questions are answered in Task 1, including no.2 stating I find it technically difficult. For this reason I believe it is a complex task which should be ranked 34.

**Task 2 :** I have stated I do not find it technically difficult and also say I have good experience with it. The majority of tasks are also answered no indicating it is not a complex task for this reason I have ranked it 2

#### Velocity calculation

 There are 8 levels to my estimation system with this I have ranked them 1 - 8 based on their difficulty.
 
 For eg: Any task ranked 34 will be given a velocity value of 8, 21 is given a velocity value of 7 and follow this pattern until the bottom value of 1.
 
 Overall there is a velocity of 71. when I complete a task i add it to my completed tasks. The total of my completed tasks will be compared to the velocity total to indicate the % of work I have done so far. In terms of a time measuring tool I have given 10 points to represent an hour. 
 
 With this using my previous example it helps me plan how long I need to work for task 2 should only take me 12 - 15 minutes. while task 1 should take me 3 just over 3 hours.
 
 Although it is important to remember to not [misuse the velocity tool](https://innolution.com/essential-scrum/table-of-contents/chapter-7-estimation-and-velocity) 
 
 >"Velocity should not be used as a performance metric to judge team productivity. Instead, velocity should assist teams with performing accurate planning and with improving internally. Any other uses will likely promote the wrong behavior."


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
 