package lotto.io.validator.regex;

import java.util.regex.Pattern;

public class RegexPattern {
    private RegexPattern() {
    }

    public static final Pattern NUMBER_RANGE = Pattern.compile("^([1-9]|[1-3][0-9]|4[0-5])$");
}
