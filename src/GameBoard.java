import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

public class GameBoard {
    public JPanel gameBoard;
    public JLabel gameSquareG1L1;
    public JLabel gameSquareG1L2;
    public JLabel gameSquareG1L3;
    public JLabel gameSquareG1L4;
    public JLabel gameSquareG1L5;

    public JLabel gameSquareG2L1;
    public JLabel gameSquareG2L2;
    public JLabel gameSquareG2L3;
    public JLabel gameSquareG2L4;
    public JLabel gameSquareG2L5;

    public JLabel gameSquareG3L1;
    public JLabel gameSquareG3L2;
    public JLabel gameSquareG3L3;
    public JLabel gameSquareG3L4;
    public JLabel gameSquareG3L5;

    public JLabel gameSquareG4L1;
    public JLabel gameSquareG4L2;
    public JLabel gameSquareG4L3;
    public JLabel gameSquareG4L4;
    public JLabel gameSquareG4L5;

    public JLabel gameSquareG5L1;
    public JLabel gameSquareG5L2;
    public JLabel gameSquareG5L3;
    public JLabel gameSquareG5L4;
    public JLabel gameSquareG5L5;

    public JLabel gameSquareG6L1;
    public JLabel gameSquareG6L2;
    public JLabel gameSquareG6L3;
    public JLabel gameSquareG6L4;
    public JLabel gameSquareG6L5;


