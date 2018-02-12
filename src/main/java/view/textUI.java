package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;

public class textUI {
    private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    /**
     * will present the menu and then go to propmpt for input
     * @param menuOptions is the Map <> that will be printed
     * @return will go to the next method to propmpt for input
     * @throws IOException To make sure that the for loop runs properly and the buffered reader
     */

    public int printMenu(Map<Integer, String> menuOptions) throws IOException {
        for (Integer key : menuOptions.keySet()) {
            System.out.println(key + " - " + menuOptions.get(key));
        }
        return readInt(menuOptions.keySet());
    }

    /**
     * This prompts the user to get the imput of the desired int.
     * @param allowedInts it will take in the menu options from above to get the desired ints that are needed and are only allowed
     * @return will return a int that are in the desired amount
     * @throws IOException Trows it from the buffered reader
     */
    private int readInt(Set<Integer> allowedInts) throws IOException {
        while (true) {
            String line = br.readLine();
            int selection = -1;
            try {
                selection = Integer.parseInt(line);
                if (allowedInts.contains(selection)) {
                    return selection;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Sorry, that selection is invalid. Please try again.");
            }
        }


    }

    /**
     * will display to the user the input that we need.
     * @param s the string to be printed
     */
    public void displayToUser(String s) {
        System.out.println(s);
    }

    /**
     * will promt for a int without having to go through the process of teh maps
     * @return will return one int. will need to be clarified in the main class
     */

    public int getInt() {
        try {
            return Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 2;
    }
}
