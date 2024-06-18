import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
public class MyFrame extends JFrame implements ActionListener, KeyListener {
    public boolean answered;
    public String userName;
    public boolean userKnowsHowToPlay;
    public String answer;
    public Player player1;
    JPanel panelTop = new JPanel();
    GameBoard wordleGameBoard = new GameBoard();
    Keyboard wordleKeyboard;
    JPanel panelKeyboard;
    JPanel panelGame = wordleGameBoard.getGameBoard();
    EndScreen endScreenWin = new EndScreen(true);
    EndScreen endScreenLost = new EndScreen(false);
    JPanel panelWin = endScreenWin.getPanel();
    JPanel panelLost = endScreenLost.getPanel();
    Answer gameAnswer = new Answer();
    JPanel panelCreate = gameAnswer.getGameAnswer();
    JPanel panelInstructions = new JPanel();
    public boolean isAPlayer;
    public boolean gameStarted;
    public String theGuess;
    public JLabel titleLabel;
    public JLabel imageLabel;
    JLabel notFiveLetters = FrameObjects.createLabel(0, 20, 600, 100, "Not a five letter word, please enter again", "Times New Romans", 20, false);
    JButton buttonPlay = FrameObjects.createButton(200, 400, 200, 75, "Play", "Franklin Gotchi", 25, Color.GRAY);
    JButton buttonCreate = FrameObjects.createButton(200, 500, 200, 75, "Create", "Franklin Gotchi", 25, Color.GRAY);
    JLabel instructions1 = FrameObjects.createLabel("This is WORDLE. In this game, you will have to", "Times New Romans", 15, false);
    JLabel instructions2 = FrameObjects.createLabel("guess a 5 letter word within 6 guesses! With each", "Times New Romans", 15, false);
    JLabel instructions3 = FrameObjects.createLabel("guess, you will be told which letters are in the", "Times New Romans", 15, false);
    JLabel instructions4 = FrameObjects.createLabel("correct spot (green square), which letters are in the", "Times New Romans", 15, false);
    JLabel instructions5 = FrameObjects.createLabel("word but not the correct spot (yellow square), and", "Times New Romans", 15, false);
    JLabel instructions6 = FrameObjects.createLabel("which letters are not in the word at all (gray square).", "Times New Romans", 15, false);
    JButton understandInstructions = FrameObjects.createButton(200, 500, 200, 100, "PLAY", "Times New Romans", 20, Color.GRAY);
    public MyFrame() {
        super("WORDLE");
        // -------------------Beginning Screen---------------------- //
        answered = false;
        this.setTitle("Wordle by Gabriel Hoh");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(600, 900);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(null);

        this.addKeyListener(this);

        // ----------------TO SET AN IMAGE ICON---------------------- //
        ImageIcon image = new ImageIcon("WordleIcon.png");
        this.setIconImage(image.getImage());
        this.setBackground(new Color(227, 227, 225));

        // ----------------- ADD STUFF TO START SCREEN ---------------//
        this.add(buttonPlay);
        this.add(buttonCreate);

        // ---------Adding Buttons/Labels, Setting up ActionListener----------//
        buttonPlay.addActionListener(this);
        buttonCreate.addActionListener(this);


        // ICON
        imageLabel = new JLabel();
        imageLabel.setBounds(100, 0, 400, 400);
        imageLabel.setVisible(false);
        imageLabel.setIcon(image);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(imageLabel);
        imageLabel.setVisible(true);


        // WORDLE
        titleLabel = new JLabel();
        titleLabel.setBounds(100, 320, 400, 55);
        ImageIcon title = new ImageIcon("WordleTitle.png");
        titleLabel.setVisible(false);
        titleLabel.setIcon(title);
        titleLabel.setVerticalAlignment(JLabel.CENTER);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(titleLabel);
        titleLabel.setVisible(true);

        // BUTTONS
        buttonPlay.setBackground(Color.BLACK);
        buttonCreate.setBackground(Color.BLACK);
        buttonPlay.setForeground(Color.WHITE);
        buttonCreate.setForeground(Color.WHITE);



        // TO SHOW IN PRESENTATION

        buttonPlay.setVisible(true);
        buttonCreate.setVisible(true);

        // TO SHOW IN PRESENTATION


        // ------------------Waits for user to click a button------------------
        while (!answered) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // -----------------------Setting Up Panels---------------------- //

        this.setLayout(new BorderLayout(0, 5)); // Buttons + Labels won't take up the whole screen (limited to their bounds
        imageLabel.setVisible(false);
        panelTop.setPreferredSize(new Dimension(600, 75));
        panelTop.setBackground(Color.WHITE);
        panelTop.setLayout(null);
        this.add(panelTop, BorderLayout.NORTH);

        gameStarted = false;

        panelGame.setVisible(false);
        panelGame.setBackground(Color.WHITE);

        panelTop.add(titleLabel);
        titleLabel.setBounds(100, 10, 400, 55);
        titleLabel.setVisible(true);

        notFiveLetters.setForeground(Color.WHITE); //NOT WORKING*/

        // -------- STARTS GAME --------- //
        answer = "NOT SET";
        player1 = new Player(userName, userKnowsHowToPlay, answer);
        beginGame(isAPlayer);
    }

