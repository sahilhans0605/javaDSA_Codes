package oopsClassThree;

public class Encapsulation {

    public static void main(String[] args) {
        Secret secret = new Secret();
        secret.setData(4);
        Amount amount = new Amount();
        amount.setAmount(12000, 1234);
        System.out.println(amount.getAmount());
    }

}

class Secret {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        if (data > 100) {
            this.data = data;
        } else {
            System.out.println("You are not allowed to change this data");
        }
    }
}

class Amount {
    int amount;
    private int otp = 1234;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount, int otp) {
        if (this.otp == otp) {
            this.amount = amount;

        } else {
            System.out.println("Invalid otp");
        }
    }

}
