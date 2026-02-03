# Node.js REST API Demo

A simple RESTful API server demonstrating Express.js development with GitHub Copilot.

## Features

- RESTful API endpoints (GET, POST, PUT, DELETE)
- User management system
- Health check endpoint
- Comprehensive test suite with Jest
- Error handling and validation
- In-memory data store

## Installation

```bash
npm install
```

## Usage

### Start the Server

```bash
npm start
```

The server will start on `http://localhost:3000`

### API Endpoints

- `GET /` - Welcome message and API information
- `GET /api/health` - Health check
- `GET /api/users` - Get all users
- `GET /api/users/:id` - Get user by ID
- `POST /api/users` - Create new user
- `PUT /api/users/:id` - Update user
- `DELETE /api/users/:id` - Delete user

### Example Requests

```bash
# Get all users
curl http://localhost:3000/api/users

# Get specific user
curl http://localhost:3000/api/users/1

# Create new user
curl -X POST http://localhost:3000/api/users \
  -H "Content-Type: application/json" \
  -d '{"name":"John Doe","email":"john@example.com"}'

# Update user
curl -X PUT http://localhost:3000/api/users/1 \
  -H "Content-Type: application/json" \
  -d '{"name":"Jane Doe"}'

# Delete user
curl -X DELETE http://localhost:3000/api/users/1
```

## Testing

```bash
# Run all tests
npm test

# Run tests in watch mode
npm run test:watch
```

## Response Format

All API responses follow this format:

```json
{
  "success": true,
  "data": {...}
}
```

Error responses:

```json
{
  "success": false,
  "error": "Error message"
}
```
