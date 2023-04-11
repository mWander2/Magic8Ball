package application;

import ui.UserInput;
import ui.UserOutput;

import java.util.Random;


public class ChatGPTBall {

    static UserOutput output = new UserOutput();
    static UserInput input = new UserInput();


    public static void main(String[] args) {
        output.welcomeScreen();
        String askAnother = "y";
        while (askAnother.equals("y")) {
            output.ask8Ball();
            String question = input.getQuestion();
            output.sayMessage("You asked: " + question);
            shakeChatGPT();
            output.askToContinue();
            askAnother = input.getContinueResponse();
        }
        output.endScreen();
    }

    private static void shakeChatGPT() {
        String[] chatGPTResponse = new String[]{

                "As certain as a cat's disinterest in your problems.", //1
                "As sure as a cat's ability to ignore you when you call its name.", //2
                "You can rely on it like a hangover after a night of drinking.", //3
                "Oh yeah, like a squirrel hoarding nuts for winter.",//4
                "More certain than a rooster's morning crow, but less annoying.", //5
                "My Magic 8 Ball and I agree, like two peas in a pod, except one is made of plastic and the other is a computer program.", //6
                "Looks like it's going to happen, but don't quit your day job just yet.", //7
                "The answer is yes, like the answer to the question 'Is water wet?'", //8
                "The forecast is sunny with a chance of unicorns.", //9
                "I see all the signs, from the tea leaves to the trail of breadcrumbs, and they all lead to yes.", //10
                "The answer is about as clear as a mud puddle, so shake again and let's try to get some clarity up in here.", //11
                "Sorry, that's classified information, and I don't want the CIA coming after me.", //12
                "I'm currently on vacation in the Bahamas, so try again when I'm back in the office.", //13
                "The answer is about as elusive as Bigfoot, so try asking again when you're deep in the woods.", //14
                "Put on some yoga pants, light a candle, and try again when you're in the zone.", //15
                "You've got a better chance of winning the lottery while being struck by lightning and bitten by a shark all at the same time.", //16
                "The outlook is about as gloomy as a funeral on a rainy day.", //17
                "Chances are slim, and so are the chances of me fitting into my high school jeans.", //18
                "The sources have spoken, and the answer is a resounding no. They also said you need to work on your dance moves.", //19
                "Negative, like a battery without a charge or a toddler without candy." // 20
        };

        int randomNumber = new Random().nextInt(20);
        for (int i = 0; i < chatGPTResponse.length; i++) {
            if (randomNumber == i) {
                System.out.println();
                System.out.println("Beep-beep-boop-beeeeeep.");
                System.out.println(chatGPTResponse[i]);
                System.out.println();
            }
        }
    }
}


