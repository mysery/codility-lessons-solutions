/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codefigths.tournament.solutions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author mysery
 */
public class Tournament1 {

    /*
    

     Your friend has invited you to watch a tennis match at a local sports club. Since tennis isn't your favorite sport, you get bored right at the start of the first game and start looking for something to keep yourself entertained. Noticing the scoreboard, you realize you don't even know how many points have been won since the game started, so you decided to calculate this number. Given the current score, your goal is to find the number of points won in the current game.

     If you are not familiar with tennis rules, here's a short description of its scoring system. Score calling is unique in tennis: each point has a corresponding call that is different from its point value. The table of points won and corresponding calls is given below.
     Number of points won 	Corresponding call
     0 	"love"
     1 	"15"
     2 	"30"
     3 	"40"

     There's an additional rule to remember: when players are tied by one or two points, the score is described as "15-all" and "30-all", respectively.

     It's guaranteed that no more than 5 points have been won so far, and the game is not over yet. It is also guaranteed that at least one point has been won.

     Example

     For score = "15-40", the output should be
     tennisGamePoints(score) = 4.

     The first player won 1 point, and the second 3, so 1 + 3 = 4 points have been won.

     For score = "30-all", the output should be
     tennisGamePoints(score) = 4.

     The players have won 2 points each.

     Input/Output

     [time limit] 3000ms (java)

     [input] string score

     A string in the format <p1>-<p2> representing a valid score, where <p1> is the first player's score, and <p2> is the second player's score.

     [output] integer

     The number of points won so far.


     */
    int tennisGamePoints(String score) {
        Map<String, Integer> m = new HashMap<>();
        m.put("all", -1);
        m.put("love", 0);
        m.put("15", 1);
        m.put("30", 2);
        m.put("40", 3);
        String[] s = score.split("-");
        int p1 = m.get(s[0]);
        int p2 = m.get(s[1]);
        if (p2 == -1) {
            return p1 * 2;
        }
        return p1 + p2;
    }

    /*
    

     You are a lifelong fan of your local football club, and proud to say you rarely miss a game. Even though you're a superfan, you still hate boring games. Luckily, boring games often end in a draw, at which point the winner is determined by a penalty shoot-out, which brings some excitement to the viewing experience. Once, in the middle of a penalty shoot-out, you decided to count the lowest total number of shots required to determine the winner. So, given the number of shots each team has already made and the current score, how soon can the game end?

     If you are not familiar with penalty shoot-out rules, here they are:

     Teams take turns to kick from the penalty mark until each has taken five kicks. However, if one side has scored more successful kicks than the other could possibly reach with all of its remaining kicks, the shoot-out immediately ends regardless of the number of kicks remaining.
     If at the end of these five rounds of kicks the teams have scored an equal number of successful kicks, additional rounds of one kick each will be used until the tie is broken.

     Example

     For shots = 2 and score = [1, 2], the output should be
     penaltyShots(shots, score) = 3.

     If the first team misses the penalty, the second team scores, and then the first one misses again, the score will be [1, 3]. As the first team can't get 2 more points in the last remaining shot until the end of the initial five rounds, the winner is determined.

     For shots = 10 and score = [10, 10], the output should be
     penaltyShots(shots, score) = 2.

     If one of the teams misses the penalty and the other one scores, the game ends.

     Input/Output

     [time limit] 3000ms (java)

     [input] integer shots

     An integer, the number of shots each team has made thus far.

     Constraints:
     0 ≤ shots < 100.

     [input] array.integer score

     An array of two integers, where score[0] is the current score of the first team and score[1] - of the second team.

     Constraints:
     score.length = 2,
     0 ≤ score[i] ≤ shots.

     [output] integer

     The minimal possible total number of shots required to determine the winner.


     */
    int penaltyShots(int shots, int[] score) {
        int t1 = score[0];
        int t2 = score[1];
        if (shots >= 5) {
            return 2;
        }
        return Math.min(t1, t2) + 6 - shots - Math.max(t1, t2);
    }

