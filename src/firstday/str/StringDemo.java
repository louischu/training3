package firstday.str;

public class StringDemo {
    public static void main(String[] args) {
        printString("Hello Hung Anh!");
        //String method:
        // Substring
        String s = "Bonjour,#We are in Training3#JGeek class!";
        String substring = s.substring(2, 5);
        System.out.println("Sub: " + substring);
        // Index Of
        int indexOfFirst = s.indexOf("#");
        int indexOfLast = s.lastIndexOf("#");
        substring = s.substring(indexOfFirst + 1, indexOfLast);
        System.out.println("Sub: " + substring);
        // Replace

        // To Character Arrays
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println("-> " + chars[i]);
        }
    }

    private static void printString(String s) {
        System.out.println(s);
    }

    public static boolean isValidPalidrome(String s) {
        return true;
    }
}
