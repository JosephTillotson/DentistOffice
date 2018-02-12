package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;

public class textUI {
    private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    public int printMenu(Map<Integer, String> menuOptions) throws IOException {
        for (Integer key : menuOptions.keySet()) {
            System.out.println(key + " - " + menuOptions.get(key));
        }
        return readInt(menuOptions.keySet());
    }

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

    public void displayToUser(String s) {
        System.out.println(s);
    }

    public int getInt() {
        try {
            return Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 2;
    }
}
