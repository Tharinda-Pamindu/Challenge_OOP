import com.example.model.User;
import com.example.view.MessageView;

public class Main {
    public static void main(String[] args) {

        User user = new User("Tharinda", "Pamindu");
        MessageView myMsg = new MessageView(user);
        myMsg.sendMessage();
        myMsg.sendMessage();
        myMsg.sendMessage();
        myMsg.sendMessage();
        myMsg.allMessage();

    }
}