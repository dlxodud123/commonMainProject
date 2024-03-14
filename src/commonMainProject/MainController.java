package commonMainProject;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import myCGV.cgvMain;
import noticeBoard.noticeBoardMain;

public class MainController implements Initializable{
	Parent root;
	@FXML public Button loginText;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void reserveFunc() {
		
	}
	public void boardFunc() {
		noticeBoardMain nbm = new noticeBoardMain();
		nbm.viewFx(root);
	}
	public void loginFunc() {
		loginText.setText("로그아웃");
	}
	public void cgvFunc() {
		cgvMain cm = new cgvMain();
		cm.viewFx(root); 
	}
}
