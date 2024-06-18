import javax.swing.*;
import java.awt.*;

public class EndScreen {
    public boolean userWon;
    public JPanel endScreen;
    public JLabel answerSquareL1;
    public JLabel answerSquareL2;
    public JLabel answerSquareL3;
    public JLabel answerSquareL4;
    public JLabel answerSquareL5;
    public JLabel lostText1;
    public JLabel lostText2;
    public JLabel lostText2BAD;
    public JLabel wonText1;
    public JLabel wonText2;
    public EndScreen(boolean won) {
        userWon = won;
        endScreen = new JPanel();
        endScreen.setLayout(new BorderLayout());
        endScreen.setPreferredSize(new Dimension(600, 600));

        wonText1 = FrameObjects.createLabel(100, 50, 400, 100, "You guessed the word in ", "Times New Romans", 30, false);
        wonText2 = FrameObjects.createLabel(100, 100, 400, 100, "attempts! The word was:", "Times New Romans", 30, false);
        lostText1 = FrameObjects.createLabel(100, 50, 400, 100, "Unfortunately, you weren't able to", "Times New Romans", 25, false);
        lostText2BAD = FrameObjects.createLabel(100, 100, 400, 100, "", "Times New Romans", 25, false);
        lostText2 = FrameObjects.createLabel(100, 100, 400, 100, "guess the word! The word was:", "Times New Romans", 25, false);
        answerSquareL1 = FrameObjects.createGameSquareLabel(102, 200, 75, 75,"", "Times New Romans", 34, false);
        answerSquareL2 = FrameObjects.createGameSquareLabel(182, 200, 75, 75,"", "Times New Romans", 34, false);
        answerSquareL3 = FrameObjects.createGameSquareLabel(262, 200, 75, 75,"", "Times New Romans", 34, false);
        answerSquareL4 = FrameObjects.createGameSquareLabel(342, 200, 75, 75,"", "Times New Romans", 34, false);
        answerSquareL5 = FrameObjects.createGameSquareLabel(422, 200, 75, 75,"", "Times New Romans", 34, false);
        endScreen.add(answerSquareL1);
        endScreen.add(answerSquareL2);
        endScreen.add(answerSquareL3);
        endScreen.add(answerSquareL4);
        endScreen.add(answerSquareL5);

        endScreen.add(wonText1);
        endScreen.add(wonText2);
        wonText1.setVerticalAlignment(JLabel.CENTER);
        wonText1.setHorizontalAlignment(JLabel.CENTER);
        wonText2.setVerticalAlignment(JLabel.CENTER);
        wonText2.setHorizontalAlignment(JLabel.CENTER);
        endScreen.add(lostText1);
        endScreen.add(lostText2);
        endScreen.add(lostText2BAD);
        lostText1.setVerticalAlignment(JLabel.CENTER);
        lostText1.setHorizontalAlignment(JLabel.CENTER);
        lostText2.setVerticalAlignment(JLabel.CENTER);
        lostText2.setHorizontalAlignment(JLabel.CENTER);
        lostText2BAD.setVerticalAlignment(JLabel.CENTER);
        lostText2BAD.setHorizontalAlignment(JLabel.CENTER);
        

    }
    public void setVisible(int guessNum, String answer) {
        if (userWon) {
            wonText1.setText("You guessed the word in " + (guessNum-1));
            if (guessNum-1 == 1) {
                wonText2.setText("attempt! The word was:");
            }
            wonText1.setVisible(true);
            wonText2.setVisible(true);
        }
        else {
            lostText1.setVisible(true);
            lostText2BAD.setVisible(true);
            lostText2.setVisible(true);
        }


        answerSquareL1.setText(answer.toUpperCase().substring(0,1));
        answerSquareL1.setBackground(new Color(106, 170, 100));
        answerSquareL1.setBorder(BorderFactory.createLineBorder(new Color(106, 170, 100), 7));
        answerSquareL1.setForeground(Color.WHITE);
        answerSquareL1.setVisible(true);

        answerSquareL2.setText(answer.toUpperCase().substring(1,2));
        answerSquareL2.setBackground(new Color(106, 170, 100));
        answerSquareL2.setBorder(BorderFactory.createLineBorder(new Color(106, 170, 100), 7));
        answerSquareL2.setForeground(Color.WHITE);
        answerSquareL2.setVisible(true);

        answerSquareL3.setText(answer.toUpperCase().substring(2,3));
        answerSquareL3.setBackground(new Color(106, 170, 100));
        answerSquareL3.setBorder(BorderFactory.createLineBorder(new Color(106, 170, 100), 7));
        answerSquareL3.setForeground(Color.WHITE);
        answerSquareL3.setVisible(true);

        answerSquareL4.setText(answer.toUpperCase().substring(3,4));
        answerSquareL4.setBackground(new Color(106, 170, 100));
        answerSquareL4.setBorder(BorderFactory.createLineBorder(new Color(106, 170, 100), 7));
        answerSquareL4.setForeground(Color.WHITE);
        answerSquareL4.setVisible(true);

        answerSquareL5.setText(answer.toUpperCase().substring(4,5));
        answerSquareL5.setBackground(new Color(106, 170, 100));
        answerSquareL5.setBorder(BorderFactory.createLineBorder(new Color(106, 170, 100), 7));
        answerSquareL5.setForeground(Color.WHITE);
        answerSquareL5.setVisible(true);
    }
    
    public JPanel getPanel() {
        return endScreen;
    }
    
}
