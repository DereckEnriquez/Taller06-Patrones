package refactoring_guru.decorator.example.decorators;

public class WhatsAppDecorator extends BaseDecorator {

    public WhatsAppDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        ////enviar message por WhatsApp
    }

}
