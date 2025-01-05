# Social Media Platform

Welcome to the **Social Media Platform**! This is a social media application that allows users to create posts, comment on posts, and interact with other users. This platform provides the basic functionality for users to communicate and share their thoughts with others.

## Features

- **User Registration & Authentication**: Users can register and log in to their accounts.
- **Create Posts**: Users can create text-based posts and share them with others.
- **Post Comments**: Users can comment on posts to start conversations.
- **User Profiles**: Users have personal profiles that display their posts and comments.
- **Post Interactions**: Users can view, like, and comment on posts made by other users.

## Tech Stack

- **Frontend**: Java Swing (for the graphical user interface)
- **Backend**: Java with JDBC for database interaction
- **Database**: Oracle Database
- **Authentication**: Basic login and session management
- **Other Libraries**: JavaFX (for UI elements), SQL for database queries

## Getting Started

To get started with the Social Media Platform on your local machine, follow these steps:

### Prerequisites

1. **Java Development Kit (JDK)**: Ensure you have JDK 8 or higher installed.
   - [Download JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
   
2. **Oracle Database**: Install Oracle Database and set up the required tables.
   - [Oracle Database Documentation](https://docs.oracle.com/en/database/)
   
3. **IDE**: Use an IDE like IntelliJ IDEA or Eclipse for development.
   
4. **SQL Client**: You can use any SQL client (e.g., Oracle SQL Developer) to interact with your database.

### Installing

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/socialmediaplatform.git
2. **Set up the Database:**
  Create the required tables in your Oracle Database. You can find the SQL scripts for creating the tables in the database/ folder.
  Configure Database Connection:
3.**Configure Database Connection:**
  Modify the Database class to point to your Oracle Database instance by updating the connection string, username, and password.
  Run the Application:
4.**Run the Application:**
  Open the project in your IDE.
  Compile and run the Main class to start the application.

### Usage
Create an Account: Open the app and register by providing a username, email, and password.
Login: Use your credentials to log in and access your profile.
Create a Post: After logging in, you can create a post by typing your message and clicking the 'Post' button.
Comment on Posts: View posts from other users and leave comments.
View User Profiles: Click on a user’s name to view their profile, including their posts and comments.
### Database Schema
The following tables are required for the application:

1.**users**
ID (INT, Primary Key)
FirstName (VARCHAR)
LastName (VARCHAR)
Email (VARCHAR, Unique)
Password (VARCHAR)
2.**posts**
ID (INT, Primary Key)
UserID (INT, Foreign Key to users table)
Content (TEXT)
DateTime (DATETIME)
3.**comments**
ID (INT, Primary Key)
PostID (INT, Foreign Key to posts table)
UserID (INT, Foreign Key to users table)
Content (TEXT)
DateTime (DATETIME)
### Contributing
We welcome contributions to improve the platform! If you would like to contribute, please fork the repository and submit a pull request with your changes. Be sure to follow the code style and provide clear commit messages.
