package com.juaracoding;

public class Soal1 {
    public int x = 50;
    public String kata = "TestNG";
    public int[] angka = {2, 4, 6, 8};

    public boolean authenticate(String kata) {
        return kata.equals(this.kata);
    }
}
