/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 0,rigth= n;
        while (left<=rigth){
            int mid = left+ (rigth-left)/2;

            int result = guess(mid);

            if(result == 0){
                return mid;
            } else if (result == 1){
              left= mid+1;
            } else {
                rigth = mid - 1;

        }
    }
    return -1;
    }
}