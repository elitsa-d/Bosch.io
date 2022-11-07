public class BinarySearch {
    public static int search(int[] array, int value) {
        int beginIndex = 0;
        int endIndex = array.length - 1;
        int guessIndex;

        while(beginIndex <= endIndex) {
            guessIndex = (beginIndex + endIndex) / 2;
            if (array[guessIndex] == value) {
                return guessIndex;
            } else if(array[guessIndex] < value) {
                beginIndex = guessIndex + 1;
            } else {
                endIndex = guessIndex - 1;
            }
        }

        return -1;
    }
}
