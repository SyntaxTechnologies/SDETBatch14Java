package class15;

public class Task5 {
    /*   Create a method createEmail(). Based on values of users first name,
    lastName and email   type, your method should return complete email Address.
    Example: createEmail(John,   Snow,gmail)-->johnsnow@gmail.com*/

    String createEmail(String firstName,String lastName,String emailType){

        return (firstName+lastName+"@"+emailType+".com").toLowerCase();
    }

    public static void main(String[] args) {
        Task5 task5=new Task5();
        String fullEmail=task5.createEmail("John","Snow","gmail");
        System.out.println(fullEmail);
        System.out.println(task5.createEmail("Niazi","Zamir","outlook"));

    }
}
