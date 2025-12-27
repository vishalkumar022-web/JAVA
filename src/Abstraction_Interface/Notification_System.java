package Abstraction_Interface;

public interface Notification_System {
    void notify_User(String message);
}

class Email_Notification implements Notification_System {

    String Email;
    String Recipiend;



    void setEmail(String Email) {

        // Reset flag every time
        int flag = 0;

        // Check for '@'
        for (int i = 0; i < Email.length(); i++) {
            if (Email.charAt(i) == '@') {
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.println("Invalid Email is Given ");

        } else {
            this.Email = Email;
        }
    }

    Email_Notification(String Email) {
        setEmail(Email);
        this.Recipiend = this.Email; // recipient set AFTER validation
    }

    @Override
    public void notify_User(String message) {


        System.out.println(message + Recipiend);
    }
}


class SMS_Nofication implements Notification_System {

    String Phone_no;
    String Recipiend;

    int flag = 0;

    void setPhone_No(String Phone_No) {

        // EXACTLY 10 digits required
        if (Phone_No.length() != 10) {
            System.out.println("Invalid Phone Number ");

        } else {
            this.Phone_no = Phone_No;
        }
    }

    SMS_Nofication(String Phone_No) {
        setPhone_No(Phone_No);
        this.Recipiend = this.Phone_no;  // Set AFTER validation
    }

    @Override
    public void notify_User(String message) {


        System.out.println(message + Recipiend);
    }

    public static void main(String[] args) {

        Email_Notification obj = new Email_Notification("rajsingh@37040gamil.com");
        SMS_Nofication obj1 = new SMS_Nofication("8969378582");

        obj.notify_User("This message is sended through Email and Reciver is ");
        obj1.notify_User("This message is sended through SMS and Reciver is ");

    }
}
