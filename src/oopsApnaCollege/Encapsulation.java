package oopsApnaCollege;
//via encapsulation data hiding is possible in oops...using access modifiers..data which we want/don't want to show tp user...
public class Encapsulation {

}

class Account{//making classes is the only meaning of encapsulation..means data and members ko ek hi jagah capsule bna diya
private String password;
//To access private things...we use getters and setters


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {//also we can make this private if we want to set password automatically
        this.password = password;
    }
}


