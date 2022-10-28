package onboarding;

public class Problem2 {
    private static final String REGEX = "([a-z])\\1+";

    public static String solution(String cryptogram) {
        String decodedCryptogram = cryptogram;
        do {
            cryptogram = decodedCryptogram;
            decodedCryptogram = removeConsecutiveDuplicates(cryptogram);
        } while (!isDecoded(cryptogram, decodedCryptogram));
        return decodedCryptogram;
    }

    private static boolean isDecoded(String cryptogram, String decodedCryptogram) {
        return cryptogram.equals(decodedCryptogram);
    }

    private static String removeConsecutiveDuplicates(String cryptogram) {
        return cryptogram.replaceAll(REGEX, "");
    }
}
