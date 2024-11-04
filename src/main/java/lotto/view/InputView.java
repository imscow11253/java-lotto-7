package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.exception.PriceToBuyLottoException;
import lotto.exception.WinningLottoNumberException;
import lotto.model.PriceToBuyLotto;
import lotto.model.WinningLottoNumber;

public class InputView {

    public static PriceToBuyLotto getPriceToBuyLotto() {
        PriceToBuyLotto priceToBuyLotto;
        try {
            String userInputPriceToBuyLotto = Console.readLine();
            priceToBuyLotto = PriceToBuyLotto.of(userInputPriceToBuyLotto);
        } catch (PriceToBuyLottoException e) {
            e.printErrorMessage();
            priceToBuyLotto = getPriceToBuyLotto();
        } finally {
            Console.close();
        }
        return priceToBuyLotto;
    }

    public static WinningLottoNumber getWinningLottoNumber() {
        WinningLottoNumber winningLottoNumber;
        try {
            String userInputWinningLottoNumber = Console.readLine();
            winningLottoNumber = WinningLottoNumber.of(userInputWinningLottoNumber);
        } catch (WinningLottoNumberException e) {
            e.printErrorMessage();
            winningLottoNumber = getWinningLottoNumber();
        } finally {
            Console.close();
        }
        return winningLottoNumber;
    }
}
