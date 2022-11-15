package P04_okulYonetimi;



    public abstract class Person {
        String ad;
        String soyad;
        String kimlikNo;
        int yas;
        public abstract void ekleme();
        public abstract void arama();
        public abstract void listeleme();
        public abstract void silme();

        public Person(String ad, String soyad, String kimlikNo, int yas) {
            this.ad = ad;
            this.soyad = soyad;
            this.kimlikNo = kimlikNo;
            this.yas = yas;
        }
    }



















