package j24AccessModifier.farkliPackage;

import j24AccessModifier.C01_AccessModifier;
public class C03_AccessModifier{
    private  String privateteamLead="Hakan Aydın";
    String defaultName="Cebrail Bey";
    protected String protectedName="Dilek Hanım";
    public String publicName="Gamze Hanım";


    public static void main(String[] args) {
        C01_AccessModifier obj9=new C01_AccessModifier(23,63);//public conc

        System.out.println("obj9.publicYas = " + obj9.publicYas);//public variable
       // obj9.defaultYas//default variable package dışı erişilemz
//obj9.protectedMethod();//protected method package dışı call edilemez

    }




}
