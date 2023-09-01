package com.activity.activity;

public class SwitchTanpaYield {
    public static void main(String[] args) {
        var nilai = "A";
        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "Wow Anda Lulus dengan baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin Anda Salah Jurusan";
        }
    }
}
