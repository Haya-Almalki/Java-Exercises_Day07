public class DiscountRate {

    private static double serviceDiscountPremium=0.2;
    private static double getServiceDiscountGold=0.15;
    private static double getServiceDiscountSilver=0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    static public double getServiceDiscountRate(String type){
        if (type.equals("premium")){
            return serviceDiscountPremium;
        } else if (type.equals("gold")) {
            return getServiceDiscountGold;
        }else if(type.equals("silver")){
            return getServiceDiscountSilver;
        }
        else throw new IllegalArgumentException("wrong type");

    }

    static public double getProductDiscountRate(String type){
        if (type.equals("premium")){
            return productDiscountPremium;
        } else if (type.equals("gold")) {
            return productDiscountGold;
        }else if(type.equals("silver")){
            return productDiscountSilver;
        }
        else throw new IllegalArgumentException("wrong type");
    }


}
