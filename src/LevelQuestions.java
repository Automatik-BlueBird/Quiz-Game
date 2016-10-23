
/**
 * Created by Manuel on 18.10.2016.
 */
public class LevelQuestions {

     private Question[] questions;

     public LevelQuestions(int level) {
        createQuestions(level);
    }

    public Question getRandomQuestion(){
        //Vorher: questions[ Math.random(questions.length)]; -> Fehler ist, dass Math.random() keine ganze Zahl liefert und keinen Parameter erwartet.
        return questions[ (int)(Math.random()*questions.length)];
    }

    private void createQuestions(int level){

        if(level == 1) {
            //Vorher: questions[] = new Question[1]; -> Fehler ist, dass das Array eine Referenz braucht!
            Question[] questions = new Question[1];
            String[] answers = new String[4];
            answers[0] = "Oben";
            answers[1] = "Unten";
            answers[2] = "Links";
            answers[3] = "Rechts";
            //Vorher: questions[0] = new Question("Wie geht der Spruch weiter? Alles gute kommt von...", "A"); -> Fehler ist, dass das Array nicht übergeben wird.
            questions[0] = new Question("Wie geht der Spruch weiter? Alles gute kommt von...", answers, "A");
        }
    }
}
