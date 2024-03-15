public class Main {
    public static void main(String[] args) {
        Main o = new Main();


        System.out.println(o.lengthOfLastWord("Hello Worlds"));


    }


    int lengthOfLastWord(String s) {

        int count = 0;

        String new_string = s.trim();


        for (int i = new_string.length() - 1; i >= 0; i--) {
            if (new_string.charAt(i) == ' ') {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}

