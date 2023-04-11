package ui;

import java.util.Scanner;

public class UserInput {
    public String getQuestion(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String getContinueResponse(){
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine().trim().toLowerCase();
        while (!response.equals("y") && !response.equals("n")){
            System.out.println("Sorry that is not a valid response.");
            response = scanner.nextLine().trim().toLowerCase();
        }
        return response;
    }
}
