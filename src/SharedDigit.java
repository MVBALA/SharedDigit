public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if ((a > 10 && a < 100) && (b > 10 && b < 100)) {
            if ((a / 10 == b / 10) || (a % 10 == b / 10) || (a % 10 == b % 10))
                return true;
            else
                return false;
        } else
            return false;
    }
}
