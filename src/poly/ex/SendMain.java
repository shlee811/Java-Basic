package poly.ex;
import poly.ex.sender.SmsSender;
import poly.ex.sender.FaceBookSender;
import poly.ex.sender.EmailSender;
import poly.ex.sender.Sender;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new
                FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
