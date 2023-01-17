class Solution {

    private int symbolsToNum(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V': 
                return 5;
            case 'X': 
                return 10;
            case 'L': 
                return 50;
            case 'C': 
                return 100;
            case 'D': 
                return 500;
            case 'M': 
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        int sum = 0;
        int currentChar = symbolsToNum(s.charAt(0));

        // Go through string
        for (int i = 1; i < s.length(); i++) {
            int nextChar = symbolsToNum(s.charAt(i));

            // If num before is less, subtract from next num
            if (currentChar < nextChar) {
                sum -= currentChar;
            }
            // If first num is greater than or = to next num then add to sum
            else {
                sum += currentChar;
                
            }

            currentChar = nextChar;
        }
        sum += currentChar;
        return sum;
    }
}