package service;

import pojo.MarginAccount;
import pojo.TradeAccount;
import repository.TradeAccountRepository;

import java.math.BigDecimal;

public class MarginAccountService implements TradeAccountService {

    private TradeAccountRepository tradeAccountRepository;

    public MarginAccountService(TradeAccountRepository tradeAccountRepository) {
        this.tradeAccountRepository = tradeAccountRepository;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        MarginAccount marginAccount = (MarginAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
        marginAccount.setMargin(marginAccount.getMargin().add(amount));
        updateTradeAccount(marginAccount);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        MarginAccount marginAccount = (MarginAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
        marginAccount.setMargin(marginAccount.getMargin().subtract(amount));
        updateTradeAccount(marginAccount);
    }


    public void createTradeAccount (MarginAccount marginAccount) {
        this.tradeAccountRepository.createTradeAccount(marginAccount);
    }

    public TradeAccount retrieveTradeAccount(String id) {
        return this.tradeAccountRepository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount (MarginAccount marginAccount) {
        this.tradeAccountRepository.updateTradeAccount(marginAccount);
    }

    public void deleteTradeAccount (String id) {
        this.tradeAccountRepository.deleteTradeAccount(id);
    }



}