    /*
    

     You've been watching the Ice Hockey World Championship for several years now. Some time ago, you started to record information about each year's top teams and store this information in a table (note that the number of teams at the top doesn't change over the years). To see how country teams progressed throughout the years, you connected each country with lines and obtained a table similar to this one:

     Given this table, you've become interested in its structure and decide to count the number of line intersections in it.

     The table is provided as a rectangular matrix, where table[i] corresponds to top teams of the (i + 1)th year of your record (table[i][0] is the champion, table[i][1] is the second team, and so on). Your task is to calculate the number of intersections in it.

     Note that a team can disappear from the top for some years and then return to it at a later date.

     Example

     For

     table = [["Canada", "Sweden", "Czech", "Finland"],
     ["Canada", "Sweden", "Slovakia", "Czech"],
     ["Canada", "Sweden", "Czech", "Slovakia"],
     ["Sweden", "Canada", "Czech", "Finland"],
     ["Sweden", "Czech", "Slovakia", "Canada"]],

     the output should be
     topTeamsTable(table) = 3.

     This example corresponds to the image above. As you can see, there are only 3 intersections in it.

     Input/Output

     [time limit] 3000ms (java)

     [input] array.array.string table

     A rectangular matrix of strings. table[i] is the list of top teams of the (i + 1)th year.

     Constraints:
     2 ≤ table.length ≤ 10,
     2 ≤ table[0].length ≤ 10,
     0 < table[i][j].length < 10.

     [output] integer

     The number of intersections in the given table.


     */
    int topTeamsTable(String[][] table) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(table[0].length);
//                new LinkedHashMap<String, Integer>(table[0].length, 0.75f, true) {
//
//            @Override
//            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
//                return size() > table[0].length;
//            }
//        };

