public class A_Monoloog {

    public static void main(String[] args) {
        // Groepeer de statement in hun eigen method, en roep de method aan vanuit main. De code blijft functioneel hetzelfde doen.
        // Een conversatie bestaat uit een `greeting`, wat `smallTalk` en een `goodbye`
        printGreeting();
        printWelcomeMessage();
        System.out.println("How about this weather?");
        System.out.println("And did you see that random program on that random channel?");
        System.out.println("Thank you for a wonderful conversation!");
        System.out.println("Cya");
    }

    public static void printGreeting() {
        System.out.println("Hey!");
    }

    public static void printWelcomeMessage() {
        System.out.println("Welcome to a wonderful conversation!");
    }

}
