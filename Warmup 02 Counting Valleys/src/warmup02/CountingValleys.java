package warmup02;
// Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography
// During his last hike he took exactly n steps
//  For every step he took, he noted if it was an uphill, U , or a downhill, D step
//  Gary's hikes start and end at sea level and each step up or down represents a 1 unit change in altitude

// A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level
// A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level

// Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through

import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        char[] hike = scan.next().toCharArray();

        int count = 0; // steps taken
        int altitude = 0; // altitude

        // A valley is a sequence of steps starting with a step downward from sea level and ending with a step upward to sea level
        for(char c : hike) {
            // Step up
            if(c == 'U') {
                if(altitude == -1) {
                    count++;
                }
                altitude++;
            }
            // Step down
            else {
                altitude--;
            }
        }

        scan.close();

        System.out.println(count);
    }
}
