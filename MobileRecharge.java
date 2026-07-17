class MobileRecharge{

    static String customerName;
    static String mobileNumber;
    static String serviceProvider;
    static String rechargePlan;
    static double rechargeAmount;
    static String paymentMode;
    static String rechargeStatus;
    static String rechargeDate;

    public static boolean createRecharge(String cName, String number,
            String provider, String plan,
            double amount, String payment,
            String status, String date){

        boolean isCreated = false;

        customerName = cName;
        mobileNumber = number;
        serviceProvider = provider;
        rechargePlan = plan;
        rechargeAmount = amount;
        paymentMode = payment;
        rechargeStatus = status;
        rechargeDate = date;

        isCreated = true;

        return isCreated;
    }

    public static void getRechargeData(){

        System.out.println("Customer Name : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Service Provider : " + serviceProvider);
        System.out.println("Recharge Plan : " + rechargePlan);
        System.out.println("Recharge Amount : " + rechargeAmount);
        System.out.println("Payment Mode : " + paymentMode);
        System.out.println("Recharge Status : " + rechargeStatus);
        System.out.println("Recharge Date : " + rechargeDate);
        System.out.println("--------------------------------");

    }

}