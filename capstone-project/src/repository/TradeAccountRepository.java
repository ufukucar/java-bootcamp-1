package repository;

import pojo.TradeAccount;
import java.util.HashMap;
import java.util.Map;

public class TradeAccountRepository {


    private Map<String, TradeAccount> datastore = new HashMap<>();


    public void createTradeAccount (TradeAccount tradeAccount ) {
        datastore.put(tradeAccount.getId(), tradeAccount);
    }

    public TradeAccount  retrieveTradeAccount (String id) {
        return this.datastore.get(id) == null ? null : this.datastore.get(id).clone();
    }

    public void updateTradeAccount (TradeAccount tradeAccount) {
        this.datastore.put(tradeAccount.getId(), tradeAccount.clone());
    }

    public void deleteTradeAccount (String id) {
        this.datastore.remove(id);
    }


}
