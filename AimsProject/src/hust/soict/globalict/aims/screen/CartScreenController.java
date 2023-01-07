package hust.soict.globalict.aims.screen;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
public class CartScreenController {
	 @FXML
	    private MenuItem addBook;

	    @FXML
	    private MenuItem addCD;

	    @FXML
	    private MenuItem addDVD;
	    @FXML
	    private MenuItem viewCart;

	    @FXML
	    private MenuItem viewStore;
    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;
		private Cart cart;
		
		@FXML
	    private TableColumn<Media, String> colMediaCategory;

	    @FXML
	    private TableColumn<Media,String> colMediaCost;

	    @FXML
	    private TableColumn<Media, String> colMediaTitle;

	    @FXML
	    private ToggleGroup filterCategory;
	    
	    @FXML
	    private Button orderButton;

	    @FXML
	    private TableView<Media> tblMedia;
	    
	    @FXML
		private TextField textField;
	    @FXML
	    private Label totalLabel;
	   
	    @FXML
	    void addBookPressed(ActionEvent event) {
	    	
	    }

	    @FXML
	    void addCDPressed(ActionEvent event) {
	    	
	    }

	    @FXML
	    void addDVDPressed(ActionEvent event) {
	    	
	    }

	    @FXML
	    void btnRemovePressed(ActionEvent event) {
	    	Media media = tblMedia.getSelectionModel().getSelectedItem();
	    	cart.removeMedia(media);
	    }
	    
	    @FXML
	    void orderButtonPressed(ActionEvent event) {
	    	cart.emptyCart();
	    	totalLabel.setText(String.format("%.2f", cart.printTotalPrice() +"$"));
	    	
	    	Alert orderDialog = new Alert(AlertType.INFORMATION);
	    	orderDialog.setHeaderText("Order");
	    	orderDialog.setContentText("Order Successfully");
	    	orderDialog.showAndWait();
	    }
	    @FXML
	    void viewCartPressed(ActionEvent event) {

	    }

	    @FXML
	    void viewStorePressed(ActionEvent event) {

	    }

	public CartScreenController(Cart cart2) {
		super();
		this.cart=cart2;
	}
	@FXML 
	private void initialize() {
		colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
		colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
		colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, String>("cost"));
		tblMedia.setItems(this.cart.getItemsOrdered());
		
		btnPlay.setVisible(false);
		btnRemove.setVisible(false);
		tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {

			@Override
			public void changed(ObservableValue<? extends Media> arg0, Media oldValue, Media newValue) {
				if(newValue != null) {
					updateButtonBar(newValue);
				}
			}
		});
	}
	
	void updateButtonBar(Media media) {
		btnRemove.setVisible(true);
		if (media instanceof Playable) {
			btnPlay.setVisible(true);
		}
		else {
			btnPlay.setVisible(false);
		}
	}
}
