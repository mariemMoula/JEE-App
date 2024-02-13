# JEE Web Application Project

This project is a Java Enterprise Edition (JEE) web application developed using Servlets, JSP files, sessions, cookies, and configured with a `web.xml` file. It serves as a basic form-based web application.

## Features

- **Form Submission:** Allows users to submit their name and surname via a web form.
- **Session Management:** Utilizes session management to maintain user data across multiple requests.
- **Cookie Handling:** Implements cookies to store user information locally on the client's browser.

### Directory Structure

- **src/com.testingservlets.servlets:** Contains Servlet classes handling form submission and request processing.
- **src/com.test.forms:** Includes form handling classes for data validation and processing.
- **WEB-INF:** Directory containing JSP files and configuration files.
  - **WEB-INF/formulaire.jsp:** JSP file for user input form.
  - **WEB-INF/Received.jsp:** JSP file for displaying submitted data.
  - **WEB-INF/error.jsp:** JSP file for error handling.
- **web.xml:** Deployment descriptor file for configuring servlet mappings and other settings.

### Technologies Used

- **Java Servlets:** Handle HTTP requests and responses.
- **JavaServer Pages (JSP):** Generate dynamic web content.
- **Sessions:** Maintain user data across multiple requests.
- **Cookies:** Store user information locally on the client's browser.
