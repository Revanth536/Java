// The process of restricting member functions and member variales to one class 
// is Encapsulation
package Java;
public class Encapsulation {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else
            System.out.println("Invalid Age");
    }


        public static void main(String[] args) {
            Encapsulation s = new Encapsulation();
            s.setAge(20);
            System.out.print("Age of Student is :");
            System.out.println(s.getAge());
        }
    }
