package �nterface;

public class arayuz implements kitap {
	 
    //aray�z�n �zellikleri uyguland�. 
    @Override
    public void goster() {
        System.out.println("kitap ad�: "+ kitapAd�);
        System.out.println("sayfa say�s�: "+ syf);
    }
}