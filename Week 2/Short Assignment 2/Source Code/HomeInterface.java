import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HomeInterface extends Application{

	ComponentInterface components = new ComponentInterface();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Stage stage = createMainStage();
		Scene scene = new Scene(createMainScene());
		stage.setScene(scene);
		stage.show();
	}
	private Stage createMainStage(){
		Stage stage = new Stage();
		stage.setTitle("Bean Counter");
		stage.setWidth(400);
		stage.setHeight(400);
		return stage;
	}
	private GridPane createMainScene(){
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(15, 15, 15, 15));
		pane.setVgap(15);
		pane.setHgap(15);
		pane.add(components.createDefaultFileButton(), 0, 0);
		pane.add(components.createDisplayButton(), 1, 0);
		pane.add(components.createFileSelectButton(), 0, 1);
		return pane;
	}
	
}
