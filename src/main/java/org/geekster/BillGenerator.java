package org.geekster;

import java.util.HashMap;

public class BillGenerator {
    String carType;
    String[] serviceCodes;
    BillGenerator(String carType, String [] serviceCodes){
        this.carType = carType;
        this.serviceCodes = serviceCodes;
    }

    public void generateBill(){
        CarService carService = new CarService();
        HashMap<String, HashMap<String,ServicePrice>>servicePrices = carService.servicePrices;
        HashMap<String,ServicePrice>prices = servicePrices.get(carType);
        System.out.println("Type of Car – "+carType);

        StringBuilder sb = new StringBuilder();
        sb.append("Service Codes – ");
        for(String codes: serviceCodes){
            sb.append(codes+", ");
        }
        sb.delete(sb.length()-2,sb.length());
        System.out.println(sb);
        System.out.println();

        for(String codes:serviceCodes){
            System.out.println("Charges for "+prices.get(codes).serviceName +"- ₹ "+ prices.get(codes).servicePrice);
        }
       int totalBill = 0;
        for(String codes : serviceCodes){
            int servicePrice = prices.get(codes).servicePrice;
            totalBill+=servicePrice;
        }
        System.out.println("Total Bill – ₹ "+ totalBill);
        System.out.println();
        if(totalBill>10000){
            System.out.println("Complimentary cleaning provided.");
        }

    }
}
