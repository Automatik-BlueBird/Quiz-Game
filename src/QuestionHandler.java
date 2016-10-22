/**
 * Created by dch on 18.10.2016.
 */
public class QuestionHandler {

    private LevelQuestions[] allLevelQuestions;

    public QuestionHandler(){
        allLevelQuestions = new LevelQuestions[15];
        createAllLevels();
    }

    public void createAllLevels(){
        for(int i = 0 ; i < 15 ; i++){
            allLevelQuestions[i] = new LevelQuestions(i+1);
        }
    }

    public String[] getRandomQuestion(int level){
        String[] asd = new String[6];
        Question xxx = allLevelQuestions[level-1].getRandomQuestion();
        asd[0] = xxx.getQuestion();
        System.arraycopy(xxx.getAnswers(),0,asd,1,4);
        asd[5] = xxx.getCorrectAnswer();
        return asd;
    }
}
