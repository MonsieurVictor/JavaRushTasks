package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
//        String phoneNumberLastPart = "0501234567";
//        System.out.println( "+"+ "38" + "(" + phoneNumberLastPart.substring(0,2) + ")"
//                + phoneNumberLastPart.substring(3,6) + "-" + phoneNumberLastPart.substring(6,8) + "-"
//                + phoneNumberLastPart.substring(8,10));


    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter (IncomeData data){
            this.data = data;
        }
        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber(){
//            String phoneNumberLastPart = Integer.toString(data.getPhoneNumber());
//            if (phoneNumberLastPart.length()<10){
//                while((10 - phoneNumberLastPart.length()) > 0){
//                    phoneNumberLastPart = "0" + phoneNumberLastPart;
//                }
//            }
//            String fullPhoneCode = "+"+ data.getCountryPhoneCode() + "(" + phoneNumberLastPart.substring(0,2) + ")"
//                    + phoneNumberLastPart.substring(3,6) + "-" + phoneNumberLastPart.substring(6,8) + "-"
//                    + phoneNumberLastPart.substring(8,10);
//            return  fullPhoneCode;
            return "+" + data.getCountryPhoneCode() + String.format(
                    "%010d",
                    data.getPhoneNumber()
            ).replaceFirst(
                    "(\\d{3})(\\d{3})(\\d{2})(\\d{2})",
                    "($1)$2-$3-$4"
            );

        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}