import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
public class FrameObjects {
    public static JLabel createLabel(String text, String font, int fontSize, boolean visibility) {
        JLabel toReturn = new JLabel();
        toReturn.setText(text);
        toReturn.setFont(new Font(font, Font.BOLD,fontSize));
        toReturn.setVerticalTextPosition(JLabel.CENTER);
        toReturn.setHorizontalTextPosition(JLabel.CENTER);
        toReturn.setVerticalAlignment(JLabel.CENTER);
        toReturn.setHorizontalAlignment(JLabel.CENTER);
        toReturn.setVisible(visibility);
        return toReturn;
    }
    public static JLabel createGameSquareLabel(int x, int y, int width, int height, String text, String font, int fontSize, boolean visibility) {
        JLabel toReturn = new JLabel();
        toReturn.setBounds(x, y, width, height);
        toReturn.setText(text);
        toReturn.setFont(new Font(font, Font.BOLD,fontSize));
        toReturn.setVisible(visibility);
        toReturn.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5));
        toReturn.setOpaque(true);
        toReturn.setBackground(Color.WHITE);
        toReturn.setHorizontalAlignment(SwingConstants.CENTER);
        toReturn.setVerticalAlignment(SwingConstants.CENTER);
        return toReturn;
    }

    public static JLabel createLabel(int x, int y, int width, int height, String text, String font, int fontSize, boolean visibility) {
        JLabel toReturn = new JLabel();
        toReturn.setBounds(x, y, width, height);
        toReturn.setText(text);
        toReturn.setFont(new Font(font, Font.BOLD,fontSize));
        toReturn.setVisible(visibility);
        return toReturn;
    }

    public static JButton createButton(int x, int y, int width, int height, String text, String font, int fontSize, Color backgroundColor) {
        JButton toReturn = new JButton();
        toReturn.setBounds(x, y, width, height);
        toReturn.setText(text);
        toReturn.setFocusable(false);
        toReturn.setFont(new Font(font, Font.BOLD, fontSize));
        toReturn.setBackground(backgroundColor);
        toReturn.setVisible(false);
        return toReturn;
    }

}
