
package widok;

import javax.swing.JTextField;

public class MyJTextField extends JTextField{
    public MyJTextField () {
        setText("0");
        setHorizontalAlignment(JTextField.RIGHT);
        setEditable(false);
    }
}
