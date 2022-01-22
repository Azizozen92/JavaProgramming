package day_30_CustomClasses;

public class FamilyObjects {
    public static void main(String[] args) {

        Family family1 = new Family();
        family1.setInfo("Aziz",30,"Lemli","blue",'M',185,true);
        System.out.println(family1);

        Family family2 = new Family();
        family2.setInfo("Elif",29,"babr","yellow",'F',130,true);
        System.out.println(family2);

        Family family3 = new Family();
        family3.setInfo("Safiye",3,"shishi","pink",'F',35,false);
        System.out.println(family3);

        Family family4 = new Family();
        family4.setInfo("Hamza",.4,"junior","blue",'M',15,false);
        System.out.println(family4);

        Family[]familyMembers={family1,family2,family3,family4};

        for (Family familyMember : familyMembers) {

            if(familyMember.hasJob == false){
                System.out.println(familyMember.names+" is chillen big time");
            }else{
                System.out.println(familyMember.names+" needs coffee ASAP");
            }
        }
    }
}
