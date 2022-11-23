package OkulYonetimi;

public class TryCatch {


    public void illegalArgumentException(int a){
        while (true){
            try {
                if (a<7){
                    throw new IllegalArgumentException();
                }
            }catch(IllegalArgumentException e){
                System.out.println("Maalesef 7 yaşından Küçük Öğrencileri Kayıt Alamayız");
                break;

            }
        }


    }
}

