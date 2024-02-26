

// Ali Eren KÖSE 27/02/2024 01:54

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;          //yanlış oturum açma hakki
        int balance = 1500;      // bakiye belirleme
        int select;             // yapmak isenen işlem için veri tanıt

        while (right > 0) {         // giriş hakki 0 olana kadar döndür
            System.out.print("Kullanıcı Adınız : ");        //ID iste
            userName = input.nextLine();                    //ID kaydet
            System.out.print("Parolanız : ");               //şifre iste
            password = input.nextLine();                    // şifre kaydet
            if (userName.equals("patika") && password.equals("dev123")) {       // id ,pass doğru ise sisteme giriş yap
                System.out.println("Sisteme giriş başarılı : ");
                System.out.println("----------------------------------------------- ");
                do {
                    System.out.println("1- Para Yatırma\n" +    //işlemleri sun ve tercihini belirle
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Çıkış Yap");

                    //tercih edilen işlemi kaydet
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    System.out.println("----------------------------------------------- ");


                    //istenen işleme göre bakiyeyi kontrol et , uygunsa işlemi yap ve çıkış demediyse döngüyü devam ettir
                    if (select == 1) {
                        System.out.println("Yatıracağınız para miktarı : ");
                        System.out.println("----------------------------------------------- ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Paranız başarıyla yatırılmıştır. Mevcut Bakiyeniz :" + balance + "TL");
                        System.out.println("----------------------------------------------- ");
                    } else if (select == 2) {
                        System.out.println("Çekmek istediğiniz para miktarı");
                        System.out.println("----------------------------------------------- ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye Yetersiz .");
                            System.out.println("----------------------------------------------- ");
                        } else {
                            balance -= price;
                            System.out.println(price + " TL çektiniz kalan bakiye : " + balance + "TL");
                            System.out.println("----------------------------------------------- ");
                        }
                    } else if (select == 3) {

                        System.out.println("Bakiyeniz : " + balance + " TL");
                        System.out.println("----------------------------------------------- ");
                    }


                } while (select != 4);
                System.out.println("İşlem talebiniz yoktur. İyi günler");
                break;  //eğer çıkış yap seçeneğini seçerse döngüyü boz ve bitir
            } else {
                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı . Tekrar deneyiniz"); // yanlış id ,pass olursa başa dön

                if (right == 0) {
                    System.out.println("Hesabınız Bloke olmuştur .");
                } else {
                    System.out.println("Kalan hakkınız " + right);
                }
            }
        }
    }
}