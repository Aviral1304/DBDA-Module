import java.util.Scanner;
class GrandParent{
    String grandFatherName;
    String grandMotherName;

    public GrandParent(String grandFatherName, String grandMotherName) {
        this.grandFatherName = grandFatherName;
        this.grandMotherName = grandMotherName;
        System.out.println("Grand father name : "+this.grandFatherName+" and Grand mother name : "+this.grandMotherName);
    }
}
class Parent extends GrandParent{
    String fatherName;
    String motherName;

    public Parent(String grandFatherName, String grandMotherName, String fatherName, String motherName) {
        this(grandFatherName, grandMotherName);
        this.fatherName = fatherName;
        this.motherName = motherName;

        System.out.println("Father name : "+this.fatherName+" and Mother name : "+this.motherName);
    }
    public Parent(String grandFatherName, String grandMotherName){
        super(grandFatherName, grandMotherName);
    }

}
class Child extends Parent{
    public Child(String grandFatherName, String grandMotherName, String fatherName, String motherName) {
        super(grandFatherName, grandMotherName, fatherName, motherName);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Grand father name : ");
        String gp=sc.next();
        System.out.println("Enter Grand mother name : ");
        String gm=sc.next();
        System.out.println("Enter Father name : ");
        String fn=sc.next();
        System.out.println("Enter Mother name : ");
        String mn=sc.next();
        Child child=new Child(gp,gm,fn,mn);

    }
}
