🎧 iTunes Podcast Search App
A fullstack web application that allows users to search for podcasts using the iTunes Search API. The results are stored in a PostgreSQL database and displayed using a beautiful Thymeleaf frontend with Bootstrap styling.

📦 Technologies Used
Backend: Java, Spring Boot, Spring Data JPA, RestTemplate

Frontend: Thymeleaf, Bootstrap 5 (CDN)

Database: PostgreSQL

Build Tool: Maven

🚀 Features
Search podcasts by keyword using iTunes API

Automatically stores results in PostgreSQL

Displays results in a clean, card-based layout

Handles content type issues and API parsing

Beautiful UI with responsive design


 Prerequisites
Java 17 or higher

Maven installed

PostgreSQL running with a database named itunes

Internet connection (to access Bootstrap and iTunes API)

🛠️ Setup & Run
1. Clone the repository
git clone https://github.com/your-username/itunes-podcast-search.git
cd itunes-podcast-search

src/main/resources/application.properties

http://localhost:8080


🗂️ Project Structure

src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── controller/
│   │   ├── dto/
│   │   ├── model/
│   │   ├── repository/
│   │   └── service/
│   └── resources/
│       ├── templates/
│       └── application.properties

src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── controller/PodcastController.java
│   │   ├── controller/WebController.java
│   │   ├── dto/ItunesPodcastDto.java, ItunesResponse.java
│   │   ├── model/Podcast.java
│   │   ├── repository/PodcastRepository.java
│   │   └── service/ItunesService.java
│   └── resources/
│       ├── templates/index.html
│       ├── templates/results.html
│       └── application.properties

