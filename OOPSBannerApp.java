/**
 * OOPSBannerApp UC3 – OOPS Banner Application
 *
 * This class extends UC2 by constructing the banner
 * using String.join() instead of the + operator.
 *
 * @author Developer
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ", " *** ", " *** ", " ***** ", " ***** "));
        System.out.println(String.join(" ", "*   *", "*   *", "*   * ", "*     "));
        System.out.println(String.join(" ", "*   *", "*   *", "*   * ", "*     "));
        System.out.println(String.join(" ", "*   *", "*   *", "***** ", " **** "));
        System.out.println(String.join(" ", "*   *", "*   *", "*     ", "    * "));
        System.out.println(String.join(" ", "*   *", "*   *", "*     ", "    * "));
        System.out.println(String.join(" ", " *** ", " *** ", "*     ", "***** "));

    }

}