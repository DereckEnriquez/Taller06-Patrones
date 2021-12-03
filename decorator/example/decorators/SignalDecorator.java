package refactoring_guru.decorator.example.decorators;

public class SignalDecorator extends BaseDecorator {

    public SignalDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        ////enviar message por Signal
    }

}