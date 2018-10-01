
/*
 * PersonalInformation Class
 */


public class PersonalInformation {
    
    //Establish attributes
    private String name;
    private String address;
    private int age;
    private int phoneNumber;
    
    /**
     * The setName method accepts an argument for
     * the name field
     */
    public void setName(String n)   {
        name = n;
    }
    
    /**
     * The setAddress method accepts an argument for
     * the address field
     */
    public void setAddress(String ad)   {
        address = ad;
    }
    
    /**
     * The setAge method accepts an argument for
     * the age field
     */
    public void setAge(int a)   {
        age = a;
    }
    
    /**
     * The setPhoneNumber method accepts an argument for
     * the phoneNumber field
     */
    public void setPhoneNumber(int pn)  {
        phoneNumber = pn;
    }
    
    /**
     * The getName method returns the argument stored
     * in the name field
     */
    public String getName() {
        return name;
    }
    
    /**
     * The getAddress method returns the argument stored
     * in the address field
     */
    public String getAddress()  {
        return address;
    }
    
    /**
     * The getAge method returns the argument stored
     * in the age field
     */
    public int getAge() {
        return age;
    }
    
    /**
     * The getPhoneNumber method returns the argument stored
     * in the phoneNumber field
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }
    
}
