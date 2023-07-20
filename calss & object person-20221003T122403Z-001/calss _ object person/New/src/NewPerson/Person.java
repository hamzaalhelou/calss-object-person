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


/* Variables - Types
     * - Java have three types of variables
     *      1) Local Variables
     *      2) Instance Variables
     *      3) Final/Static Variables
*/
public class Person {
    
    
    // كونستركتور افتراضي    Constructor 
     public Person() {
         
    }
    
    
    // هنا قمنا بتعريف 4 خصائص
     //Instance 
   public String name;
   public String gender;
   public String job;
   public int age;
   private int jawwal;
 
    // هنا قمنا بتعريف دالة تطبع محتوى كل خاصية عندما يتم استدعاءها
  public void printInfo() {
        System.out.println("Name: " +name);
        System.out.println("gender: " +gender);
        System.out.println("Job: " +job);
        System.out.println("Age: " +age);
        System.out.println();
    }
 
}

/*
نقاط مهمة حول الكونستركتور
كل كلاس يتم إنشاءه, يحتوي على كونستركتور واحد على الأقل. و حتى إن لم تقم بتعريف أي كونستركتور, سيقوم المترجم بإنشاء واحد إفتراضي عنك.
في كل مرة يتم إنشاء كائن جديد, يجب استدعاء كونستركتور حتى يتم إنشاء هذا الكائن.
القاعدة الأساسية عند تعريف كونستركتور هي أنه يجب أن يحمل نفس إسم الكلاس و يكون نوعه public.
في حال قمت بتعريف كونستركتور, لن يقوم المترجم بإنشاء واحد إفتراضي, أي لن يعود هناك كونستركتور إفتراضي.
يمكنك تعريف أكثر من كونستركتور. و يمكنك دائماً إنشاء كونستركتور فارغ, حتى تستخدمه إن كنت لا تريد إعطاء قيم أولية محددة للخصائص عند إنشاء كائن.
*/