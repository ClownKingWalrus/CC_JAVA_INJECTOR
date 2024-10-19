/*
 * Static Utils Class:
 * 
 * this class lets you do a host of static things such as clearing consol or changing color of text for debugging
 * 
 * you can access the functions by doing UTILS.Function
 */
package cc_java_injector;


//final prevents inherating this class into another class
public final class UTILS {
    private UTILS() {
        throw new UnsupportedOperationException("DO NOT CREATE MORE INSTANCES OF THIS CLASS ITS STATIC");
    }
    public static void Clear() {
        System.out.print("\033[H\033[2J");
    }
}
