public class Player extends User {
    public String guess;
    public String guessResults;
    public boolean knowsHowToPlay;
    public boolean userWon;
    public int guessNumber;
    public int currentLetter;
    public String results;
    public boolean gameOver;
    public boolean answered;

    public Player(String theName, boolean knowsHowToPlay, String theAnswer) {
        super(theName, theAnswer);
        guess = "Not Set";
        this.knowsHowToPlay = knowsHowToPlay;
        guessResults = "Not Set";
        userWon = false;
        guessNumber = 1;
    }

    public boolean userCanPlay() {
        return knowsHowToPlay;
    }

    // ------------ CODE THAT IS RUN FOR THE GAME -------------- //
    public void startGame() {
        guessNumber = 1;
        currentLetter = 0;
    }

    public int getCurrentLetter() {
        return currentLetter;
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    public void increaseCurrentLetter() {
        currentLetter += 1;
    }
    public void decreaseCurrentLetter() {
        currentLetter -= 1;
    }

    public void setCurrentLetter(int newLetterNum) {
        currentLetter = newLetterNum;
    }
    public void increaseGuessNumber() {
        guessNumber += 1;
    }
    public String enteredGuess (String guess) {
        Guesses playerGuess = new Guesses(answer);
        guessResults = playerGuess.getResults(guess);
        results = playerGuess.getResults(guess);
        return results;
    }

    public void setAnswer(String theAnswer) {
        answer = theAnswer;
    }
    public boolean hasWon () { return userWon; }

    public void setWin () {
        userWon = true;
    }

    public boolean getGameStatus() { return gameOver; }
    public void setGameOver() { gameOver = true; }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }

    public boolean getAnswered() {
        return answered;
    }
    public void canPlay() { knowsHowToPlay = true; }

    public void setCurrentGuess(int guessNum) { guessNumber = guessNum; }


}
