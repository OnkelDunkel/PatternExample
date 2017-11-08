package badway;

public class BadImpl {

    String myself = "happy";

    public void daAction () {


        if (myself == "happy") {
            eatIceCream();
        } else if (myself == "sad") {
            goToPub();
        } else {
            stayHome();
        }

    }


    private void eatIceCream () {

        System.out.println("eating ice cream...");
    }

    private void goToPub () {

        System.out.println("drinking at pub...");
    }

    private void stayHome () {

        System.out.println("staying home all day playing video games...");
    }
}
