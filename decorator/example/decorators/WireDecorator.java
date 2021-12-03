

public class WireDecorator extends BaseDecorator {

    public WireDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        ////enviar message por Wire
    }

}