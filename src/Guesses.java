import java.util.ArrayList;

public class Guesses {
    public String answer;

    public Guesses(String theAnswer) {
        answer = theAnswer.toLowerCase();
    }

    public String getResults(String guess) {
        String toReturn = "";
        // Create an Array of size guess.length() and fill it all with White tiles
        String[] returnValues = new String[5];
        for (int i = 0; i < 5; i++) {
            returnValues[i] = "W";
        }

        if (guess.toLowerCase().equals(answer)) { // If the guess is correct, return array filled with Green tiles
            for (int i = 0; i < 5; i++) {
                returnValues[i] = "G";
            }
            return "GGGGG";
        }
        else { // If the guess is incorrect:
            // This ArrayList is used later on (initialized outside the for loop for scope purposes)
            ArrayList<Integer> accountedForIndices = new ArrayList<>();
            ArrayList<Integer> filledInLetters = new ArrayList<>();
            for (int i = 0; i < 5; i++) { // Here, a for loop is used to check each letter of the guess
                // If statement to check whether the letter of guess matches same letter as answer
                // If they do, fill in the letter with Green tile
                // Flag the index as accounted for by adding it to the ArrayList
                // Flag the letter as filled in by adding it to the ArrayList
                if (guess.substring(i, i + 1).toLowerCase().equals(answer.substring(i, i + 1))) {
                    returnValues[i] = "G";
                    accountedForIndices.add(i);
                    filledInLetters.add(i);
                }
            }
            // If the letters do not match, check if that letter is present in the rest of the word
            // First check if the letter is filled in already with green
            // If not, leave it as White tile (make no changes as it is already white)
            // If so, fill the letter with Yellow tile, flag that index as "accounted for",
            // the program will skip over that letter position when checking for future letters (use an ArrayList)
            // This is done by creating a search function for the ArrayList and traversing the ArrayList
            // for the said letter position when searching for future yellow tiles (ArrayList starts empty)
            // A while loop is used here, so we can break out of the loop immediately when the value is found
            //If there are duplicates, a for loop will add "Y" multiple times to the returnValues String
            for (int i = 0; i < 5; i++) {

                int j = 0;
                while (j < 5) {
                    if (!checkIfInArray(filledInLetters, i) && guess.substring(i, i+1).toLowerCase().equals(answer.substring(j, j+1))) {
                        if (!checkIfInArray(accountedForIndices, j)) {
                            returnValues[i] = "Y";
                            accountedForIndices.add(j);
                            break;
                        }
                    }
                    j++;
                }
            }
        }
        for (String returnValue : returnValues) {
            toReturn += returnValue;
        }
        return toReturn;
    }

    private boolean checkIfInArray(ArrayList<Integer> array, int index) {
        for (Integer integer : array) {
            if (integer == index) {
                return true;
            }
        }
        return false;
    }
}
