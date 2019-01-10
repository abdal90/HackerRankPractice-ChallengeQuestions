package SockMerchant;



// John works at a clothing store. He has a large pile of socks that he must pair by color for sale
// Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {

    // To solve this challenge, we go through each color i and count its frequency f(i)
    // Once we've calculated all the frequencies, we calculate the number of pairs of each kind of sock as f(i)/2 (using integer division).
    // Finally, we print the total sum of all pairs of socks.

    public static void main(String[] args) {
        //declare a scanner
        Scanner scan = new Scanner(System.in);
        // declare number of arguments for array
        int n = scan.nextInt();
        // use a hash map to keep track of pairs of color
        HashMap<Integer, Integer> colors = new HashMap<>();

        // loop through number of arguments
        while(n-- > 0) {
            // number to array
            int c = scan.nextInt();
            // get frequency in the hash map
            Integer frequency = colors.get(c);

            // If new color, add to map
            if(frequency == null) {
                colors.put(c, 1);
            }
            else {
                // Increment frequency of existing color
                colors.put(c, frequency + 1);
            }
        }
        scan.close();

        // Count and print the number of pairs
        int pairs = 0;
        // loop through hash map
        for(Integer frequency : colors.values()) {
            // >> shift right
            // once the pair is updated the map should shift right
            pairs += frequency >> 1;
        }
        System.out.println(pairs);
    }
}
