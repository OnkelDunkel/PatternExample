package niceway;

public class Sad extends MoodState {

    private Me me;

    public Sad(Me me) {
        this.me = me;
    }

    @Override
    public void doDayAction() {
        System.out.println("-day: drinking at pub");
    }

    @Override
    public void doNightAction() {
        System.out.println("-night: fall asleep on street and get robbed");
    }

    @Override
    public void beSad() {
        System.out.println("-can't get any sadder than this :(");
    }

    @Override
    public void beHappy() {
        System.out.println("-wow a rainbow. I'm so happy again now");
        me.setMyState(me.getSoHappy());
    }
}
