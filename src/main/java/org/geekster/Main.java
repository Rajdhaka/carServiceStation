package org.geekster;


import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Car Type");
        String carType = sc.nextLine();
        System.out.println("Enter the service codes");
        String serviceCode = sc.nextLine();
        String[] serviceCodes = serviceCode.split(",");

        BillGenerator bill = new BillGenerator(carType, serviceCodes);
        bill.generateBill();
    }
}