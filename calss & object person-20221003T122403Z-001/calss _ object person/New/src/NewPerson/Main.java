/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPerson;

/**
 *
 * @author moatasem
 */
public class Main {

    public static void main(String[] args) {

        // Person هنا قمنا بإنشاء كائنات من الكلاس
        Person p1 = new Person();     // سيمثل محمد p1 الكائن
        Person p2 = new Person();     //  سيمثل روز p2 الكائن
        Person p3 = new Person();     // سيمثل أحمد p3 الكائن
        Person p4 = new Person();     // سيمثل ربيع p4 الكائن

        // p1 هنا قمنا بتحديد خصائص الكائن
        p1.name= "Mohamad";
        p1.gender = "Male";
        p1.job = "Programmer";
        p1.age = 21;
      //  p1.jawwal =111;

        // p2 هنا قمنا بتحديد خصائص الكائن
        p2.name = "Rose";
        p2.gender = "Female";
        p2.job  = "Secretary";
        p2.age  = 22;

        // p3 هنا قمنا بتحديد خصائص الكائن
        p3.name = "Ahmad";
        p3.gender = "Male";
        p3.job = "Doctor";
        p3.age = 34;

        // p4 هنا قمنا بتحديد خصائص الكائن
        p4.name = "Rabih";
        p4.gender = "Male";
        p4.job = "Engineer";
        p4.age = 27;

        // هنا قمنا بعرض خصائص كل كائن
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();

    }

}
