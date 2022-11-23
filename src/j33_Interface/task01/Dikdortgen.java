package j33_Interface.task01;

public class Dikdortgen implements Sekil {
    @Override
    public int cevre(int... boyut) {
        if (boyut.length == 1) {//varargsa girilen parametre 1 tane ise kare alanı hesapla
            return (boyut[0] + boyut[1]) * 4;
        } else//varargsa girilen parametre 1 tane değilse dikdörtgen çevre hesapla
            return (boyut[0] + boyut[1]) * 2;

    }

    @Override
    public int alan(int... boyut) {
        if (boyut.length == 1) {//varargsa girilen parametre 1 tane ise kare alan hesapla
            return (boyut[0]*boyut[0]);
        }else //varargsa girilen parametre 1 tane değilse dikdörtgen alanı hesapla
            return (boyut[0]*boyut[1]);
    }
}


