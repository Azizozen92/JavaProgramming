package Unit4PracticeTest;

public class A {

    int count;

    public void m(){
        count++;
    }
    public void m(int n){

        count*=n;
    }

    public static void main(String[] args) {
        A obj= new A();//0 just creating the object
        obj.m(2);//0 2*0
        obj.m();//1 count plus 1
        obj.count-= 5;//-4 1-5
        obj.m(7);//-28 -4*7

        System.out.println(obj.count);

}
}
