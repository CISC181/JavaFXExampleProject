module JavaFXExamples {
	exports HelloWorld.application;
	exports Login.application;
	exports LoginCSS.application;
	exports LoginFXML.application;
	exports Transitions.application;
	
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	
	opens LoginFXML.application;
}