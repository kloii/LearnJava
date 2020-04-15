package inc.kaloe;

public class TestOperators {
    public static void main(String[] args) {
        Operators MyOperators = new Operators();

        System.out.println("result = " + MyOperators.result);
        System.out.println("++result = " + ++MyOperators.result);
        System.out.println(MyOperators.result);
        System.out.println("result++ = " + MyOperators.result++);
        System.out.println(MyOperators.result);
        System.out.println("--result = " + --MyOperators.result);
        System.out.println(MyOperators.result);
        System.out.println("result-- = " + MyOperators.result--);
        System.out.println(MyOperators.result);
        MyOperators.result--;
        System.out.println("result = " + MyOperators.result);

        // 1+=MyOperators.result; //error out
        MyOperators.result+=1;
        System.out.println("MyOperators.result+=1 = " + MyOperators.result);
        // 1-=MyOperators.result; //error out
        MyOperators.result-=1;
        System.out.println("MyOperators.result-=1 = " + MyOperators.result);

        // if (MyOperators.value = 10) //error out. if expects a boolean value inside the parenthesis

        if (MyOperators.value == 10)
            System.out.println("value IS 10");
        else System.out.println("value is NOT 10");

        if (MyOperators.isAlien = true) //no error. isAline itself is a boolean. =true just changes it from false to true while it stays as a boolean.
            System.out.println("This is not supposed to happen");

        if (MyOperators.isAlien) //Recommended way to use boolean in if statement. By using if (MyOperators.isAlien) or if (!MyOperators.isAlien) to avoid accidentally assign it a different value
            System.out.println("Now isAline is true");
        else System.out.println("Now isAline is false. Which is not true");

        MyOperators.operatorsChallenge();
    }
}
