/**
 * Created by Jean-Pierre on 23.10.2016.
 */
public class MainProgram {
    public static void main(String[] args) {
        MainController controller = new MainController();
        MainView view = new MainView(controller);
    }
}
