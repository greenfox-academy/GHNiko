public class Greet {
    public static void main(String[] args) {
        // - Create a string variable named `al` and assign the value `Greenfox` to it
        // - Create a function called `greet` that greets it's input parameter
        //     - Greeting is printing e.g. `Greetings dear, Greenfox`
        // - Greet `al`

        String al = "GreenFox";
        greet(al);
    }

    private static void greet(String al) {

        System.out.printf("Hello, %s!", al);
    }
}
