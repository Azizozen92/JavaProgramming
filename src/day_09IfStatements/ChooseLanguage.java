package day_09IfStatements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int language = 5;
        if (language==1){
            System.out.println("Hello, thanks for your call");
        }else if (language==2){
            System.out.println("Hola, gracias para llamar");
        }else if (language==3){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }else if(language==4){
            System.out.println("Privet, spasibo za vash zvonok");
        }else{
            System.out.println("Merci, pour votre appel");
        }
    }
}
