package lotto.io.validator.money;

import static lotto.io.error.ErrorMessage.INVALID_CHAR_INCLUDED_IN_PURCHASE_INPUT;
import static lotto.io.exception.InvalidRegexException.invalidMoneyRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator extends InputValidator {

    private static final Pattern regexPattern = Pattern.compile("^[0-9]+$");

    @Override
    public void check(final String source) {

        if (isNotValid(source)) {
            throw invalidMoneyRegex(INVALID_CHAR_INCLUDED_IN_PURCHASE_INPUT);
        }

        super.check(source);
    }

    private boolean isNotValid(final String source) {
        Matcher matcher = regexPattern.matcher(source);
        return !matcher.matches();
    }
}