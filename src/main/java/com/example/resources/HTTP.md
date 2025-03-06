# HTTP (Hypertext Transfer Protocol)

## What is HTTP?
HTTP (Hypertext Transfer Protocol) is the foundation of communication on the World Wide Web. It is a stateless, application-layer protocol used to transfer hypertext data such as HTML documents, images, and other resources between clients (browsers) and servers.

### Features of HTTP:
- **Stateless**: Each request is independent; the server does not retain session information.
- **Connectionless**: After a request is made, the client disconnects from the server.
- **Text-based protocol**: HTTP messages are readable by humans.
- **Uses TCP/IP**: Typically operates over TCP (port 80 for HTTP, port 443 for HTTPS).

## HTTP Methods
HTTP defines several request methods to perform different actions on a resource:

| Method  | Description |
|---------|-------------|
| **GET** | Retrieves data from the server without modifying it. |
| **POST** | Sends data to the server to create a new resource. |
| **PUT** | Updates or replaces an existing resource. |
| **DELETE** | Removes a specified resource. |
| **PATCH** | Partially updates an existing resource. |
| **HEAD** | Similar to GET, but only retrieves headers. |
| **OPTIONS** | Returns the HTTP methods available for a resource. |
| **TRACE** | Echoes back the received request. |

## HTTP Status Codes
HTTP responses include a status code indicating the outcome of the request:

### 1xx - Informational
- `100 Continue`
- `101 Switching Protocols`

### 2xx - Success
- `200 OK`
- `201 Created`
- `204 No Content`

### 3xx - Redirection
- `301 Moved Permanently`
- `302 Found`
- `304 Not Modified`

### 4xx - Client Errors
- `400 Bad Request`
- `401 Unauthorized`
- `403 Forbidden`
- `404 Not Found`

### 5xx - Server Errors
- `500 Internal Server Error`
- `502 Bad Gateway`
- `503 Service Unavailable`

## HTTP Headers
Headers provide additional information about the request and response.

### Common Request Headers
- `User-Agent`: Identifies the client (browser, application).
- `Accept`: Specifies the acceptable response formats.
- `Authorization`: Contains authentication credentials.

### Common Response Headers
- `Content-Type`: Specifies the media type of the response.
- `Set-Cookie`: Stores session data.
- `Cache-Control`: Defines caching policies.

## HTTPS (HTTP Secure)
HTTPS is a secure version of HTTP that encrypts data using SSL/TLS.
- Uses **port 443** instead of 80.
- Ensures **data integrity and confidentiality**.
- Uses certificates to establish trust.

## HTTP vs. HTTPS
| Feature | HTTP | HTTPS |
|---------|------|-------|
| Security | Unencrypted | Encrypted using SSL/TLS |
| Port | 80 | 443 |
| Data Integrity | Vulnerable to attacks | Secure |

## cURL (Client URL)
cURL is a command-line tool to make HTTP requests.

### Basic cURL Commands
- **GET request:**
  ```sh
  curl -X GET https://example.com
  ```
- **POST request with data:**
  ```sh
  curl -X POST -d "name=John" https://example.com
  ```
- **Send headers:**
  ```sh
  curl -H "Authorization: Bearer TOKEN" https://example.com
  ```
- **Follow redirects:**
  ```sh
  curl -L https://example.com
  ```

This document provides a fundamental understanding of HTTP, its methods, headers, status codes, HTTPS, and using cURL for requests.