    public void changeScreen (String screen) {
        if (screen.equals("createScreen")) {
            player1.setAnswer("NOT SET");
            gameStarted = true;
            answered = false;
            player1.setCurrentLetter(-1);

            this.add(panelCreate, BorderLayout.CENTER);
            panelCreate.setVisible(true);
            gameAnswer.setVisible();

            while (!answered) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            player1.setAnswer(gameAnswer.answerToString());
            this.remove(panelCreate);
            changeScreen("playScreen");

        }
        if (screen.equals("playScreen")) {
            // --------- CREATES A PLAYER ------------- //
            this.remove(panelCreate);
            if (!player1.userCanPlay()) {
                changeScreen("instructions");
            }
            if (player1.getAnswer().equals("NOT SET")) { // If game wasn't created
                player1.createAnswer();
            }
            // ----------- STARTS GAME ----------------- //
            wordleKeyboard = new Keyboard();
            wordleKeyboard.resetKeyboard(player1, wordleGameBoard);
            panelKeyboard = wordleKeyboard.getKeyboard();
            this.add(panelKeyboard, BorderLayout.SOUTH);
            answered = false;
            this.add(panelGame, BorderLayout.CENTER);
            panelGame.setVisible(true);
            panelKeyboard.setVisible(true);
            panelKeyboard.setBackground(Color.WHITE);

            player1.setCurrentLetter(0);
            player1.setCurrentGuess(1);
            gameStarted = true;

            player1.startGame(); // CODE HERE
            while(!player1.hasWon() && !player1.getGameStatus()) { // CODE THAT IS RUN WHILE THE GAME STARTS
                while(!player1.getAnswered()) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                theGuess = wordleGameBoard.traverseCurrentGuess(player1.getGuessNumber());
                String guessResults = player1.enteredGuess(theGuess);
                wordleGameBoard.sendGuessResults(guessResults, player1.getGuessNumber());
                wordleKeyboard.sendGuessResults(guessResults, theGuess);
                if (guessResults.equals("GGGGG")) {
                    try {
                        Thread.sleep(1250);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    player1.setWin();
                }
                else if (player1.getGuessNumber() == 6) {
                    try {
                        Thread.sleep(1250);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    player1.setGameOver();
                }
                player1.increaseGuessNumber();
                player1.setCurrentLetter(0);
                player1.setAnswered(false);
            }
            // TO CODE SWITCH TO WIN OR LOSS SCREEN HERE
            if (player1.hasWon()) {
                gameStarted = false;
                changeScreen("winScreen");
            }
            else {
                gameStarted = false;
                changeScreen("lostScreen");
            }
        }
        if (screen.equals("winScreen")) {

            answered = false;
            player1.canPlay();
            this.remove(panelKeyboard);
            this.remove(panelGame);
            this.add(panelWin);
            panelWin.setVisible(true);

            endScreenWin.setVisible(player1.getGuessNumber(), player1.getAnswer());
            while (!player1.getAnswered()) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (screen.equals("lostScreen")) {
            answered = false;
            player1.canPlay();
            this.remove(panelKeyboard);
            this.remove(panelGame);
            this.add(panelLost);

            panelLost.setVisible(true);

            endScreenLost.setVisible(player1.getGuessNumber(), player1.getAnswer());
            while (!player1.getAnswered()) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        }
        if (screen.equals("instructions")) { // FIX THIS LAYOUT! CODE WORKS AT THE MOMENT THOUGH //
            answered = false;
            this.add(panelInstructions, BorderLayout.CENTER);
            panelInstructions.add(instructions1);
            panelInstructions.add(instructions2);
            panelInstructions.add(instructions3);
            panelInstructions.add(instructions4);
            panelInstructions.add(instructions5);
            panelInstructions.add(instructions6);
            panelInstructions.add(understandInstructions);
            instructions1.setVisible(true);
            instructions2.setVisible(true);
            instructions3.setVisible(true);
            instructions4.setVisible(true);
            instructions5.setVisible(true);
            instructions6.setVisible(true);
            understandInstructions.setVisible(true);
            understandInstructions.addActionListener(this);
            // Waits for user to click continue
            while (!answered) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            this.remove(panelInstructions);
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==buttonPlay) {
            buttonPlay.setVisible(false);
            buttonCreate.setVisible(false);
            isAPlayer = true;
            answered = true;
        }
        if (e.getSource()==buttonCreate) {
            buttonPlay.setVisible(false);
            buttonCreate.setVisible(false);
            isAPlayer = false;
            answered = true;
        }
        if (e.getSource()==understandInstructions) {
            answered = true;
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {
        if (gameStarted) {
            switch(e.getKeyChar()) {
                case KeyEvent.VK_ENTER: {
                    if (player1.getCurrentLetter() == 5){
                        player1.setAnswered(true);
                    }
                    else if (gameAnswer.getCurrentLetter() == 5) {
                        answered = true;
                    }
                    break;
                }
                case KeyEvent.VK_BACK_SPACE: {
                    if (player1.getCurrentLetter() > 0) {
                        wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "");
                        player1.decreaseCurrentLetter();
                        break;
                    }
                    else if (gameAnswer.getCurrentLetter() > 0) {
                        gameAnswer.addLetter("");
                        gameAnswer.decreaseCurrentLetter();
                        break;
                    }
                    break;
                }
                case 'q':
                    if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                        player1.increaseCurrentLetter();
                        wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "Q");
                        break;
                    }
                    else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                        gameAnswer.increaseCurrentLetter();
                        gameAnswer.addLetter("Q");
                        break;
                    }
                case 'w': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "W");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("W");
                    break;
                }
                case 'e': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "E");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("E");
                    break;
                }
                case 'r': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "R");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("R");
                    break;
                }
                case 't': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "T");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("T");
                    break;
                }
                case 'y': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "Y");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("Y");
                    break;
                }
                case 'u': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "U");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("U");
                    break;
                }
                case 'i': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "I");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("I");
                    break;
                }
                case 'o': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "O");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("O");
                    break;
                }
                case 'p': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "P");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("P");
                    break;
                }
                case 'a': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "A");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("A");
                    break;
                }
                case 's': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "S");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("S");
                    break;
                }
                case 'd': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "D");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("D");
                    break;
                }
                case 'f': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "F");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("F");
                    break;
                }
                case 'g': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "G");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("G");
                    break;
                }
                case 'h': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "H");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("H");
                    break;
                }
                case 'j': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "J");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("J");
                    break;
                }
                case 'k': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "K");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("K");
                    break;
                }
                case 'l': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "L");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("L");
                    break;
                }
                case 'z': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "Z");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("Z");
                    break;
                }
                case 'x': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "X");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("X");
                    break;
                }
                case 'c': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "C");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("C");
                    break;
                }
                case 'v': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "V");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("V");
                    break;
                }
                case 'b': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "B");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("B");
                    break;
                }
                case 'n': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "N");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("N");
                    break;
                }
                case 'm': if (player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
                    player1.increaseCurrentLetter();
                    wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "M");
                    break;
                }
                else if (gameAnswer.getCurrentLetter() >= 0 && gameAnswer.getCurrentLetter() < 5) {
                    gameAnswer.increaseCurrentLetter();
                    gameAnswer.addLetter("M");
                    break;
                }

            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void beginGame(boolean isPlayer) {
        if (isPlayer) {
            changeScreen("playScreen");
        }
        else {
            changeScreen("createScreen");
        }
    }


}
