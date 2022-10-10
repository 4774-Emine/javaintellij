package j13_Break_Continue;

public class C5_OCA_type {
    public static void main(String[] args) {

  int count=0;
  ROW_LOOP:for(int row=1; row<=3;row++)//dış loop
      //System.out.println();iç dış loop arası komut girerse looplar arası ilişki kopar
      for(int col=1; col<=2;col++){//iç loop
          if(row*col%2==0) continue ROW_LOOP;//row*cal çift ise bekleme yapma devam et count artma
          count++;
      }
        System.out.println(count);














    }
}
