public class freq_counter_using_array {
    public static void main(String[] args) {
        String text = "helloworld";
        int[] frequency = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c - 'a']++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                   System.out.println((char)(i + 'a') + ": " + frequency[i]);
            }
        }
    }
}
