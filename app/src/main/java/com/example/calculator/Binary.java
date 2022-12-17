package com.example.calculator;

import java.util.ArrayList;

public class Binary {

    private String s;

    Binary(String s) {

        this.s = s;
    }

    long getDec() {
        int count = 0;
        long res = 0;
        int i;
        for (i = this.s.length() - 1; i >= 0; i--) {
            if (this.s.charAt(i) == '1') {
                res += Math.pow(2, count);
            } else {
                if (this.s.charAt(i) != '0') {
                    break;
                }
            }
            count++;
        }
        if (i == -1) {
            return res;
        } else {
            return -1;
        }
    }
    String getBin()
    {
        String res;
        StringBuilder r = new StringBuilder();
        r.append('1');
        Long n = Long.parseLong(s);
        long[] a = new long[1000];
        int i;
        for ( i = 0; i < n; i++) {
            if(Math.pow(2,i)<=n)
            {
                a[i] = (long)Math.pow(2,i);
            }
            else
            {
                break;
            }
        }
        long count = 0L;
        count += a[i-1];
        for (int k = i - 2 ; k>=0 ; k--) {
            if(count+a[k]<=n)
            {
                r.append('1');
                count+=a[k];
            }
            else
            {
                r.append('0');
            }
        }
        res = r.toString();
        return res;
        }
}

