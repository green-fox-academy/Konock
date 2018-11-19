## Data flow

### MVC
- MVC Pattern stands for Model-View-Controller Pattern. This design pattern is used to separate application's concerns.
- Model is the data of your application
	- represents an object or JAVA POJO carrying data
	- it can also have logic to update controller if its data changes
- View is the presentation of the data
	- represents the visualization of the data that model contains
- Controller is the brains/logic of your application
	- acts on both model and view
	- it controls the data flow into model object and updates the view whenever data changes
	- it keeps view and model separate.

### Components
- The model is the central component of the pattern. It is the application's dynamic data structure, independent of the user interface. It directly manages the data, logic and rules of the application.
- A view can be any output representation of information, such as a chart or a diagram. Multiple views of the same information are possible, such as a bar chart for management and a tabular view for accountants.
- The third part or section, the controller, accepts input and converts it to commands for the model or view.

### Layers
- Client side (what users see in browsers):
	- UI layer: in our case we will use HTML/JSP pages with JSTL and Spring forms
	- It should not contain any business logic
- Server side:
	- Controllers layer (Spring MVC)
		- handle all input requests from UI layer
		- perform input parameters validation
		- call necessary services
		- handle service responses
		- wrap response data in a convenient way and return back to the UI layer
	- Services layer (Spring)
		- implements all application business logic
		- ideally the service layer does not know anything about web requests or the database layer
		- accept model classes, perform some application business logic actions, call other services, call repositories layer and produce other model classes as a result
		- called from the controller layer. They might use repository classes to load or safe any information in the data layer
	- Repositories layer (Spring + Hibernate)
		- provide access (read and write data) to the data layer
- Data layer:
	- Any database you want

### Advantages of the MVC pattern
- loose coupling
- code separation allows to unit test the web application in a convenient way