package j33_Interface.C02_Set;

import java.util.HashSet;
import java.util.List;

public class Task06 {

/*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */
public static void main(String[] args) {
  HashSet<Integer> hsi=new HashSet<>(List.of(4,2,3,1,7));

    System.out.println("totalCount(hsi) = " + totalCount(hsi));
}
  private static int totalCount( HashSet<Integer> hsi  ) {
int count=hsi.size();

  return count;
  }
}
