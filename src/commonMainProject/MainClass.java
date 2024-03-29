package commonMainProject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainClass extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("mainFX.fxml"));
		
		Parent root = loader.load();
		
		MainController ctrl = loader.getController();
		ctrl.setRoot(root);
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("메인");
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
