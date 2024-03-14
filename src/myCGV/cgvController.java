package myCGV;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import commonMainProject.MainClass2;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class cgvController implements Initializable{
	@FXML public ImageView purchaseImage;
	@FXML public Label movieName;
	@FXML public Label moviePlace;
	@FXML public Label movieDate;
	@FXML public Label movieTime;
	
	Parent root;
//	String path;
//	String moviename;
//	String movieplace;
//	String moviedate;
//	String movietime;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		path = Paths.get("").toAbsolutePath().toString();
//		// 경로 다시 지정
//		Image img = new Image(path); // 경로 다시 지정한거 선택
//		purchaseImage.setImage(img);
//		movieName.setText(moviename);
//		moviePlace.setText(movieplace);
//		movieDate.setText(moviedate);
//		movieTime.setText(movietime);
	}
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void backButton() {
		MainClass2 mc = new MainClass2();
		mc.viewFx(root);
	}
}
