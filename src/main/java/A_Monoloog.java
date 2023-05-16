public class A_Monoloog {

    public static void main(String[] args) {
        // Groepeer de statement in hun eigen method, en roep de method aan vanuit main. De code blijft functioneel hetzelfde doen.
        // Een conversatie bestaat uit een `greeting`, wat `smallTalk` en een `goodbye`
        printGreeting();
        printWelcomeMessage();
        printQuestionOne();
        printQuestionTwo();
        printCompliment();
        printGoodbye();
    }

    public static void printGreeting() {
        System.out.println("Hey!");
    }

    public static void printWelcomeMessage() {
        System.out.println("Welcome to a wonderful conversation!");
    }

    public static void printQuestionOne() {
        System.out.println("How about this weather?");
    }

    public static void printQuestionTwo() {
        System.out.println("And did you see that random program on that random channel?");
    }

    public static void printCompliment() {
        System.out.println("And did you see that random program on that random channel?");
    }

    public static void printGoodbye() {
        System.out.println("Cya");
    }
}
