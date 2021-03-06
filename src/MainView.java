import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Manuel on 19.10.2016.
 */
public class MainView extends JFrame {

    private JButton play;
    private JButton answerA;
    private JButton answerB;
    private JButton answerC;
    private JButton answerD;
    private JTextArea questionArea;
    private JTextArea moderator;
    private JLabel playerName;
    private JLabel playerLevel;
    private JPanel quizPanel;
    private MainController controller;

    public MainView (MainController controller){
        super("Quiz-Game");
        this.setContentPane(quizPanel);
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,800,700);
        this.setVisible(true);
        this.controller= controller;
        createButtons();
    }

    /**
     * Diese Methode dient der Zuweisung von Aktionen dzu den einzelnen Knöpfen. Ich lagere das gerne in einer extra Methode aus, um die Übersicht zu warhen.
     */
    private void createButtons(){
        answerA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAnswer("A");
            }
        });
        answerB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAnswer("B");
            }
        });
        answerC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAnswer("C");
            }
        });
        answerD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAnswer("D");
            }
        });
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play();
            }
        });
    }

    public void updateQuestionsAndAnswers(){
        playerName.setText(controller.getPlayerName());
        //Vorher: playerLevel.setText(controller.getPlayerLevel()); -> Man muss die Zahl erstmal in einen String konvertieren.
        playerLevel.setText(String.valueOf(controller.getPlayerLevel()));
        String[] z = controller.getQuestionAndAnswers();
        questionArea.setText(z[0]);
        answerA.setText(z[1]);
        answerB.setText(z[2]);
        answerC.setText(z[3]);
        answerD.setText(z[4]);
        moderator.setText("Bitte eine Antwort auswählen!");
    }

    public void handleAnswer( String answer){
       if( answer.equals(controller.answer(answer))){
           updateQuestionsAndAnswers();
       }else {
           answerA.setEnabled(false);
           answerB.setEnabled(false);
           answerC.setEnabled(false);
           answerD.setEnabled(false);
           moderator.setText("Tut mir Leid, deine Antwort ist leider falsch.");
           /// TODO: 20.10.2016 fertig machen.
       }
    }

    public void play(){
        controller.createPlayer("Ulf");
    }
}
