# Translation-app

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
2. In application.yml add configuration for external API:
```
app:
    translator-url: https://translate.api.cloud.yandex.net/translate/v2/translate
    translator-api-key: insert_your_Yandex_API-KEY_here
```
### Obtaining a Yandex Translator API Key

To use the Yandex Translation API, follow these steps to get your API key:

1. Go to the [Yandex Cloud Console](https://console.cloud.yandex.ru/).
2. Create a new Yandex account or log in to your existing account.
3. Create a new folder in your Yandex Cloud account.
4. Enable the "Cloud Translation" API for your folder.
5. Create a new API key for the "Cloud Translation" service.

Refer to the [Yandex Translate API documentation](https://yandex.cloud/ru/docs/translate/concepts/api) for detailed instructions.

3. Build the project with Maven:
   ```sh
   mvn clean install
   ```

4. Run the application:
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
      "translatedText": "Здравствуйте, как являются ты?"
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
