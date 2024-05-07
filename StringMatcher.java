public class StringMatcher {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter a string s2: ");
        String s2 = input.nextLine();

        int index = match(s1, s2);
        if (index >= 0)
            System.out.println("matched at index " + index);
        else
            System.out.println("unmatched");
    }

    /**
     * The worst-case complexity is O(n), where n is s.length()
     *
     * @param s String
     * @param pattern String
     * @return int
     */
    public static int match(String s, String pattern) {
        int n = s.length();
        int m = pattern.length();

        // Iterate through s
        for (int i = 0; i <= n - m; i++) {
            int j;
            // Check if pattern matches starting from index i in s
            for (j = 0; j < m; j++) {
                if (s.charAt(i + j) != pattern.charAt(j)) {
                    // If characters don't match, break and move to next index in s
                    break;
                }
            }
            // If the inner loop completed without a break, pattern is found at index i
            if (j == m) {
                return i;
            }
        }
        // If pattern is not found, return -1
        return -1;
    }

}