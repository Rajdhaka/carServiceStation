package org.geekster;

import java.util.HashMap;

public class CarService {
    public HashMap<String, HashMap<String,ServicePrice>>servicePrices = new HashMap<>();
    CarService(){
        servicePrices = new HashMap<>();
        HashMap<String,ServicePrice>hatchback = new HashMap<>();
        hatchback.put("BS01",new ServicePrice("Basic Servicing",2000));
        hatchback.put("EF01",new ServicePrice("Engine Fixing",5000));
        hatchback.put("CF01",new ServicePrice("Clutch Fixing",2000));
        hatchback.put("BF01",new ServicePrice("Brake Fixing",1000));
        hatchback.put("GF01",new ServicePrice("Gear Fixing",3000));
        servicePrices.put("Hatchback",hatchback);

        HashMap<String,ServicePrice>sedan = new HashMap<>();
        sedan.put("BS01",new ServicePrice("Basic Servicing",4000));
        sedan.put("EF01",new ServicePrice("Engine Fixing",8000));
        sedan.put("CF01",new ServicePrice("Clutch Fixing",4000));
        sedan.put("BF01",new ServicePrice("Brake Fixing",1500));
        sedan.put("GF01",new ServicePrice("Gear Fixing",6000));
        servicePrices.put("Sedan",sedan);

        HashMap<String,ServicePrice>suv = new HashMap<>();
        suv.put("BS01",new ServicePrice("Basic Servicing",5000));
        suv.put("EF01",new ServicePrice("Engine Fixing",10000));
        suv.put("CF01",new ServicePrice("Clutch Fixing",6000));
        suv.put("BF01",new ServicePrice("Brake Fixing",2500));
        suv.put("GF01",new ServicePrice("Gear Fixing",8000));
        servicePrices.put("SUV",suv);
    }
}
