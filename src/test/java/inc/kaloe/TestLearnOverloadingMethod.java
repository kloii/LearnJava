package inc.kaloe;

public class TestLearnOverloadingMethod {

    public static void main(String[] args) {
        LearnOverloadingMethod testLearnOverloadingMethod = new LearnOverloadingMethod();

        testLearnOverloadingMethod.area(5.0);
        testLearnOverloadingMethod.area(-1);
        testLearnOverloadingMethod.area(5.0, 4.0);
        testLearnOverloadingMethod.area(-1.0, 4.0);

    }


}
