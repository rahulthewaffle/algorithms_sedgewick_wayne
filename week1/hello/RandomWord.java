/* *****************************************************************************
 *  Name:              Rahul Devanarayanan
 *  Coursera User ID:  123456
 *  Last modified:     2021 08 15
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champ = "";
        String x;
        double i = 0.0;

        while (!StdIn.isEmpty()) {
            i++;
            x = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / i)) {
                champ = x;
            }
        }

        StdOut.println(champ);
    }


}
