package niceway;

public class Happy extends MoodState {

    private Me me;

    public Happy(Me me) {
        this.me = me;
    }

    @Override
    public void doDayAction() {
        System.out.println("-day: eating ice cream...");
    }

    @Override
    public void doNightAction() {
        System.out.println("-night: bed is nice and warm");
    }

    @Override
    public void beSad() {
        System.out.println("-I see a spider. now I'm sad");
        me.setMyState(me.getSoSad());

    }

    @Override
    public void beHappy() {
        System.out.println("-this is already the top of my mood");
    }
}
