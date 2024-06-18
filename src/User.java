import java.util.Scanner;

public class User {
    public String userName;
    public String answer;
    public boolean player;
    Scanner input = new Scanner(System.in);

    public User(String theUserName, String theAnswer) {
        userName = theUserName;
        answer = theAnswer;
        player = true;
    }

    public void createAnswer() {
        answer = AnswerBank.findRandomAnswer((int)(Math.random() * 2309));
    }

    public String getAnswer() {
        return answer;
    }


}
