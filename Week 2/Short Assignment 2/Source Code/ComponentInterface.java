import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComponentInterface implements EventHandler<ActionEvent>{

	String currentFile;
	ClientApplication components = new ClientApplication();
	
	public Button createDefaultFileButton (){
		Button defaultFileButton = new Button("Default Bean");
		defaultFileButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                setDefaultFile();
            }
        });
		return defaultFileButton;
	}
	public Button createDisplayButton (){
		Button displayButton = new Button("Display Results");
		displayButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                displayBean();
            }
        });
		return displayButton;
	}
	
	private void setDefaultFile(){
		currentFile = "src\\Reading.txt";
	}
	private void displayBean(){
		if (currentFile == null){
			displayAlert("Please set a file path.");
		}
		else {
			components.readFile(currentFile);
			Stage stage = new Stage();
			stage.setTitle("Bean Statistics");
			stage.setWidth(400);
			stage.setHeight(400);
			VBox pane = createBeanBox();
			Scene scene = new Scene(pane);
			stage.setScene(scene);
			stage.show();
		}
	}
	private VBox createBeanBox() {
		// TODO Auto-generated method stub
		VBox box = new VBox();
		
		Label beanCharacters = new Label(
				"This Beans total characters is: "+components.getEntityBean().getNumOfCharacters());
		Label beanWords = new Label(
				"This Beans total words is: "+components.getEntityBean().getNumOfWords());
		Label beanTotal = new Label(
				"This Beans number sum is: "+components.getEntityBean().getSumOfNumbers());
		
		box.getChildren().addAll(beanCharacters, beanWords, beanTotal);
		
		return box;
	}
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public Node createFileSelectButton() {
		Button displayButton = new Button("Set Bean File");
		displayButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                displayAlert("Functionality Comming Soon !");
            }
        });
		return displayButton;
	}
	private void displayAlert(String message){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Message Box");
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
	}
}
