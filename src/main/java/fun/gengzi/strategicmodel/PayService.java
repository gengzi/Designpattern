package fun.gengzi.strategicmodel;

public class PayService {

    public String payMoney(PayBaseEntity pay) {
        if (PayEnum.ZFB.name().equals(pay.getPayMethod())) {
            //支付宝流程
        } else if (PayEnum.WXZF.name().equals(pay.getPayMethod())) {
            // 微信流程
        } else if (PayEnum.YHKZF.name().equals(pay.getPayMethod())) {
            // 银行卡流程
        } else {
            //  其他方式
        }
//        return "";


//        PayContext payContext = new PayContext(new ZFBPay());
//        return payContext.toPay(pay);

        PayFactory payFactory = new PayFactory(pay.getPayMethod());
        return payFactory.toPay(pay);

    }


}
