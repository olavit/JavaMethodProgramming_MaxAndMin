package ru.java_metjods_programmimg_exs2b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MaxAndMin {
        public static void main(String[] args) throws Exception {
            int max;
            int min;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list = new ArrayList<Integer>();

            while (true) {
                String s = reader.readLine();
                if (s.isEmpty()) break;
                list.add(Integer.parseInt(s));
            }

            max = list.get(0);
            min = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max)
                    max = list.get(i);
                if (list.get(i) < min)
                    min = list.get(i);
            }
            System.out.println(max);
            System.out.println(min);

        }
}
