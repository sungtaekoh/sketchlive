package common;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class Exit{
	Parent root;

	public void setRoot(Parent root) {
		this.root = root;
	}

	public void windowClose() {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}

}
