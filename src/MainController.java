/**
 * Created by Manuel on 18.10.2016.
 */
public class MainController {


    private String rightAnswer;
    QuestionHandler handler;

    public MainController(){
        this.handler = new QuestionHandler();
    }

    public void createPlayer(String name){
        Player player = new Player(String name);
    }

    public String getPlayerName(){
        return Player.name;
    }

    public int getPlayerLevel(){
        return Player.level;
    }

    public String[] getQuestionAndAnswers(){
        String[] x = QuestionHandler.getRandomQuestion(getPlayerLevel());
        String[] y = new String[5];
        rightAnswer = x[5];
        System.arraycopy(x,0,y,0,5);
        return y;

    }

    public boolean answer(String chosenAnswer){
        if(chosenAnswer == rightAnswer){
            Player.setLevel(Player.level + 1);
            return true;
        }else{
            return false;
        }
    }
}
