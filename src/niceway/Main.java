package niceway;

public class Main {
    public static void main(String[] args) {

        Me me = new Me();

        me.doDayAction();
        me.doNightAction();

        System.out.println();

        me.beSad();
        me.beSad();
        me.doDayAction();
        me.doNightAction();

        System.out.println();

        me.beHappy();
        me.beHappy();
    }
}
