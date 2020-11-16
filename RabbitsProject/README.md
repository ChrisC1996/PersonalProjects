# Rabbit-Population-Explosion

## Sprint 0

### Pre-Planning (Monday, 26.10. 10:00-13:00)
- received product requirements from the client (Manish)
- created a GitHub repo and a project board in order to track work
- creating user stories with acceptance criteria and testing plan based on customer requirements
  - As a user, I would like to see how many male and female rabbits there are, so that I can see how the population is split.
  - As a user, I would like to see the time passed, so I can see how the data changed by time.
  - As a User, I would like to give a time span, so that I can choose how long the program runs.
  - As a User, I would like the program to start with 1 male and 1 female rabbit, so that it models a group of rabbits accurately.
  - As a user, I would like to see the final population, so that I can analyse the data.
  - As a user, I would like to see the death count, so that I would know how many rabbits died.
- created definitions of done for both user stories and project as a whole
- created an outline of a project
- came up with the questions to be clarified by the client

### Planning (Monday, 26.10. 14:00-15:30)
- questions clarified by the client 
- created coding convention
- additional user stories added
  - As a user, I would like to know where to input any information, so that I know how to navigate the program.
  - As a user, I would like to know what I need to enter for the program to run, so that I know what Is considered a valid input
  - As a user, I would like to know how the data will be displayed so that I know where to look for this information
 - divided the work amongst team members by user stories to start working on them

### Coding - Beginning of Sprint 1 (Monday, 26.10. 16:00-17:30)
- completed two user stories and merged them to **dev** branch
  - As a User, I would like to give a time span, so that I can choose how long the program runs.
  - As a User, I would like the program to start with 1 male and 1 female rabbit, so that it models a group of rabbits accurately.
- worked on additional two user stories 
  - As a user, I would like to see how many male and female rabbits there are, so that I can see how the population is split.
  - As a user, I would like to see the time passed, so I can see how the data changed by time.

### Successes
- created the user stories
- comprehended what a user wanted
- created task backlog using user stories
- organised with what tasks were completed by whom
- started coding
- improved understanding of Rabbit class
- adhered to SOLID principles and TDD
- successfully merged two branches to **dev**

### Challenges
- making sure everyone is keeping up with the project
- difficulties dividing the work based of user stories
- difficulties coding when multiple sub-teams are working on the same classes


## Sprint 1 (Tuesday, 27.10. all day)
### Work Done
- created model classes and interface
- handled input validation and output display

### Successes
- working piece of software
- readable code, easy to understand
- following SOLID principles

### Challenges
- struggled with merge conflicts
- division of labor amongst 9 people - too many people working on the same things
- user stories too big, a lot of overlaps
- not enough testing
- memory limitations


## Sprint 2 (Wednesday, 28.10. all day)
### Work Done
- solved Concurrency issues by using different methods handling large amounts of objects
- added user input for report display
- writing report to both the console and a txt file
- handled input validation and output display
- added extra layers of abstraction to overall code
- added tests for different user cases
- using threading to code
- packaged code

### Successes
- SOLID principles adhered to
- tests for different user stories 
- accurate information for certain test cases
- pre-working report printed in console
- no merge conflicts 
- successful demo
- better communication
- better job dividing the work

### Challenges
- project freezing on certain test cases (need better memory management)
- testing still incomplete
- GUI not added yet
- refactoring not completed yet

### Future Work
- begin working on presentation
- begin working on GUI
- completion of code refactoring
- completion of Test cases
- handle possible code crashing or code freezing statements

### Retrospective
- start: working on GUI and third set of requirements
- more: testing and improving memory management
- keep: raising your hand when you want to speak
- less: big merges
- stop: staying overtime

## Sprint 3 (Thursday, 29.10. all day)
### Work Done
- improved memory management
- more tests written
- storing reports in a JSON file
- implemented most of the new requirements
- GUI implemented
- presentation outline

### Successes
- program can hypothetically run for infinitly long
- handling report in 3 different ways (console, txt, json)
- large test coverage
- working GUI
- outlined the presentation and divided slides

### Challenges
- haven't allowed for user to change constants yet (maturity/death age)
- `long` is sometimes not big enough (numbers can get too big for large periods of time)
- some struggles with merging

### Future Work
- allow for change in constants
- finish the presentation
- refactor the code (deep cleaning)
- calcualte code coverage

### Retrospective
- start: test driven development in future
- more: communicating well (jumping in different calls and keeping each other up to date)
- keep: working in smaller groups (and smaller groups within those groups)
- less: big merges
- stop: staying late (past 5 o'clock)
