# Demo-J.S.T.H-Website-WebApp-Project

This is a simple web application built using **Java**, **Spring Boot**, **Thymeleaf**, and **H2 Database**. The application features user authentication, including login and registration capabilities.

## Project Structure

```
Demo-J.S.T.H-Website-WebApp-Project/
│
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
├── .vscode/
│   └── settings.json
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── controller/
│   │   │       │   └── DemoController.java
│   │   │       ├── model/
│   │   │       │   └── DemoModel.java
│   │   │       ├── repository/
│   │   │       │   └── DemoRepository.java
│   │   │       ├── service/
│   │   │       │   └── DemoService.java
│   │   │       └── DemoApplication.java
│   │   ��── resources/
│   │   │   ├── static/
│   │   │   │   └── css/
│   │   │   │       └── styles.css
│   │   │   ├── templates/
│   │   │   │   ├── about.html
│   │   │   │   ├── index.html
│   │   │   │   ├── login.html
│   │   ��   │   └── signup.html
│   │   │   └── application.properties
│   └── test/
│       └── java/
│           └── com/example/demo/
│               └── DemoApplicationTests.java
├── target/
│   ├── classes/
│   ├── generated-sources/
│   ├── generated-test-sources/
│   ├── maven-archiver/
│   ├── maven-status/
│   ├── surefire-reports/
│   ├── test-classes/
│   ├── demo-0.0.1-SNAPSHOT.jar
│   └── demo-0.0.1-SNAPSHOT.jar.original
├── .gitattributes
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Spring Boot Application: `DemoApplication.java`

The application's entry point is [`DemoApplication.java`](src/main/java/com/example/demo/DemoApplication.java). It initializes the Spring Boot application and sets up the necessary configurations.

### Key Features

- **User Authentication**: Users can register and log in.
- **MVC Architecture**: Utilizes Spring Boot's MVC framework.
- **In-Memory Database**: Uses H2 for development and testing.
- **Template Rendering**: Employs Thymeleaf for dynamic HTML content.

### Routes

- **Home** (`/`)
- **Login** (`/login`)
- **Signup** (`/signup`)
- **About** (`/about`)

## How to Run the Project

1. **Clone the Repository**

   ```bash
   git clone https://github.com/your-repo/Demo-J.S.T.H-Website-WebApp-Project.git
   cd Demo-J.S.T.H-Website-WebApp-Project
   ```

2. **Build the Project with Maven**

   ```bash
   ./mvnw clean install
   ```

3. **Run the Spring Boot Application**

   ```bash
   ./mvnw spring-boot:run
   ```

4. **Access the Application**

   Open your web browser and navigate to `http://localhost:8080`.

---

## Additional Details

### `application.properties`

Located at [`src/main/resources/application.properties`](src/main/resources/application.properties), this file contains configuration settings for the application, such as database connectivity and logging levels.

### `pom.xml`

The [`pom.xml`](pom.xml) file lists the project's dependencies and build configurations:

```xml
<dependencies>
    <!-- Spring Boot Starters -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!-- Spring Data JPA for ORM -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <!-- H2 Database for testing -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <!-- Lombok to reduce boilerplate code -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <scope>provided</scope>
    </dependency>
    <!-- Testing libraries -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

To install the dependencies:

```bash
./mvnw clean install
```

---

## Technologies Used

- **Java**: Primary programming language.
- **Spring Boot**: Framework for building the web application.
- **Thymeleaf**: Server-side Java template engine.
- **Spring Data JPA**: For database operations.
- **H2 Database**: In-memory database for development.
- **HTML/CSS**: Frontend layout and styling.

---

## Tech Stack Overview

### Frontend

1. **HTML**: Structures the web pages.
2. **CSS**: Styles the web pages, with custom styles in 

styles.css

.

### Backend

1. **Spring Boot**: Framework for building Java applications.
2. **Spring Data JPA**: Simplifies database interactions.
3. **Lombok**: Reduces boilerplate code in Java classes.

### Database

1. **H2 Database**: An embedded, in-memory database used for storing user data during development and testing.

### Build and Dependency Management

1. **Maven**: Manages project builds and dependencies.

### Testing

1. **JUnit**: Framework for writing and running tests.
2. **Spring Boot Test Starter**: Provides testing libraries for Spring Boot applications.

---

### Summary of Tech Stack

- **Frontend**: HTML, CSS
- **Backend**: Java, Spring Boot
- **Database**: H2 Database
- **Build Tools**: Maven, Lombok
- **Testing**: JUnit, Spring Boot Test Starter

This tech stack provides a robust foundation for developing a web application that is easy to maintain and scalable for future enhancements.
