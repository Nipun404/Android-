package com.example.calculator;

public class Roman {
    private String num;
    private int res;
     int flag = 0;
    Roman(String num) {
        this.num = num;
        res = 0;
        int n = this.num.length();
        for (int k = 0; k < n; k++) {
            int v = value(this.num.charAt(k));
            if (k != 0 && value(this.num.charAt(k - 1)) < value(this.num.charAt(k))) {
                int temp = value(this.num.charAt(k)) - value(this.num.charAt(k - 1));
                res += temp;
            } else {
                if (k != 0 && k != (n - 1) && value(this.num.charAt(k)) < value(this.num.charAt(k + 1))) {
                    continue;
                } else {
                    if (k == 0 && k != (n - 1) && value(this.num.charAt(k)) < value(this.num.charAt(k + 1))) {
                        continue;
                    } else {
                        res += v;
                    }
                }
            }
        }
    }
    private int value(char v) {
        switch (v) {
            case 'V':
                return 5;
            case 'X':
                return 10;

            case 'I':
                return 1;
            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;
            default:
                flag = 1;
        }
        return 0;
    }
    int getVal()
    {
        return res;
    }
    }


