
public class TelegramDecorator extends BaseDecorator {

    public TelegramDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        ////enviar message por Telegram
    }

}