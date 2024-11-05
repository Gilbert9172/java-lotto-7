package lotto.error;

public class ErrorMessage {

    private ErrorMessage() {
    }

    public static final String SHOULD_NOT_BE_NULL = "[ERROR] Null이여서는 안됩니다.";
    public static final String AMOUNT_SHOULD_NOT_BE_MINUS = "[ERROR] 금액은 음수가 될 수 없습니다.";
    public static final String INVALID_UNIT_AMOUNT = "[ERROR] 1000원 단위로 입력해주세요.";
    public static final String DUPLICATED_LOTTO_NUMBER = "[ERROR] 중복된 로또 번호가 있습니다.";
}
