package lotto.service;

import lotto.model.lotto.Lotto;
import lotto.model.lotto.Lottos;
import lotto.model.lotto.generator.LottoGenerator;
import lotto.model.money.Money;
import lotto.model.rank.DrawResultRankTable;
import lotto.model.rank.RankCondition;

public class LottoService {

    private final LottoGenerator lottoGenerator;

    public LottoService(final LottoGenerator lottoGenerator) {
        this.lottoGenerator = lottoGenerator;
    }

    public Lottos offerLottos(final Money purchaseAmount) {
        return lottoGenerator.generateBy(purchaseAmount);
    }

    public DrawResultRankTable rankMyLottos(
            final Lottos lottos,
            final Lotto drawResult,
            final Integer bonusNumber
    ) {
        DrawResultRankTable rankTable = DrawResultRankTable.initiate();

        lottos.initiateReadOnlyStream()
                .forEach(lotto -> {
                    RankCondition rankCondition = lotto.rankWith(drawResult, bonusNumber);
                    rankTable.updateIfPresent(rankCondition);
                });

        return rankTable;
    }
}
