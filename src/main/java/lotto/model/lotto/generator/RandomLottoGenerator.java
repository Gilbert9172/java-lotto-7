package lotto.model.lotto.generator;

import static camp.nextstep.edu.missionutils.Randoms.pickUniqueNumbersInRange;
import static java.util.Comparator.naturalOrder;
import static lotto.model.lotto.Lotto.END_INCLUSIVE;
import static lotto.model.lotto.Lotto.MAX_NUMBER_COUNT;
import static lotto.model.lotto.Lotto.START_INCLUSIVE;

import java.util.List;
import java.util.stream.Stream;
import lotto.model.lotto.Lotto;
import lotto.model.lotto.Lottos;

public class RandomLottoGenerator implements LottoGenerator {

    @Override
    public Lottos generate(final int lottoCount) {
        List<Lotto> list = Stream.generate(this::generateSortedUniqueNumbers)
                .limit(lottoCount)
                .map(Lotto::from)
                .toList();
        return Lottos.from(list);
    }

    private List<Integer> generateSortedUniqueNumbers() {
        return pickUniqueNumbersInRange(START_INCLUSIVE, END_INCLUSIVE, MAX_NUMBER_COUNT)
                .stream()
                .sorted(naturalOrder())
                .toList();
    }
}
