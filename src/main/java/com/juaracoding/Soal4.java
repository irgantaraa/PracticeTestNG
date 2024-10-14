package com.juaracoding;

public class Soal4 {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("jumlah harus lebih dari 0");
        } else {
            return a / b;
        }
    }
        public int inputnilai ( int b){
            if (b == 0) {
                throw new IllegalArgumentException("jumlah harus lebih dari 0");
            } else {
                return b;
            }
        }
    }


