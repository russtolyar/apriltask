public class Code1 {
    /**
     * You live in the city of Cartesia where all roads are laid out in a
     * perfect grid. You arrived ten minutes too early to an appointment,
     * so you decided to take the opportunity to go for a short walk. The
     * city provides its citizens with a Walk Generating App on their phones
     * -- everytime you press the button it sends you an array of one-letter
     * strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You
     * always walk only a single block for each letter (direction) and you know
     * it takes you one minute to traverse one city block, so create a function
     * that will return true if the walk the app gives you will take you exactly
     * ten minutes (you don't want to be early or late!) and will, of course,
     * return you to your starting point. Return false otherwise.
     *
     * Note: you will always receive a valid array (string in COBOL) containing a
     * random assortment of direction letters ('n', 's', 'e', or 'w' only).
     * It will never give you an empty array (that's not a walk, that's standing
     * still!).
     */
    public static void main(String[] args) {
        String[]s = {"s","s","n","n","w","w","e","e","s","n"};
        String[]s2 = {"s","s","n","n","w","w","e","s","s","n"};
        String[]s1 = {"s","s","n","n","w","w","e","e","s","n","s","n"};
        char[]c = {'w','w','e','e','n','n','s','s','w','e'};
        System.out.println(isValid(s));
        System.out.println(isValid(c));
    }
    public static boolean isValid(String[] walk) {
//        String[]walk1 = (String[]) walk;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        boolean result = false;
        for (int i = 0; i < walk.length; i++) {
            if (walk[i].equals("w")) {
                countA++;
            }
            if (walk[i].equals("e")) {
                countB++;
            }
            if (walk[i].equals("n")) {
                countC++;
            }
            if (walk[i].equals("s")) {
                countD++;
            }
        }
        if (countA == countB && countC == countD && walk.length == 10) {
            result = true;
        }
        return result;
    }

    public static boolean isValid(char[] walk) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        boolean result = false;
        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'w') {
                countA++;
            }
            if (walk[i] == 'e') {
                countB++;
            }
            if (walk[i] == 'n') {
                countC++;
            }
            if (walk[i] == 's') {
                countD++;
            }
        }
        if (countA == countB && countC == countD && walk.length == 10) {
            result = true;
        }
        return result;
    }

}