/**
 * Created by Manuel on 18.10.2016.
 */
public class MainController {

    private String rightAnswer;
    QuestionHandler handler;
    //Vorher: Keine globale Referenz auf ein Objekt der Klasse Player
    private Player player; //<- Hinzugefügt

    public MainController(){
        this.handler = new QuestionHandler();
    }

    public void createPlayer(String name){
        //Vorher: Player player = new Player(String name); -> Fehler: Durch die Deklaration wird die Referenz nur lokal in der Methode verwendet, aber nicht global. Außerdem muss der Parameter einfach weitergereicht werden.
        player = new Player(name);
    }

    public String getPlayerName(){
        //Vorher: return Player.name; -> Fehler: Der Zugriff muss auf das Objekt stattfinden und davon die passende Methode aufrufen.
        return player.getName();
    }

    public int getPlayerLevel(){
        //Vorher: return Player.level; -> Siehe oben.
        return player.getLevel();
    }

    public String[] getQuestionAndAnswers(){
        //Vorher: String[] x = QuestionHandler.getRandomQuestion(getPlayerLevel()); -> Fehler: Du musst hier auf die handler Referenz zugrifen!
        String[] x = handler.getRandomQuestion(getPlayerLevel());
        String[] y = new String[5];
        rightAnswer = x[5];
        System.arraycopy(x,0,y,0,5);
        return y;

    }

    public boolean answer(String chosenAnswer){
        if(chosenAnswer == rightAnswer){
            player.setLevel(player.getLevel() + 1);
            return true;
        }else{
            return false;
        }
    }
}
