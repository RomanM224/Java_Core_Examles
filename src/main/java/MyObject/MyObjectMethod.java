package MyObject;

import java.util.HashSet;

public class MyObjectMethod {

    public static void main(String[] args) throws CloneNotSupportedException {
    //    cloneObject();
        
   //     getClassMethod();
        
   //     equalsExp();

    }
    
    public static void cloneObject() throws CloneNotSupportedException {
        MyObjectMethod object = new MyObjectMethod();
        MyObjectMethod.User user1 = object.new User(1, "Roman");
        MyObjectMethod.User user2 = user1.clone();
        System.out.println("clone() | User1: " + user1 + " |  User2: " + user2);
    }
    
    public static void getClassMethod() {
        MyObjectMethod object = new MyObjectMethod();
        MyObjectMethod.User user1 = object.new User(1, "Roman");
        System.out.println(".getClass() - " + user1.getClass());
        System.out.println(".getClass().getSimpleName() - " + user1.getClass().getSimpleName());
        System.out.println(".getClass().getSuperclass() - " + user1.getClass().getSuperclass());
        System.out.println(".getClass().getInterfaces() - " + user1.getClass().getInterfaces());
        System.out.println(user1.hashCode());
    }
    
    public static void equalsExp() {
        MyObjectMethod object = new MyObjectMethod();
        MyObjectMethod.User user1 = object.new User(1, "Roman");
        MyObjectMethod.User user2 = object.new User(2, "Roman");
        System.out.println(user1.equals(user2));
    }

    public class User implements Cloneable {

        public int id;
        public String name;

        @Override
        protected User clone() throws CloneNotSupportedException {
            return (User) super.clone();
        }

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User [id=" + id + ", name=" + name + "]";
        }
        
        @Override
        public boolean equals(Object user) {
            User myUser = (User) user; 
            if(this.name.equals(myUser.name)) {
                return true;
            }else {
                return false;
            }
            
        }
        

    }

}
