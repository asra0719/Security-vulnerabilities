# Security-vulnerabilities

## Overview

This project is a part of the Computer and Network Security course, aiming to study fundamental security vulnerabilities in computer systems, networks, and web applications. This lab focuses specifically on implementing and understanding SQL injection attacks and learning how to secure applications against such attacks.

## Objectives

- Understand the fundamentals of Internet security vulnerabilities.
- Simulate basic security vulnerabilities, specifically SQL injection.
- Learn techniques to secure applications from SQL injection attacks.

##Tasks

1. **Create SQL Database Schema**: 
   - Implement a database schema using Java and MySQL.
   - Create a table called `UserTable` with fields: `id`, `username`, `password`, and `age`.

2. **Insert Sample Data**: 
   - Populate `UserTable` with sample data for testing SQL injection techniques.

3. **Develop a Data Retrieval Application**:
   - Establish a connection to the database using JDBC and retrieve user data based on specific queries.

4. **Implement SQL Injection Techniques**:
   - Simulate two types of SQL injection:
     - **Blind SQL Injection**: Exploit vulnerabilities without directly seeing query results.
     - **Second-Order SQL Injection**: Execute malicious code through indirect interactions with the database.

5. **Secure the Application**:
   - Update the code to prevent SQL injection by implementing prepared statements and input validation.

## Setup Instructions

### Prerequisites

- **Java JDK**: Version 8 or later
- **MySQL**: A running MySQL server
- **JDBC Driver**: MySQL Connector for Java (mysql-connector-java.jar)

