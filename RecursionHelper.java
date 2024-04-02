public class RecursionHelper {
    /** Self Explanation - Remember to detail your base and recursive cases.
     * Base 1 - If the variable str is empty, return self.
     * Base 2 - If the string has only one character, return self.
     * Note: Keeping base 1 and Base 2 separate for illustrative purposes even through they could be combined.
     * Recursive - Return the last character of the string and call the method again with the string minus the last character.
     * 
     * 
     */
    public String reverseString(String str) {
        if(str.length() == 0) {
            return str;
        } else if(str.length() == 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        }
    }
    /** Self Explanation - Remember to detail your base and recursive cases.
     * Base 1 - if the number is less than 10, return the total plus the number.
     * Recursive - return the method with the number divided by 10 and the total plus the number modulo 10 cubed.
     * 
     * 
     */
    public int armstrongNumber(int num, int total) {
        if(num < 10){
            return total + num;
        } else {
            return armstrongNumber(num / 10, total + (int)Math.pow(num % 10, 3));
        }
    }
    /** Self Explanation - Remember to detail your base and recursive cases.
     * Base 1 - If the variable str is empty or has only one character, return true.
     * Base 2 - If the first and last characters of the variable str are not the equal return false.
     * Base 3 - If the first and last characters of the variable str are equal and the string length is exactly 2, return true.
     * Recursive - Return the method with the variable str minus the first and last characters.
     * 
     */
    public boolean palindromeChecker(String str) {
        if(str.length() == 0 || str.length() == 1) {
            return true;
        } else if(str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        } else if(str.charAt(0) == str.charAt(str.length() - 1) && str.length() == 2) {
            return true;
        } else {
            return palindromeChecker(str.substring(1, str.length() - 1));
        }
    }
}
