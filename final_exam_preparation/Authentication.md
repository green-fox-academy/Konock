# Authentication

### Authentication vs Authorization


### Token

- A set of characters that can consist any information we decide to store in it
- usually encrypted
- What is usually stored in tokens?
	- access tokens: contains the security credentials for a login session and identifies the user
	- session tokens: contains the session identifier, typically used with unregistered visitors, not a good practice for identifying users
	- refresh tokens: necessary as an access token is only secure if it has an expiration date, contains the information required to obtain a new access token

### JWT
- short for JSON Web Token
- compact way for securely transmitting information between parties as a JSON object
- verified and trusted because it is digitally signed
- consists of 3 main parts:
	- header
		- type of the token
		- hashing algorithm being used
		- JSON is Base64Url encoded to form the first part of the JWT.
	- payload (contains claims which are not mandatory but recommended)
		- iss (issuer)
		- exp (expiration time)
		- sub (subject)
		- JSON is Base64Url encoded to form the Second part of the JWT.
	- signature
		- takes the encoded header, the encoded payload, a secret, the algorithm specified in the header, and signs it

- Once the user is logged in, each subsequent HTTP request will include the JWT, allowing the user to access:
	-  routes 
	-  services
	-  resources that are permitted with that token
- JWT vs OAuth: JWT is a type of Token, and OAuth is a Framework that describes how to dispense tokens. It does not describe, however, what type of tokens should be used and JWT is a commonly used token solution.

### Find user by token

- When the token is received by the server, it's decrypted and based on the user data in the payload, the logged in user can be authenticated.

### Status (401, 403)

- HTTP Status code 401 - Unauthorized: means that the user has not been authenticated by the server (is not logged in)
- HTTP Status code 403 - Forbidden: means that the logged in user does not have the authorization to access the content