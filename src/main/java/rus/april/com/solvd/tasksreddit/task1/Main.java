package rus.april.com.solvd.tasksreddit.task1;

import rus.april.com.solvd.tasksreddit.task1.model.RootMain;

public class Main {
    /**
     * Calculate total amount of bank records for different users.
     * Bank records information is provided as .json file.
     * For practicing you can create such file manually putting some random information.
     */

    public static void main(String[] args) {
        System.out.println();
        JsonTask1Try1Parser parser = new JsonTask1Try1Parser();
        RootMain root = parser.parse();

        System.out.println("Root " + root.toString());
    }
}