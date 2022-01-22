package day_30_CustomClasses;

public class CatObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setInfo("Minnos","tuxedo",4,true,'F',4);
        System.out.println(cat1);
        System.out.println(cat1.breed+" is the most playful breed");

        Cat cat2 = new Cat();
        cat2.setInfo("Bruce","Turkish",5,true,'M',5);
        System.out.println(cat2);
        System.out.println(cat2.name+" is a little turd");

        Cat cat3 = new Cat();
        cat3.setInfo("Garfield","Tabby",10,false,'M',20);
        System.out.println(cat3);
        System.out.println(cat3.age+" years is old for a cat");

        Cat[]allCats={cat1,cat2,cat3};
        for (Cat eachCat : allCats) {
            if(eachCat.isNeutered == false){
                System.out.println("Get "+eachCat.name+" out of my house");
            }else{
                System.out.println("I guess "+eachCat.name+" can stay here");
            }

        }
    }
}
