package hust.soict.globalict.aims.screen;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import hust.soict.dsai.aims.cart.Cart;
public class CartMain extends Application{
	@Override
	public void init() throws Exception {
		super.init();
		Cart cart = new Cart();
		CartScreenController controller = new CartScreenController(cart);
	}
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));
		Scene scene = new Scene(root);
		scene.setRoot(root);
		stage.setTitle("Cart");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
