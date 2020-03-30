package cz.czechitas.webapp;

import javax.validation.constraints.Pattern;

public class ZenaForm {
    @Pattern(regexp = "[a-zA-Zá-žÁ-Ž]+", message = "Jméno je povinné, používejte pouze písmena české abecedy")
    private String jmeno;

    private int dopravniProstredek = 0;
    private int barvaOci = 0;
    private int vyska = 0;
    private int velikostBot = 0;
    private int krecek = 0;
    private int lego = 0;
    private int hory = 0;
    private int java = 0;
    private int srdce = 0;
    private int sranda = 0;

    public void setKrecek(int krecek) {
        this.krecek = krecek;
    }

    public void setLego(int lego) {
        this.lego = lego;
    }

    public void setHory(int hory) {
        this.hory = hory;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public void setSrdce(int srdce) {
        this.srdce = srdce;
    }

    public void setSranda(int sranda) {
        this.sranda = sranda;
    }

    public int getKrecek() {
        return krecek;
    }

    public int getLego() {
        return lego;
    }

    public int getHory() {
        return hory;
    }

    public int getJava() {
        return java;
    }

    public int getSrdce() {
        return srdce;
    }

    public int getSranda() {
        return sranda;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public void setVelikostBot(int velikostBot) {
        this.velikostBot = velikostBot;
    }

    public int getVelikostBot() {
        return velikostBot;
    }

    public int getVyska() {
        return vyska;
    }

    public void setBarvaOci(int barvaOci) {
        this.barvaOci = barvaOci;
    }

    public int getBarvaOci() {
        return barvaOci;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getDopravniProstredek() {
        return dopravniProstredek;
    }

    public void setDopravniProstredek(int dopravniProstredek) {
        this.dopravniProstredek = dopravniProstredek;
    }
}



//    private int[]  velbloudi;
//
//    public int[] getVelbloudi() {
//        return velbloudi;
//    }
//
//    public void setVelbloudi(int[] velbloudi) {
//        this.velbloudi = velbloudi;
//    }
//
//Hlavni controller:

//for (int item : vstup.getVelbloudi()) {
//        //seznamOdpovedi.add(item);
//        System.out.println(item);
//        }