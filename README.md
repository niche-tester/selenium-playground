# selenium-playground
basic framework for learning selenium 

## Getting Started

### To import this project (In IntelliJ):
- First clone the repo
- Open IntelliJ and select 'Open Project'
- Once the file explorer is displayed, locate the repository folder and **only select the build.gradle** file 
  IntelliJ will prompt you to choose whether to 'Open the file' or  'Open as a project'
- Select **Open as project**
  The project will automatically download all dependencies
  
## Project Files

### BaseTest
* This class is reponsible for starting and quitting the selenium driver
* This is also where you would add the various browser configuration (Currently there is just the Firefox Driver)
* The website url is also specified here, so update this if you plan to automated another website

### SampleTest.java
* This contains the test method that runs the basic test scenario
* If you want to add more tests, add a new method but make sure it starts with ```@Test``` annotation 

## Executing Tests
* Right click on the ```SampleTest.java``` class and click Run
* The firefox browser will be automatically invoked and run the specified test


## Troubleshooting
You might face the following issue when trying to execute the SampleTest in IntelliJ:

```java
FAILURE: Build failed with an exception.
* What went wrong:
Execution failed for task ':test'.
> No tests found for given includes: [SampleTest](filter.includeTestsMatching)
```

To fix this, go to IntelliJ Settings/Preferences and follow these steps:
* Select  ```Build, Execution, Deployment``` -> ```Build Tools``` -> ```Gradle```
* In the ```Build and Run``` section make sure the following options are set:

 ```Build and Run using:``` = ```IntelliJ IDEA```
 
 ```Run tests using: ``` = ```IntelliJ IDEA```

