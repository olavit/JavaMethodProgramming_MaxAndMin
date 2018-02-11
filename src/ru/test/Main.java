package ru.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public void go() {
        ArrayList<Integer> listChet = new ArrayList<>();
        ArrayList<Integer> listNechet = new ArrayList<>();
        try {
            while (true) {
                BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                String s = buf.readLine();
                if (Integer.parseInt(s)%2 == 0){
                    listChet.add(Integer.parseInt(s));

                }
                else listNechet.add(Integer.parseInt(s));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
            System.out.println(listChet);

            System.out.println(listNechet);

    }
}
