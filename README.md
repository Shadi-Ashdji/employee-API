Simple Employee Database REST API 
By Shadi Ashdji

Functions:
Get, delete, and add employees into an h2 Springboot database controlled through HTTP requests.

Description: 
Uses Springboot to setup and facilitate the data transmission of the Employee database. Uses controller and JPA repository for function implementation.

Start up directions:
Store the application, use 'git clone <github url>' in terminal.
Next, use 'cd emp_api' to access the app folder. Then 'mvn spring-boot:run' to start up the database app.

API Endpoints:
GET -> /employees -- Retrieves all employees
DELETE -> /employees/{id} -- Deletes employee with matching ID
POST -> /employees with Json text -- Adds employee

Example of Json text to add employee:
/employees 
{
 "empID": 123456,
  "fName": "Shadi",
  "lName": "Ashdji",
  "email": "example@mail.ocm",
  "department": "CS",
  "isRemote": true
}
