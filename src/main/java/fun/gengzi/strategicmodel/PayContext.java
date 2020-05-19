package fun.gengzi.strategicmodel;

public class PayContext {

    private IPayMethodService payMethodService;

    public PayContext(IPayMethodService payMethodService) {
        this.payMethodService = payMethodService;
    }

    public String toPay(PayBaseEntity payBaseEntity) {
        return payMethodService.pay(payBaseEntity);
    }
}
