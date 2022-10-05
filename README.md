[https://www.codurance.com/katalyst/password-validation](https://www.codurance.com/katalyst/password-validation)

# Iteration 1 - Basic password validation
## Goal
Design and implement a software that validates a password applying TDD.

The password will be introduced by the user (as an argument of the method) and should return if the password is valid or not.

A valid password should meet the following requirements:

- [ ] Have more than 8 characters
- [ ] Contains a capital letter
- [ ] Contains a lowercase
- [ ] Contains a number
- [ ] Contains an underscore

## Technical requirements:
We want a method that answers if the password is valid or not.
We don't want to know the reason when the password is invalid (the return value is a boolean)

#Iteration 2 - Rules abstraction
## Goal
Design and implement software that can adapt to different password validation rules TDD and focus on the OOP principles.

Let's pretend that now we want to create another type of password validations because on our app we need different type of passwords, such as:

**Validation 2:**

- [ ] Have more than 6 characters
- [ ] Contains a capital letter
- [ ] Contains a lowercase
- [ ] Contains a number

**Validation 3:**

- [ ] Have more than 16 characters
- [ ] Contains a capital letter
- [ ] Contains a lowercase
- [ ] Contains an underscore

## Things to practice
In this iteration, we should try to identify a good abstraction and try to work on OOP principles as well as on design patterns like Builder and Factory


# Base para hacer tests

Configuración básica para empezar a hacer una kata o aprender a hacer tests en los siguientes lenguajes:

- PHP y PHPUnit
- Javascript con Jest
- Java, Junit y Mockito
- Scala, Munit y Scalacheck
- Kotlin, JUnit5 y MockK
- C#, xUnit (con FluentAsertion) y NSubstitute (para mock)

# Configuración específica por lenguaje

## PHP
1. Instalar [composer](https://getcomposer.org/) `curl -sS https://getcomposer.org/installer | php`
2. `composer install` (estando en la carpeta php)
3. `./vendor/bin/phpunit`

## Javascript
1. Instalar [Node](http://nodejs.org/)
2. `npm install` (Estando en la carpeta javascript)
3. `npm test`

## Java
1. Instalar las dependencias y tests con Maven [mvn test]
2. Ejecutar los tests con el IDE

## Scala
1. `sbt` (en la carpeta scala)
2. `~test` para ejecutar los test en hot reload

### Linux/Mac
1. Instalar [SDKMan](https://sdkman.io/)
2. `sdk install java 11.0.12-open` instala OpenJDK
3. `sdk install sbt` una vez instalado SDKMan

### Windows
1. Instalar [OpenJDK](https://docs.microsoft.com/es-es/java/openjdk/download#openjdk-110141-lts--see-previous-releases)
2. Instalar [SBT](https://www.scala-sbt.org/download.html)

### Visual Studio Code
1. Descargar [Visual Studio Code](https://code.visualstudio.com/)
2. Instalar para VS Code [Metals](https://scalameta.org/metals/docs/editors/vscode)

## Kotlin
1. Por consola: Puedes instalar dependencias y lanzar los tests con `gradlew test`
2. Usando IDE: Simplemente abre el proyecto desde el raiz de la plantilla Kotlin

## C#
1. Instalar Microsoft Visual Studio Community 2022
2. Abre el proyecto y se descargaran automáticamente los paquetes Nuguet necesarios

## Python
1. Instalar python 3.x
2. Una vez descargado el código fuente dentro de la carpeta */python/ creamos un virtual enviroment:
3. `python3 -m venv env`
4. Activamos en virtual environment:
- windows: `.\env\Scripts\activate.bat`
- linux/mac: `source env/bin/activate `
5. `pytest` para ejecutar los tests.


# Documentación
## Javascript
[Jest](https://jestjs.io)

## PHP
[PHPUnit](https://phpunit.readthedocs.io/)

[Prophecy](https://github.com/phpspec/prophecy) para dobles de prueba

## Java
[JUnit](https://github.com/junit-team/junit/wiki)

[Mockito](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html)

## Scala

[Munit](https://scalameta.org/munit/docs/tests.html)

[Scalacheck](https://github.com/typelevel/scalacheck/blob/main/doc/UserGuide.md) para testing basado en propiedades

## Kotlin
[JUnit5](https://junit.org/junit5/)

[MockK](https://mockk.io/)

## C# 
[xUnit](https://xunit.net/)
[NSubstitute](https://nsubstitute.github.io/help.html)
[FluentAssertions](https://fluentassertions.com/introduction)
