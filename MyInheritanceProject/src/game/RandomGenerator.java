package game;

import java.util.Random;

/**+
 * Generates a random number that can be used in the game
 */

public class RandomGenerator {

    /**+
     * calculate a random number from zero to bound
     * @param bound is the max bound of the generator, needs to be int
     * @return returns a random int within zero and bound
     */
    public static int randomInt(int bound){
        Random generator = new Random(System.nanoTime());
        int output = generator.nextInt(bound);
        System.out.println(output);
        return output;

    }

}
