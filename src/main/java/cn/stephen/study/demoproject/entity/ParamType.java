package cn.stephen.study.demoproject.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/04/20:31
 * @Description:
 */
public enum ParamType{
    rate1("001","时"),
    rate2("002","日"),
    rate3("003","月"),
    rate4("004","年");

    //频率ID
    String rateId;
    //频率名
    String rateName;

    public String getRateId() {
        return rateId;
    }
    public String getRateName() {
        return rateName;
    }

    ParamType(String rateId, String rateName) {
        this.rateId = rateId;
        this.rateName = rateName;
    }

    /**
     * 取某一个值
     */
    public static ParamType codeOf(String rateId){
        for(ParamType paramType: values()){
            if (paramType.getRateId().equals(rateId)){
                return paramType;
            }
        }
        //throw new WorkflowException("枚举类转换异常");
        return null;
    }



}
