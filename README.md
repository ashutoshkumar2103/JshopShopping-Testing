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

▶ Languages, Tools & Frameworks Used:

Language: Java
Framework: TestNG
API Library: Rest Assured
Build Tool: Maven
Test Reporting: Surefire Reports (Default)

▶ Installation Requirements:

Before running the automation suite, ensure the following tools are installed:

Java JDK (latest recommended version)
Maven
IDE (Eclipse, IntelliJ IDEA, or VS Code)
Backend server running locally (http://localhost:8080)

▶ Project Dependencies:

Make sure the following dependencies are present in the pom.xml:

Rest Assured
TestNG
Gson / JSON path (optional)
Maven Surefire Plugin

▶ Usage Instructions (How to Run):

Clone or download the project.
Open the project in your preferred IDE.
Ensure the backend application (JShop Spring Boot App) is already running.

Run tests using testNG Suite

▶ Maintainer of the Project:

Project Author: Ashutosh Kumar
Role: Test Engineer

Note: Backend part is also written by me.
