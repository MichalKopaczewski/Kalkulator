package widok;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;

public class MyJButton extends JButton {
    public MyJButton(String nazwa, Color kolorTekstu) {
        super(nazwa);
        setForeground(kolorTekstu);
        zmianaCzcionkiPrzyciskowPaneluUsuniecieMarginow(new Font(Font.DIALOG, Font.PLAIN, 10));
    }
    private void zmianaCzcionkiPrzyciskowPaneluUsuniecieMarginow(Font font) {
        setFont(font);
        setMargin(new Insets(0, 0, 0, 0));
    }
}
