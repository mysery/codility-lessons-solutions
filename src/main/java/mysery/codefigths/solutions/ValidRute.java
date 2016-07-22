/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codefigths.solutions;

/**
 *
 * @author mysery
 */
public class ValidRute {

    public int validRoute(int[] travelTimes, int[] readyTimes, int[] cancelTimes) {

        int earliestStartTime = 0;
        int latestStartTime = 24 * 60 * 60;
        int totalWorkTime = 0;
        for (int i = 0; i < readyTimes.length; i++) {
            if (earliestStartTime + readyTimes[i] - travelTimes[i] > cancelTimes[i]) {
                return -1;
            }
            latestStartTime = Math.min(latestStartTime,
                    cancelTimes[i] - totalWorkTime);
            if (latestStartTime + totalWorkTime < readyTimes[i]) {
                totalWorkTime = readyTimes[i] - latestStartTime;
            }
            earliestStartTime = Math.max(earliestStartTime,
                    readyTimes[i] - totalWorkTime);

            totalWorkTime += travelTimes[i];
        }

        return totalWorkTime;
    }

}
