Mini Project Name : Enquiry of Building Project

Case Study: Enquiry of Building Project 

Problem Statement:

Fill and send the Enquiry form to the builder.

1) Go to the Builders site
2) Select the Contact Us to fill the details
3) Fill all the necessary details and submit the form
4) Find the villas that can be taken in to possession start date before December month of current year

Suggested site: https://ishahomes.com 


Detailed Description: 

1. Once the builders home page is launched in the specified browser, navigate to the <contact us> in "More" menu.
2. Enter the necessary text fields in the given form.
3. Select the project from the field.
4. Extract the number of available projects in the form and display in the console
5. Display the selected project and submit the form
6. Navigate to Buy Villas link
7. Extract the Area and city of the Villa projects which has more than 10 Units
8. Possession date should be on or before December month of current year
9. Capture the Screenshot of Property Status and Possession Dates
10. Close the Browser


Key Automation Scope: 

1. Execute in different Browsers
2. Extract the number of projects available with the builder
3. Display the selected project 
4. Filling form (in different objects in web page)

Note:
Implemented Thread.sleep() methods in 3 different places in code because of site Problem. some times site down itself it takes too much time to open.
In few instances, pageLoad time method or impicit or explicit waits are not working properly for this site.

1. IshaHomes_Test.java :
Contains main method
Object is created for AllMethods_invoking_IshaHomes class.
Print to Output_Console in output.txt file
Object calls different methods of AllMethods_invoking_IshaHomes

2. AllMethods_Invoking_IshaHomes.java
Invokes methods present in variours classes

3. DriverSetup.java
launchChrome() and launchFirefox() are started one after the other after successful execution.

4. closeAlertBoxes.java
This class has two methods:
  (i). closeAlertBox() - closes the popup alert which appears on the homepage of Ishahomes website.
  (ii). closeAlertBox1() - closes the live chat support which appears when we navigate to next page.

5. ContactUs.java
This class is used to find contact us link in Menu and navigated to contact us form.

6. ContactUsFill.java
Reading the values from Config.properties file and entering the information in necessary textfields. 
Displaying the selected project along with Available Projects in Output file.

7.Config.properties
By using data driven concept, input data is saved and exported from properties file.

8. AccessProperty.java
This class accesses the data present in Config.properties file

9. NavigateToBuyVilla.java
This class finds the locator of Buy Villas link and navigates to the villas page.

10.Extract_Area_and_City.java
This class extracts the area and city of each villa projects in Buy villas page.
If a project has more than 10 units then it navigates to that particular villa project page and extracts the area and city details of the project and prints in Output.txt file.
After successfully extracting area and city details of villa projects which has more than 10 units. We navigate back to Buy Villas Page.

11. ValidatePossessionDate.java
This class validates the date and status of the villa projects i.e., Ready to move in, Completed, Resale where possession date should be before December month of current year.
After successful validation, it prints the details in output.txt file and takes the Screenshot Property Status and Possession dates and stores the screenshots as .png file under Screenshot folder.

12. QuitBrowser.java
This class closes the instance of the current Webdriver instance after successful execution.
After Chrome Browser has closed, Firefox Browser is invoked and completes the execution.
