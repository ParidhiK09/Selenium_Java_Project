### Selenium Java Automation Framework

This project is a Selenium-based automation framework implemented using Java, Maven, TestNG, and Extent Reports. It follows the Page Object Model (POM) design pattern for enhanced maintainability and readability of test code.

#### Folder Structure

![img.png](img.png)

#### ▶️ How to Execute the Framework

##### ✅ Pre-requisites

Ensure the following are installed and configured on your system:

Java JDK (11 or above)
Maven (3.6 or above)
Any IDE (Eclipse, IntelliJ IDEA, etc.)
Chrome / Firefox browser (as per test configuration)

##### 🔧 Build the Project

Use Maven to download dependencies and build the project.

    * mvn clean install

##### 🧪 Run Test Suite

You can execute tests using any of the following methods:

1. Using testng.xml from IDE
Open testng.xml in your IDE.
Right-click on the file.
Select "Run As > TestNG Suite".

2. Using Maven Command Line
mvn test -DsuiteXmlFile=testng.xml

You can also pass parameters via Maven:

mvn test -Dbrowser=chrome -DsuiteXmlFile=testng.xml

Ensure the test suite and parameter support is correctly handled in your framework.

3. Using CI/CD Pipeline (Optional)
   If integrated with Jenkins, Azure DevOps, or Bitbucket Pipelines, configure the job to:

Pull the latest code

Run the Maven test command

Archive test reports

##### 📁 Test Reports

After execution:

    Navigate to the Automation Folder (for default TestNG reports).
    Navigate to the reports/ folder (or your configured path) for Extent Reports.


#### 🚀 Setup Instructions
1. Clone the Repository

    git clone <repository_url>

2. Import into IDE

   * Open the project in any supported IDE like Eclipse or IntelliJ IDEA.

3. Execute Test Suite

   * Run the test.xml file located in the root directory to start test execution.

#### 📁 Project Structure

🔹 actionHelper
Contains reusable and commonly used web action methods.

WebActionHelperMethods.java
Defines reusable functions such as click(), scroll(), enterText() etc.

🔹 driverManager
Handles browser driver initialization and management.

DriverManagerType.java
Enum defining supported browser types (e.g., CHROME, FIREFOX).

WebDrivers.java
Contains logic to initialize browser drivers based on the type defined in DriverManagerType.

🔹 listeners
Manages test lifecycle events using TestNG Listeners.

TestListener.java
Implements ITestListener to track test execution events and supports Extent Report integration.

Key overridden methods:

onTestStart() – Triggered before a test method starts

onTestSuccess() – Triggered after a test method completes successfully

onTestFailure() – Triggered on test failure; can be extended to capture screenshots

onTestSkipped() – Triggered when a test is skipped

onFinish() – Triggered after all test methods complete

🔹 reportManager
Manages test reporting using Extent Reports.

ExtentManager.java
Responsible for initializing and configuring the Extent Report instance.

🔹 pages
Houses all Page Object classes representing different screens of the application.

BasePageClass.java
Initializes page objects using PageFactory.initElements().

HomePage.java, LoginPage.java
Contains web element locators and user actions for respective pages.

🔹 testCases
Contains the actual TestNG test classes.

BaseTest.java
Initializes WebDriver, test configurations, and page objects before executing tests.

#### 📊 Reporting

The framework uses Extent Reports to generate detailed HTML reports summarizing:

Test case execution results (Pass/Fail/Skip)

Screenshots on failure

Execution time per test

Step-level reporting (if extended)