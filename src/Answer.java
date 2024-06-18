import javax.swing.*;
import java.awt.*;

public class Answer {
    public JButton createGameButton;
    public JLabel enterFiveLetterWord;
    public JPanel gameAnswer;
    public JLabel answerSquareL1;
    public JLabel answerSquareL2;
    public JLabel answerSquareL3;
    public JLabel answerSquareL4;
    public JLabel answerSquareL5;
    public int currentLetter;
    public Answer() {
        currentLetter = 0;
        gameAnswer = new JPanel();
        gameAnswer.setLayout(null);
        gameAnswer.setPreferredSize(new Dimension(600, 600));

        enterFiveLetterWord = FrameObjects.createLabel(100, 100, 400, 150, "Enter a 5 letter word", "Times new Romans", 30, false);
        createGameButton = FrameObjects.createButton(100, 350, 400, 50, "Create Game", "Times New Romans", 40, Color.GRAY);
        answerSquareL1 = FrameObjects.createGameSquareLabel(102, 250, 75, 75,"", "Times New Romans", 34, false);
        answerSquareL2 = FrameObjects.createGameSquareLabel(182, 250, 75, 75,"", "Times New Romans", 34, false);
        answerSquareL3 = FrameObjects.createGameSquareLabel(262, 250, 75, 75,"", "Times New Romans", 34, false);
        answerSquareL4 = FrameObjects.createGameSquareLabel(342, 250, 75, 75,"", "Times New Romans", 34, false);
        answerSquareL5 = FrameObjects.createGameSquareLabel(422, 250, 75, 75,"", "Times New Romans", 34, false);

        gameAnswer.add(enterFiveLetterWord);
        enterFiveLetterWord.setVerticalAlignment(JLabel.CENTER);
        enterFiveLetterWord.setHorizontalAlignment(JLabel.CENTER);
        gameAnswer.add(createGameButton);
        gameAnswer.add(answerSquareL1);
        gameAnswer.add(answerSquareL2);
        gameAnswer.add(answerSquareL3);
        gameAnswer.add(answerSquareL4);
        gameAnswer.add(answerSquareL5);
    }
    public void setVisible() {
        createGameButton.setVisible(true);
        enterFiveLetterWord.setVisible(true);
        answerSquareL1.setVisible(true);
        answerSquareL2.setVisible(true);
        answerSquareL3.setVisible(true);
        answerSquareL4.setVisible(true);
        answerSquareL5.setVisible(true);
    }
    public JPanel getGameAnswer() {
        return gameAnswer;
    }
    public void increaseCurrentLetter() { currentLetter += 1; }
    public int getCurrentLetter() { return currentLetter; }
    public void decreaseCurrentLetter() { currentLetter -= 1; }

    private JLabel[] getAnswer() {
        return new JLabel[]{answerSquareL1, answerSquareL2, answerSquareL3, answerSquareL4, answerSquareL5};
    }

    public void addLetter(String letterToAdd) {
        JLabel[] theAnswer = getAnswer();
        theAnswer[currentLetter - 1].setText(letterToAdd);
    }

    public String answerToString() {
        return answerSquareL1.getText() + answerSquareL2.getText() + answerSquareL3.getText() + answerSquareL4.getText() + answerSquareL5.getText();
    }


}
