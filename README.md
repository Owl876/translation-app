# TranslationAPI

## Overview

TranslationAPI is a web application designed to translate text from one language to another. This tool is ideal for developers seeking to integrate translation capabilities into their applications.

## Features

- **RESTful API**: Provides endpoints to translate text between different languages.
- **Multiple Languages**: Supports various language pairs for translation.
- **JSON Requests**: Accepts and returns data in JSON format.

## Prerequisites

- Java 17
- Maven 3.6+
- Spring Boot 2.6+

## Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/Owl876/translation-app
   cd translation-app
   ```

2. Build the project with Maven:
   ```sh
   mvn clean install
   ```

3. Run the application:
   ```sh
   java -jar target\TranslationAPI-0.0.1-SNAPSHOT.jar
   ```

## Usage

### Endpoint

- **Translate Text**: `POST /api/v1/translate`
  - **Request Body**:
    ```json
    {
      "textToTranslate": "Hello, how are you?",
      "originalLang": "en",
      "translatedLang": "ru"
    }
    ```
  - **Response**:
    ```json
    {
      "translatedText": "Здравствуйте, как есть ты?"
    }
    ```

### Example Request

Use `curl` to make a request:

```sh
curl -X POST http://localhost:8080/api/v1/translate \
-H "Content-Type: application/json" \
-d '{"textToTranslate": "Hello", "originalLang": "en", "translatedLang": "ru"}'
```

## Running Tests

Execute tests with Maven:

```sh
mvn test
```

## Project Structure

- **src/main/java**: Contains application source code.
- **src/test/java**: Contains test cases.
- **pom.xml**: Maven configuration file.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License.
