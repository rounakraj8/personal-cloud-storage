# Personal Cloud Storage

This repository houses the complete source code and design documents for a personal cloud storage application, encompassing:

1. **Design**: Conceptual, architectural, and UI/UX designs.
2. **Backend**: APIs and services.
3. **Frontend**: User interface code.

## About the Project

The Personal Cloud Storage application is designed to simplify and enhance personal data storage by integrating multiple cloud providers (AWS, GCP, Azure, OCI) into a unified platform. Key highlights include:

- **Centralized Cloud Management**: Users can add credentials for supported cloud providers and choose their preferred storage backend.
- **Customizable Storage Access**: Configure storage access frequency and usage patterns to suit personal needs.
- **Simplified Interface**: Encapsulates complex cloud operations into an easy-to-use interface.

### Technology Stack

- **Backend**: The backend is built using [Spring Boot](https://spring.io/projects/spring-boot), providing robust APIs for handling cloud credentials, storage configurations, and file management.
- **Frontend**: The frontend is developed with [React](https://reactjs.org/), ensuring a modern and responsive user interface.

## Repository Structure

```
|-- design/
|   |-- wireframes/
|   |-- architecture/
|   |-- ui/
|
|-- backend/
|   |-- src/
|   |-- tests/
|   |-- docs/
|
|-- frontend/
|   |-- src/
|   |-- tests/
|   |-- assets/
|
|-- README.md
```

### Design Directory
- **wireframes/**: Contains low-fidelity wireframes and mockups for the cloud storage application.
- **architecture/**: Holds system diagrams, architecture decisions, and workflows for integrating multiple cloud providers (AWS, GCP, Azure, OCI).
- **ui/**: High-fidelity UI designs and assets.

### Backend Directory
- **src/**: Application source code for handling cloud credentials, storage preferences, and file management.
- **tests/**: Unit and integration tests for backend services.
- **docs/**: Backend-specific documentation (e.g., API specifications for cloud interactions).

### Frontend Directory
- **src/**: Frontend source code for the user interface to manage cloud storage credentials and usage.
- **tests/**: Unit and end-to-end tests for the frontend application.
- **assets/**: Static files like images, fonts, and icons.

## How to Get Started

### Prerequisites
- [Node.js](https://nodejs.org/) for frontend development.
- [Java](https://www.oracle.com/java/) for backend development.
- [Docker](https://www.docker.com/) for containerization (optional).
- [Git](https://git-scm.com/) for version control.

### Cloning the Repository
```bash
git clone https://github.com/yourusername/yourrepo.git
cd yourrepo
```

### Running the Backend
1. Navigate to the `backend/` directory:
   ```bash
   cd backend
   ```
2. Follow the instructions in `backend/README.md` to set up and run the backend.

### Running the Frontend
1. Navigate to the `frontend/` directory:
   ```bash
   cd frontend
   ```
2. Follow the instructions in `frontend/README.md` to set up and run the frontend.

### Features
- **Multi-Cloud Integration**: Add credentials for AWS, GCP, Azure, or OCI and select a preferred cloud provider.
- **Storage Configuration**: Configure storage access frequency and usage limits.
- **Simplified Management**: Encapsulates the complexity of cloud management into a user-friendly interface.

### Contributing
We welcome contributions to improve this project. Please follow the [Contributing Guidelines](CONTRIBUTING.md).

### License
This project is licensed under the [MIT License](LICENSE).

### Contact
For inquiries, contact the maintainers at [your-email@example.com](mailto:your-email@example.com).

---

Feel free to explore and contribute to this repository. Let's make cloud storage more accessible!

