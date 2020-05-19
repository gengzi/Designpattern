package fun.gengzi.strategicmodel;

public interface IPayMethodService {

    /**
     * 支付
     *
     * @param entity
     * @return
     */
    String pay(PayBaseEntity entity);

}
