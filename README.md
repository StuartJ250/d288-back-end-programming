<strong> **DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>
# WESTERN GOVERNORS UNIVERSITY 
## D288 – BACK-END PROGRAMMING
Welcome to Back-End Programming! This is an opportunity for students to develop object-oriented applications that can be integrated with relational databases, write code for object-oriented applications using Spring framework, and implements design patterns for object-oriented applications. 
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will be building your project using IntelliJ IDEA (Ultimate Edition) in a WGU-provided lab environment. You will be working with an existing MySQL database and Angular front-end, which are supplied for you in the lab environment. You will share this project to a private external GitLab repository and backup regularly. If you wish to work on it on your local machine, you will also need to download the Angular front-end application and create your own MySQL database. Use the links on your course page to install the integrated development environments (IDE), MySQL WorkBench, and IntelliJ IDEA, and pull the project from the lab environment.  


## SUPPLEMENTAL RESOURCES
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the project. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!


A.   Create a new Java project using Spring Initializr:
- Created Java project with Spring Initializr using Spring Data JPA, Rest Repositories, MySQL Driver, and Lombok dependencies

B.   Create your subgroup and project by logging into GitLab using the web link provided and do the following:
- Ran Pipeline on GitLab and cloned project to IDE
- Created working_branch branch from main
- Added Spring Project files to working_branch
- Updated application.properties with provided file

C.   Construct four new packages, one for each of the following: controllers, entities, dao, and services. The packages will need to be used for a checkout form and vacations packages list.
- Created controllers package in com.example.demo
- Created entities package in com.example.demo
- Created dao package in com.example.demo
- Created services package in com.example.demo
- Created config package in com.example.demo
- added RestDataConfig.java file to config package

Note: The packages should be on the same level of the hierarchy.

Note: Construct a package named config and copy the RestDataConfig.java provided in the laboratory environment to the package. Modify it so that the package and imports have the correct package and import addresses. Copy the application.properties file that is provided in the laboratory environment into your application properties resource file.

D.   Write code for the entities package that includes entity classes and the enum designed to match the UML diagram.
- Created Cart class in entities package
- Created CartItem class in entities package
- Created Country class in entities package
- Created Customer class in entities package
- Created Division class in entities package
- Created Excursion class in entities package
- Created Vacation class in entities package
- Added @OneToMany relationship to Cart.java on line 44
- Added @ManyToOne relationship on Cartitem.java on line 32
- Added @OneToMany relationship to Country.java on line 35
- Added @ManyToOne relationship to Division.java on line 31
- Added @OneToMany relationship to Customer.java on line 51
- Added @ManyToOne relationship to Cart.java on line 47
- AAdded @OneToMany relationship to Division.java on line 35
- Added @ManyToOne relationship to Customer.java on line 47
- Added @OneToMany relationship to Vacation.java on line 44
- Added @ManyToOne relationship to Excursion.java on line 41
- Added @ManyToOne relationship to CartItem.java on line 36
- Added @ManyToMany relationship to CartItem.Java on line 40
- Added @ManyToMany relationship to Excursion.Java on line 45
- Created Enum Status.java
- Added @Enumerated to variable "statusType" to Cart.java on line 30
- Updated RestDataConfig.java to include correct import on line 3
- Changed variable country in Division.java on lines 31-33
- Changed Status.java to StatusType.java
  E.   Write code for the dao package that includes repository interfaces for the entities that extend JpaRepository, and add cross-origin support.
- Created CartItemRepository.java in dao package
- Created CartRepository.java in dao package
- Created CountryRepository.java in dao package
- Created CustomerRepository.java in dao package
- Created DivisionRepository.java in dao package
- Created ExcursionRepository.java in dao package
- Created VacationRepository.java in dao package
- Added Cross-origin support to all Repository files
- Further fixed issue which caused Divisions to not display on front end
- Fixed cart.java and cartItem.java syntax errors
- Fixed import of RestDataConfig.java on line 3
- Fixed package location of DemoApplication.java on line 1
- Fixed Division.java and Customer.java table conflict. changed table to 'divisions' in Divisions.java on line 12
