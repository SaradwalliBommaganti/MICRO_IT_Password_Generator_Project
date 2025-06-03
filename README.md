**Password Generator API:-***

A Spring Boot-based RESTful service to generate secure, customizable passwords based on user preferences such as length, use of uppercase/lowercase letters, digits, and symbols.


 **Features:-**

- Generate strong passwords dynamically.
- Customize password length.
- Toggle inclusion of:
  - Uppercase letters
  - Lowercase letters
  - Digits
  - Symbols
- REST API support with JSON request/response.

**Project Structure:-**

src/

└── main/

├── java/com/password/generator/

│ ├── controller/ → REST API controller

│ ├── model/ → Request and Response DTOs

│ └── service/ → Business logic implementation

└── resources/

└── application.properties


**Technologies Used:-**

- Java 17
- Spring Boot 3.4.5
- Maven
- REST API (JSON)
- SecureRandom (for cryptographically strong password generation)

**Clone & Run:-**

~~~
git clone https://github.com/SaradwalliBommaganti/MICRO_IT_Password_Generator_Project.git
cd MICRO_IT_Password_Generator_Project
mvn spring-boot:run
~~~

**The application will start on:**
http://localhost:8080

 **API Endpoint:-**
POST /api/password/generate
Generate a password based on user-defined parameters.

** Request Body (JSON) input:-**

~~~
{
  "length": 12,
  "useUppercase": true,
  "useLowercase": true,
  "useDigits": true,
  "useSymbols": true
}

~~~

** Response Body (JSON) output:-**

~~~
{
  "password": "G@5jH8v#Xq2L"
}

~~~

**Author**
Saradwalli Bommaganti
GitHub: @SaradwalliBommaganti

