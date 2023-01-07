package hust.soict.dsai.javafx;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

	 @FXML
	    private BorderPane drawingPaneArea;

	    @FXML
	    private RadioButton eraserButton;

	    @FXML
	    private ToggleGroup identical;

	    @FXML
	    private Pane paneArea;

	    @FXML
	    private RadioButton penButton;

	@FXML
	void clearButtonPressed(ActionEvent event) {
		paneArea.getChildren().clear();
	}

	@FXML
	void drawingAreaMouseDragged(MouseEvent event) {
		Circle newCircle = new Circle(event.getSceneX(),event.getSceneY(),4);
		paneArea.getChildren().add(newCircle);
	}
	

    @FXML
    void eraserButtonClicked(ActionEvent event) {
    	paneArea.setOnMouseDragged(e -> {
    		Circle deleteCircle = new Circle(e.getSceneX(),e.getSceneY(),10);
    		deleteCircle.setFill(Color.WHITE);
    		paneArea.getChildren().add(deleteCircle);
    	});
    	
    }

    @FXML
    void penButtonClicked(ActionEvent event) {
    	paneArea.setOnMouseDragged(e -> {
    		Circle deleteCircle = new Circle(e.getSceneX(),e.getSceneY(),4);
    		deleteCircle.setFill(Color.BLACK);
    		paneArea.getChildren().add(deleteCircle);
    	});
    }
}