    public GameBoard() {


        gameBoard = new JPanel();
        gameBoard.setLayout(null);
        gameBoard.setPreferredSize(new Dimension(600, 600));

        gameSquareG1L1 = FrameObjects.createGameSquareLabel(102, 30, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG1L2 = FrameObjects.createGameSquareLabel(182, 30, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG1L3 = FrameObjects.createGameSquareLabel(262, 30, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG1L4 = FrameObjects.createGameSquareLabel(342, 30, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG1L5 = FrameObjects.createGameSquareLabel(422, 30, 75, 75,"", "Times New Romans", 34, true);

        gameSquareG2L1 = FrameObjects.createGameSquareLabel(102, 115, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG2L2 = FrameObjects.createGameSquareLabel(182, 115, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG2L3 = FrameObjects.createGameSquareLabel(262, 115, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG2L4 = FrameObjects.createGameSquareLabel(342, 115, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG2L5 = FrameObjects.createGameSquareLabel(422, 115, 75, 75,"", "Times New Romans", 34, true);

        gameSquareG3L1 = FrameObjects.createGameSquareLabel(102, 200, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG3L2 = FrameObjects.createGameSquareLabel(182, 200, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG3L3 = FrameObjects.createGameSquareLabel(262, 200, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG3L4 = FrameObjects.createGameSquareLabel(342, 200, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG3L5 = FrameObjects.createGameSquareLabel(422, 200, 75, 75,"", "Times New Romans", 34, true);

        gameSquareG4L1 = FrameObjects.createGameSquareLabel(102, 285, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG4L2 = FrameObjects.createGameSquareLabel(182, 285, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG4L3 = FrameObjects.createGameSquareLabel(262, 285, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG4L4 = FrameObjects.createGameSquareLabel(342, 285, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG4L5 = FrameObjects.createGameSquareLabel(422, 285, 75, 75,"", "Times New Romans", 34, true);

        gameSquareG5L1 = FrameObjects.createGameSquareLabel(102, 370, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG5L2 = FrameObjects.createGameSquareLabel(182, 370, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG5L3 = FrameObjects.createGameSquareLabel(262, 370, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG5L4 = FrameObjects.createGameSquareLabel(342, 370, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG5L5 = FrameObjects.createGameSquareLabel(422, 370, 75, 75,"", "Times New Romans", 34, true);

        gameSquareG6L1 = FrameObjects.createGameSquareLabel(102, 455, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG6L2 = FrameObjects.createGameSquareLabel(182, 455, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG6L3 = FrameObjects.createGameSquareLabel(262, 455, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG6L4 = FrameObjects.createGameSquareLabel(342, 455, 75, 75,"", "Times New Romans", 34, true);
        gameSquareG6L5 = FrameObjects.createGameSquareLabel(422, 455, 75, 75,"", "Times New Romans", 34, true);


        // Creates a 2D 6 by 5 JLabel Array containing the JLabels
        // JLabel[][] gameBoard = new JLabel[6][5];  Creates 6 Arrays of 5
        gameBoard.add(gameSquareG1L1);
        gameBoard.add(gameSquareG1L2);
        gameBoard.add(gameSquareG1L3);
        gameBoard.add(gameSquareG1L4);
        gameBoard.add(gameSquareG1L5);

        gameBoard.add(gameSquareG2L1);
        gameBoard.add(gameSquareG2L2);
        gameBoard.add(gameSquareG2L3);
        gameBoard.add(gameSquareG2L4);
        gameBoard.add(gameSquareG2L5);

        gameBoard.add(gameSquareG3L1);
        gameBoard.add(gameSquareG3L2);
        gameBoard.add(gameSquareG3L3);
        gameBoard.add(gameSquareG3L4);
        gameBoard.add(gameSquareG3L5);

        gameBoard.add(gameSquareG4L1);
        gameBoard.add(gameSquareG4L2);
        gameBoard.add(gameSquareG4L3);
        gameBoard.add(gameSquareG4L4);
        gameBoard.add(gameSquareG4L5);

        gameBoard.add(gameSquareG5L1);
        gameBoard.add(gameSquareG5L2);
        gameBoard.add(gameSquareG5L3);
        gameBoard.add(gameSquareG5L4);
        gameBoard.add(gameSquareG5L5);

        gameBoard.add(gameSquareG6L1);
        gameBoard.add(gameSquareG6L2);
        gameBoard.add(gameSquareG6L3);
        gameBoard.add(gameSquareG6L4);
        gameBoard.add(gameSquareG6L5);
    }

    public JPanel getGameBoard () {
        return gameBoard;
    }


    public void addLetter (int currentGuess, int currentLetter, String letterToAdd) {
        JLabel[][] guesses = getGuesses();
        guesses[currentGuess - 1][currentLetter - 1].setText(letterToAdd);
    }

    public String traverseCurrentGuess(int guessNum) {
        StringBuilder guess = new StringBuilder();
        JLabel[][] guesses = getGuesses();
        for (int i = 0; i < 5; i++) {
            guess.append(guesses[guessNum - 1][i].getText().charAt(0));
        }
        return guess.toString();
    }

    public void sendGuessResults (String results, int guessNum) {
        JLabel[][] guesses = getGuesses();
        int i = 0;
        while(i < 5) {
            if (results.charAt(i) == 'G') {
                guesses[guessNum - 1][i].setBackground(new Color(106, 170, 100));
                guesses[guessNum - 1][i].setVisible(false);
                guesses[guessNum - 1][i].setBackground(new Color(106, 170, 100));
                guesses[guessNum - 1][i].setForeground(Color.WHITE);
                guesses[guessNum - 1][i].setBorder(BorderFactory.createLineBorder(new Color(106, 170, 100), 7));
                guesses[guessNum - 1][i].setVisible(true);
                i++;
            }
            else if (results.charAt(i) == 'Y') {
                guesses[guessNum - 1][i].setBackground(new Color(201, 180, 88));
                guesses[guessNum - 1][i].setVisible(false);
                guesses[guessNum - 1][i].setBackground(new Color(201, 180, 88));
                guesses[guessNum - 1][i].setForeground(Color.WHITE);
                guesses[guessNum - 1][i].setBorder(BorderFactory.createLineBorder(new Color(201, 180, 88), 7));
                guesses[guessNum - 1][i].setVisible(true);
                i++;
            }
            else {
                guesses[guessNum - 1][i].setVisible(false);
                guesses[guessNum - 1][i].setBackground(new Color(120, 124, 126));
                guesses[guessNum - 1][i].setForeground(Color.WHITE);
                guesses[guessNum - 1][i].setBorder(BorderFactory.createLineBorder(new Color(120, 124, 126), 7));
                guesses[guessNum - 1][i].setVisible(true);
                i++;
            }
        }
    }

    private JLabel[][] getGuesses() {
        JLabel[] guess1 = {gameSquareG1L1, gameSquareG1L2, gameSquareG1L3, gameSquareG1L4, gameSquareG1L5};
        JLabel[] guess2 = {gameSquareG2L1, gameSquareG2L2, gameSquareG2L3, gameSquareG2L4, gameSquareG2L5};
        JLabel[] guess3 = {gameSquareG3L1, gameSquareG3L2, gameSquareG3L3, gameSquareG3L4, gameSquareG3L5};
        JLabel[] guess4 = {gameSquareG4L1, gameSquareG4L2, gameSquareG4L3, gameSquareG4L4, gameSquareG4L5};
        JLabel[] guess5 = {gameSquareG5L1, gameSquareG5L2, gameSquareG5L3, gameSquareG5L4, gameSquareG5L5};
        JLabel[] guess6 = {gameSquareG6L1, gameSquareG6L2, gameSquareG6L3, gameSquareG6L4, gameSquareG6L5};
        return new JLabel[][]{guess1, guess2, guess3, guess4, guess5, guess6};
    }
}
