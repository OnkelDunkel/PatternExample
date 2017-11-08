package niceway;

public class Me {

    private MoodState myState;

    private MoodState soHappy;
    private MoodState soSad;

    public Me() {
        this.soHappy = new Happy(this);
        this.soSad = new Sad(this);
        this.myState = soHappy;
    }

    public void doDayAction() {
        myState.doDayAction();
    }
    public void doNightAction() {
        myState.doNightAction();
    }
    public void beSad() {
        myState.beSad();

    }
    public void beHappy() {
        myState.beHappy();
    }

    public MoodState getMyState() {
        return myState;
    }
    public void setMyState(MoodState myState) {
        this.myState = myState;
    }
    public MoodState getSoHappy() {
        return soHappy;
    }
    public MoodState getSoSad() {
        return soSad;
    }
}
