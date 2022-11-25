package ýnterface;

public class arayuz implements kitap {
	 
    //arayüzün özellikleri uygulandý. 
    @Override
    public void goster() {
        System.out.println("kitap adý: "+ kitapAdý);
        System.out.println("sayfa sayýsý: "+ syf);
    }
}