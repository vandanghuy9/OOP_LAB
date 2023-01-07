package hust.soict.globalict.aims.screen;
import javax.swing.*;

import hust.soict.dsai.aims.store.Store;

import java.awt.*;
public class AddItemToStoreScreen extends ScreenControl {

	protected static Store store;

    protected JTextField titleField;
    protected JTextField categoryField;
    protected JTextField costField;

    JPanel createCenter(JPanel childPanel) {
        JPanel center = new JPanel();
        center.setLayout(new GridBagLayout());
        JPanel boxY = new JPanel();
        boxY.setLayout(new BoxLayout(boxY, BoxLayout.Y_AXIS));

        boxY.add(childPanel);

        center.add(boxY);

        return center;
    }

    public AddItemToStoreScreen(Store store) {
        super();
        this.store = store;
    }

}
