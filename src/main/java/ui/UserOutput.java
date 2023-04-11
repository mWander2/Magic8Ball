package ui;

public class UserOutput {
    public void welcomeScreen(){
        System.out.println();
        System.out.println("Welcome to the ChatGPT Ball!");
        System.out.println();
        System.out.println("The Magic 8 Ball is a relic of the past.");
        System.out.println("Find out what the Future has in store!");
        System.out.println();

    }
    public void ask8Ball(){
        System.out.println("What would you like to ask the ChatGPT Ball?");
        System.out.println("Chat GPT still prefers Yes/No questions...");
    }

    public void askToContinue(){
        System.out.println("Would you like to ask another question?");
        System.out.println("(Y) for Yes and (N) for No.");
    }

    public void endScreen(){
        System.out.println();
        System.out.println("I'm starting to think you have a PhD in questioning, because you're a pro! Come back with more, and let's see if we can stump the chatbot.");
    }

    public void sayMessage(String message){
        System.out.println(message);
    }
}
