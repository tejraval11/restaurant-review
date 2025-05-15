🍽️ Restaurant Review Platform
A full-stack restaurant discovery and review web application built using Java Spring Boot, React.js, Elasticsearch, and Docker, designed to provide intuitive search, user-driven content, and location-based recommendations.

🚀 Features
🔐 Authentication & Authorization using Keycloak (OAuth2)
📍 Geospatial Search for finding nearby restaurants
📝 User Reviews with filtering options (highest/lowest rating, newest/oldest)
🔍 Fuzzy & Partial Text Search via Elasticsearch
🖼️ Image Uploads with local storage and dynamic URL generation
📊 Dynamic Star Ratings aggregated from user reviews
🧭 Nearby Restaurant Suggestions based on selected restaurant
🛠️ Admin Features for managing restaurants and associated reviews
📦 Dockerized Environment for easy deployment
📈 Kibana Integration for managing Elasticsearch indexes
🛠️ Tech Stack
Backend
Java Spring Boot – RESTful API development
Elasticsearch – Advanced full-text and geolocation search
Kibana – Index monitoring and visualization
Keycloak – OAuth2-based authentication
Docker – Containerization for services
Frontend
React.js – Responsive and dynamic user interface
Axios – API requests
Tailwind CSS (optional) – UI styling
Others
Local File System – For storing and serving restaurant images
🧑‍💻 User Functionality
View all restaurants on the landing page with average star ratings.
Click a restaurant to:
View full review history
Filter reviews by date or rating
See nearby restaurant suggestions
Authenticated users can:
Create, update, and delete their own restaurants
Write reviews on any restaurant
Upload images during creation or update
📦 Deployment
All services are containerized with Docker. You can bring the platform up using:

docker-compose up --build
Ensure you have the following:

Docker & Docker Compose installed

Keycloak configured for OAuth2

Elasticsearch and Kibana services running and properly linked

🔍 Elasticsearch Usage
Stores restaurant and review data for efficient querying

Supports:

Partial text matching

Fuzzy queries

Geospatial queries (e.g., show restaurants within X km)

Indexed via REST API from the backend

📷 Image Handling
Images are uploaded via frontend form

Stored locally on the server

URLs are dynamically created and served to frontend


📚 Future Enhancements
Integrate cloud-based image storage (e.g., AWS S3)

Implement user roles (admin/moderator)

Pagination and infinite scroll for reviews

🧾 License
MIT License

👤 Author
Tej Raval
📧 tejraval.connect@gmail.com
🔗 GitHub
🔗 LinkedIn
