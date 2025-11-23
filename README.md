JShop API Automation Testing Project

▶ Project Description:

The JShop API Testing Project is an automated backend testing framework designed to validate the REST APIs of the JShop Shopping Platform. The framework is built using Java, TestNG, and Rest Assured, focusing on functional validation of core e-commerce flows such as authentication, product operations, cart actions, and order processing.
The goal of this testing project is to ensure that all backend endpoints behave as expected, return valid HTTP responses, handle errors gracefully, and maintain data integrity.
_____

▶ Testing Scope Includes:

1. Authentication Testing
- Login validation, invalid user, missing fields.

2. Product Endpoint Testing
- Fetch all products, single product details, product availability.

3. User Actions and Cart Testing
- Add to cart, remove from cart, get cart details.

4. Order / Checkout Flow
- Place order, validate order response, negative invalid order attempts.
___

▶ Languages, Tools & Frameworks Used:

1. Language: Java
2. Framework: TestNG
3. API Library: Rest Assured
4. Build Tool: Maven
5. Test Reporting: Surefire Reports (Default)
___

▶ Installation Requirements:

Before running the automation suite, ensure the following tools are installed:

1. Java JDK (latest recommended version)
2. Maven
3. IDE (Eclipse, IntelliJ IDEA, or VS Code)
4. Backend server running locally (http://localhost:8080)
___

▶ Project Dependencies:

Make sure the following dependencies are present in the pom.xml:

1. Rest Assured
2. TestNG
3. Gson / JSON path (optional)
4. Maven Surefire Plugin
___

▶ Usage Instructions (How to Run):

Clone or download the project.
Open the project in your preferred IDE.
Ensure the backend application (JShop Spring Boot App) is already running.

Run tests using testNG Suite
___

▶ Maintainer of the Project:

Project Author: Ashutosh Kumar
Role: Test Engineer
********
***________***

# JSpider Shopping Platform

▶ Project Description:

The JSpider Shopping Platform is a Java based e-commerce platform built using the Hibernate and Spring Boot frameworks, using MySQL as the back-end database. This is designed with three main user roles: Admin, Product Owner, and User.
1. Admin: Admin has the responsibility to verify products added by Product Owners and manage user and product owner sign ups. Users and Product owners can access the platform only after verification is done.
2. Product Owner: Product Owners has the authority to add new products, view all purchases made by users, and also update product details if needed.
3. User: Users can browse shopping platforms and make purchases on the platform.
___

▶ Languages and Frameworks:
­1. Primary Language: Java
2. ­Frameworks: Hibernate, Spring Boot
­3. Database: MySQL
___

▶ Installation:
Before running the JSpider Shopping Platform, ensure you have the following prerequisites installed:
1. ­Eclipse and STS (Spring Tool Suite) for Spring Boot development. (https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2024-09/R/eclipse-inst-jre-win64.exe) and (https://spring.io/tools)
­2. MySQL for database support. (https://dev.mysql.com/downloads/installer/)
­3. Postman for API calls (https://www.postman.com/downloads/)
___

▶ Dependencies:
To run the project successfully, make sure you have the following dependencies added to your project:
­1. Lombok (https://projectlombok.org/)
­2. Spring Boot Dev Tools
­3. MySQL Driver
­4. Spring Data JPA
­5. Spring Web
­6. H2 Database (for development and testing)
___

▶ Usage:
1. Clone the project from the repository. (You should have downloaded the project through spring initializr, adding the needed dependencies and mentioning the needed details)
2. Import the project into your Eclipse or STS environment.
3. Configure your MySQL database settings in the application.properties file.
4. Build and run the project (run as spring boot app)
5. Open your web browser and navigate to the appropriate URL to access the platform.
___

▶ Maintainer of the project:
­Project Author: Ashutosh Kumar


**Note: Backend part is also written by me.**
