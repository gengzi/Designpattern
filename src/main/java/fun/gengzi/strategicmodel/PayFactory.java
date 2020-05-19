package fun.gengzi.strategicmodel;

public class PayFactory {

    private PayContext payContext;


    public PayFactory(String payEnum) {
        PayEnum pay = PayEnum.getPayEnumByCode(payEnum);
        if (pay != null) {
            switch (pay) {
                case WXZF:

                    break;
                case ZFB:
                    payContext = new PayContext(new ZFBPay());
                    break;
                default:
                    System.out.println("不支持支付类型");
            }
        }
    }

    public String toPay(PayBaseEntity entity) {
        return payContext.toPay(entity);
    }

}
