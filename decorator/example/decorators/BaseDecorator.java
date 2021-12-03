

public class BaseDecorator implements Notifier {
    private Notifier wrappee;

    BaseDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}