        for (int j = 0; j < table[0].length; j++) {
            String actual = table[0][j];
            map.put(actual, j);
        }
        int total = 0;
        for (int i = 1; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                String actual = table[i][j];
                if (map.containsKey(actual)) {
                    int prev = map.get(actual);
                    if (j != prev) {
                        for (int newC = j + 1; newC < table[0].length; newC++) {
                            String newCVal = table[i][j];
                            if (map.containsKey(newCVal)) {
                                if (map.get(actual) < j) {
                                    total++;
                                }
                            }
                        }
                        map.put(actual, j);
                    }
                } else {
                    map.put(actual, j);
                }
            }
        }
        return total;
    }

    /*


     You just got back from a 2 week vacation on the white sand beaches of sunny Miami. Naturally, you took a ton of photos, and now want to share them with the world by uploading them to the cloud. Unfortunately, your camera is a little old, so it gives photos random distinct names, with strict constraints: they all are of the same length, and consist only of lowercase Latin letters. To make matters worse, some photos are protected from renaming, meaning they will be uploaded in lexicographical order, so you need to rename some of them to make sure they will be stored in the logical order of when they were taken.

     Here's the task at hand: you're trying to rename the current photo. It should go between photos first and second, which are protected from renaming. What's the minimal number of characters you have to change in the current file's name to make it lexicographically greater than first and lexicographically smaller than second? It's guaranteed that first is always lexicographically smaller than second and it's always possible to find the answer.

     Note that you can't add or delete letters from the file's name.

     Example

     For current = "fullb", first = "filea" and second = "filew", the output should be
     logicalOrder(current, first, second) = 2.

     You should change two letters in the word "fullb" to turn it into "fileb". This way it will go between two others after the lexicographical sort.

     Input/Output

     [time limit] 3000ms (java)

     [input] string current

     A string consisting of lowercase Latin letters, the name of the current file that you should change.

     Constraints:
     1 ≤ current.length ≤ 50.

     [input] string first

     A string consisting of lowercase Latin letters, the name of the file after which you want to put the current one.

     Constraints:
     first.length = current.length,
     first ≠ current

     [input] string second

     A string consisting of lowercase Latin letters, the name of the file before which you want to put the current one.

     Constraints:
     second.length = first.length,
     second ≠ current,
     second ≠ first.

     [output] integer

     The minimal number of characters you have to change in the current file's name to reach your goal.


     */
    int logicalOrder(String current, String first, String second) {
        return -1;
    }

    /*


     It's late at night, and you find yourself standing at point A in a large field of barley. Squinting around you in the dim light, you see several large circles on the ground spread around you - crop circles! After taking a few steps in the dark, you notice that the circles don't intersect or touch one other, but that one circle can be inside another. You immediately decide to call the UFO-logists, but seem to have dropped your phone: looks like it fell out of your pajama pocket, and is now lying at point B. You need to get the phone to call for help, but you're afraid that your boots will damage the alien drawings. Therefore, you would like to carefully choose a path that crosses the circles as few times as possible.

     What is the minimum number of times you will have to cross the circles to get from point A to point B?

     Example

     For points = [[-2, 0], [9, 4]] and
     circles = [[0, 0, 4], [-2, 0, 1], [1, 1, 1], [9, 1, 4]],
     the output should be
     cropCircles(points, circles) = 3.

     Here's one of the possible paths you can take, which crosses the circles three times:

     Input/Output

     [time limit] 3000ms (java)

     [input] array.array.integer points

     A square matrix of integers. points[0] is a two-element array describing coordinates of the point A, points[1] is a two-element array describing coordinates of the point B.

     Constraints:
     points.length = 2,
     points[i].length = 2,
     -1000 ≤ points[i][j] ≤ 1000.

     [input] array.array.integer circles

     A rectangular matrix of integers. circles[i] is a three-element array describing the (i + 1)th circle in the following format: (circles[i][0], circles[i][1]) are the coordinates of the center of this circle and circles[i][2] is its radius.

     Constraints:
     1 ≤ circles.length ≤ 100,
     circles[i].length = 3,
     -1000 ≤ circles[i][0], circles[i][1] ≤ 1000,
     1 ≤ circles[i][2] ≤ 1000.

     [output] integer

     The least number of circles you have to cross to get to your cell phone.


     */
    int cropCircles(int[][] points, int[][] circles) {
        return -1;
    }

    /*
   

     You have a very stressful job in finance, which luckily pays you really well. To deal with stress you recently bought an aquarium, and since money is no object, you bought a number of exotic, carniverous fish that periodically eat one another. Watching nature take its course helps you deal with your job stress, as it mirrors the dog-eat-dog world of finance. While this is certainly entertaining, carniverous fish do mean that you have to buy new ones from time to time, replenishing your stock.

     You are given two arrays, weights and fish. The (i + 1)th fish has weight equal to weights[i], swims only along the vector (fish[i][0][0], fish[i][0][1]) and has initial coordinates (fish[i][1][0], fish[i][1][1]). Each fish swims at a constant speed of 1 unit of length per second. You know that when two fish meet, the larger one (the heavier one) eats the smaller one. If the weights are the same, the fish with the lower index eats the one with the larger index (nature is strange sometimes!). You may ignore the time it takes for a fish to eat another one. The predator fish then acquires the weight equal to the sum of its previous weight and the weight of its prey, and continues to swim in the same direction as before. It is guaranteed that three fish can't meet in the same point.

     Your goal is to calculate the number of fish that will still be alive after t seconds.

     Example

     For weights = [2, 3, 2, 1],
     fish = [[[1, 2], [-1, 0]], [[1, 0], [-3, 1]], [[-1, 2], [1, 0]], [[0, 1], [2, -4]]]
     and t = 5, the output should be
     aquariumFish(weights, fish, t) = 2.

     Initially there are 4 fish. After sqrt(5) seconds the first and the third fish will meet at the point (0, 2), and the first one will eat the third one, because they are of equal weight and 1 is smaller than 3. Later, after 5 seconds, the second fish and the fourth fish will meet at the point (2, 1), and the second one will eat the fourth one, since it has more weight. Thus, only 2 fish will be left after 5 seconds.

     Input/Output

     [time limit] 3000ms (java)

     [input] array.integer weights

     An array of integers, weights[i] is the weight of the (i + 1)th fish.

     Constraints:
     1 ≤ weights.length ≤ 200,
     1 ≤ weights[i] ≤ 1000.

     [input] array.array.array.integer fish

     An array of square matrices, fish[i] is the description of the movement of the (i + 1)th fish. fish[i][0] is a two-element array describing the corresponding fish direction, and fish[i][1] is the two-element array describing its initial coordinates.

     Constraints:
     fish.length = weights.length,
     fish[i].length = 2,
     fish[i][j].length = 2,
     -1000 ≤ fish[i][j][k] ≤ 1000.

     [input] integer t

     An integer, the number of seconds.

     Constraints:
     1 ≤ t ≤ 1000.

     [output] integer

     The number of fish that will survive up to the t seconds mark.


     */
    int aquariumFish(int[] weights, int[][][] fish, int t) {
        return -1;
    }

}
