import java.util.Scanner;
 public class atmm {
     public static void main(String[] args) {
         String userName, password;
         Scanner num = new Scanner(System.in);
         int right =3;
         int select;
         int many =30;



             System.out.print("kullanıcı adınızı giriniz:");
             userName= num.nextLine();
             System.out.print("Şifrenizi giriniz:");
             password= num.nextLine();


             if (userName.equals("patika") && password.equals("dev123")){
                 System.out.println("giriş başarılı!");
                 do {
                     System.out.println("1-withdraw money(para çekme \n" +
                             "2-money transfer(para yatırma)\n" +
                             "3-amount of money(bakiye)" +
                             "4-exit(çıkış)");
                     System.out.print("lütfen yapmak isteginiz işlemi seçiniz:");
                     select = num.nextInt();
                     int fiyat;
                     switch (select){
                         case 1:
                             System.out.println("para miktarı:");
                             fiyat = num.nextInt();
                             fiyat+=many;
                             break;
                         case 2:
                             System.out.print("para miktarı:");
                             fiyat = num.nextInt();
                             if (fiyat>many){
                                 System.out.println("yetersiz bakiye");

                             } else {
                                 many -=fiyat;
                                 break;
                             }break;
                         case 3:
                             System.out.println("nakiyeniz:"+many);
                             break;
                         default:
                             System.out.println("hatalı işlem");






                     }
                 }while (select!=3);
                 System.out.println("tekrar vgörüşmek üzere");

             }else{
                 right--;
                 System.out.println("hatalı kullanıcı veya şifre");
                 if (right==0){
                     System.out.println("hesabınız bloke olmuştur");
                 }else {
                     System.out.println("kalan hakkınız:"+right);
                 }
             }


         }

     }

