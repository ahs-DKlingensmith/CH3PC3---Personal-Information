/**
 * Dylan Klingensmith
 * Personal Information Demo
 * AP Computer Science 
 * 9/28/18
 */

public class PersonalInformationDemo {

    public static void main(String[] args) {
        
        //Establish PersonalInformation objects
        PersonalInformation person1 = new PersonalInformation();
        PersonalInformation person2 = new PersonalInformation();
        PersonalInformation person3 = new PersonalInformation();
        
        //Store information in person1 and print
        person1.setName("Eric Andre");
        person1.setAddress("229 Jefferson Street");
        person1.setAge(29);
        person1.setPhoneNumber(1234567890);
        
        System.out.println(person1.getName());
        System.out.println(person1.getAddress());
        System.out.println(person1.getAge());
        System.out.println(person1.getPhoneNumber() + "\n");
        
        //Store information in person2 and print
        person2.setName("Danny DeVito");
        person2.setAddress("834 Main Street");
        person2.setAge(59);
        person2.setPhoneNumber(1332433122);
        
        System.out.println(person2.getName());
        System.out.println(person2.getAddress());
        System.out.println(person2.getAge());
        System.out.println(person2.getPhoneNumber() + "\n");
        
        //Store informatin in person3 and print
        person3.setName("John Mulaney");
        person3.setAddress("429 5th Avenue");
        person3.setAge(40);
        person3.setPhoneNumber(2143456522);
        
        System.out.println(person3.getName());
        System.out.println(person3.getAddress());
        System.out.println(person3.getAge());
        System.out.println(person3.getPhoneNumber() + "\n");
        
        
        
        
        
    }

}
