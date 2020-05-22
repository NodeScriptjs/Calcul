package com.scan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введите арабские числа от 0 до 10");
            String line = reader.readLine();

            int num = Integer.parseInt(line.split(" ")[0]);
            String symbol = line.split(" ")[1];
            int num1 = Integer.parseInt(line.split(" ")[2]);

            if (num <= 0 || num > 10 || num1 <= 0 || num1 > 10) {
                System.out.println("Числа не соответствуют формату");
                throw new NumberFormatException();
            }


            switch (symbol){
                case "+":
                    Plus plus = new Plus(num,num1);
                    plus.add();
                    break;
                case "-":
                    Minus minus = new Minus(num, num1);
                    minus.subs();
                    break;
                case "*":
                    Multi multi = new Multi(num, num1);
                    multi.multi();
                    break;
                case "/":
                    Div div = new Div(num, num1);
                    div.div();
                    break;
                default:
                    System.out.println("Знак не соответствует формату");
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }



        try {
            Map<Integer, String> map = new TreeMap<>();
            map.put(1,"I");
            map.put(2,"II");
            map.put(3,"III");
            map.put(4,"IV");
            map.put(5,"V");
            map.put(6,"VI");
            map.put(7,"VII");
            map.put(8,"VIII");
            map.put(9,"IX");
            map.put(10,"X");
            map.put(11,"XI");
            map.put(12,"XII");
            map.put(13,"XIII");
            map.put(14,"XIV");
            map.put(15,"XV");
            map.put(16,"XVI");
            map.put(17,"XVII");
            map.put(18,"XVIII");
            map.put(19,"XIX");
            map.put(20,"XX");

            System.out.println("Введите римсие числа от I до X ");
            String line = reader.readLine();

            String num = line.split(" ")[0];
            String symbol = line.split(" ")[1];
            String num1 = line.split(" ")[2];

            int numK = 0;
            int num1K = 0;
            for (Map.Entry<Integer, String> pair : map.entrySet()) {
                if(pair.getValue().equals(num)){
                    numK = pair.getKey();
                }
                if (pair.getValue().equals(num1)){
                    num1K = pair.getKey();
                }
            }

            if(numK <= 0 || numK > 10 || num1K <= 0 || num1K > 10){
                System.out.println("Числа не соответствуют формату");
                throw new NumberFormatException();
            }


            switch (symbol){
                case "+":
                    int sum = numK + num1K;
                    if (map.containsKey(sum)){
                        System.out.println("Ответ: " + map.get(sum));
                    }
                break;

                case "-":
                    int min = numK - num1K;
                    if(map.containsKey(min)){
                        System.out.println("Ответ: " + map.get(min));
                    }
                break;

                case "*":
                    int mult = numK * num1K;
                    if(map.containsKey(mult)){
                        System.out.println("Ответ: " + map.get(mult));
                    }else {
                        System.out.println("Лень числа до 100 пистать, извините");
                    }
                break;

                case "/":
                    int div = numK / num1K;
                    if(map.containsKey(div)){
                        System.out.println("Ответ: " + map.get(div));
                    }
                break;

                default:
                    System.out.println("Знак не соответствует формату");
                break;
            }


        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        } finally {
            reader.close();
        }
    }
}
