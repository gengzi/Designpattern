package fun.gengzi.strategicmodel;

public abstract class PayMethodService {

    /**
     * 支付
     *
     * @param entity
     * @return
     */
    public abstract String pay(PayBaseEntity entity);

}
