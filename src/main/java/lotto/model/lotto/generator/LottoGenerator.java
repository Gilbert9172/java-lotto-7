package lotto.model.lotto.generator;

import lotto.model.lotto.Lottos;
import lotto.model.money.Money;

public interface LottoGenerator {

    Lottos generateBy(final Money purchaseAmount);

}
