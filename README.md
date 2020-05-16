## Introduction

The assignment is used to highlight the use gitflow and testing in development. The Assignment includes developing a software component that stores information about surveys and the responses to that survey.

The Software component will be done in java it should have no interface or external storage. It will only contain a controller class with methods that support various different features related to a survey application. I will use Junit testing to test if the code is correct. A test-driven approach was followed when creating this project.

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