# Endpoint

### Parts of the URL
- URI: Uniform Resource Identifier. A set of readable characters to locate the resource
- URL: Uniform Resource Locator. A type of URI that contains the means to access the resource. It consists of the following:
	- A scheme: identifies the protocol (HTTP or HTTPS)
	- A host: identifies the host of the resource (www.example.com or an IP address), optionally it contains the port number
	- A path: identifies the specific resource on the server (/index.html)
	- A query string: provides additional information for the server, like a parameter
- So a complete URL looks something like this:
	`scheme://host:port/path?query`
- **Query params**:
	- start with `?` which is a separator
	- more params are divided by `&`
	- the rest is composed of key-value pairs divided by the `=` sign, i.e. `value=5`
	- the order of the parameters does not matter

### HTTP Protocol - HyperText Transfer Protocol
 - application layer protocol that allows web-apps to communicate with each other
 - it is connectionless: after the request, the client disconnects from the server
 - it is stateless: the client and the server are unaware of the state of each other. When a package is sent by the server, it does not expect an acknowledgment that it arrived.
 - any kind of data can be sent

### HTTPS & SSL
- an extension of HTTP, S stands for secure
- in HTTPS, the communication protocol is encrypted using either TLS or SSL
- See how the secure connection is established below:
![](https://www.powersolution.com/wp-content/uploads/2013/04/SSL-flowchart.png)

### Request/Response cycle
- client and server communicate through HTTP requests and responses
- a HTTP message consists of three parts:
	1. Start line: describes the HTTP method (GET), the URI and the HTTP version, or in a HTTP response the status code
	2. Header - consists of name-value pairs (i.e. host)
	3. Body (optional) - i.e. data sent in a response by the server (html page)

### HTTP status codes
- 1xx Informational response
	- indicates that the request was received and understood
- 2xx Success
	- indicates that the action requested was accepted and processed
- 3xx Redirection
	- indicates the client must take additional action to complete the request
- 4xx Client errors
	- indicates that there was an error caused by the client
	- the request sent cannot be processed (Bad Request)
	- the request is unauthorized or unauthenticated
	- the requested source could not be found
- 5xx Server errors
	- indicates that the server failed to fulfill the request
	- most generic error message: 500 Internal Server Error

### REST
- short for: Representational State Transfer (REST)
- a software architectural style that defines a set of rules to be used for creating web services
	- meaning that REST is not a new feature of the web, it is rather a standard we nowadays use when developing a web service
-  Parts of the REST specification are:
	- Method information (that is, what method to use for completing our request) for the server should be expressed in HTTP verb
		- i.e if you want the server to delete something, use the DELETE HTTP method
	- Scoping information should go in the URI
		- examine: `DELETE api/users/userId HTTP/1.1`
	- for more details and further rules of the REST specification, check out [Wikipedia](https://en.wikipedia.org/wiki/Representational_state_transfer#Architectural_constraints)
-  APIs or Web Services that follow these specifications are called REST APIs or RESTful Services
-  The below is a simplified example of a RESTful web service's architecture but the ShelterApp we built was also based on the REST architecture constraints
![](https://www.phpflow.com/wp-content/uploads/2012/07/rest-websrvices.jpg)
- the response sent by the server uses a common data format (JSON or XML)
- if something's still not clear after reading this, check out [this video](https://www.youtube.com/watch?v=FOZtRzY5x8E)