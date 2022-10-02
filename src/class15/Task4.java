package class15;

public class Task4 {
    /*
    Create a method that will say Hello in
different language based on the country
that will passed when method is executed
     */
    void sayHello(String country){

        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "Pakistan":
                System.out.println("AOA");
                break;
            case "Japan":
                System.out.println("Nihau");
                break;
            default:
                System.out.println("Country not supported");
        }


    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.sayHello("USA");
        task4.sayHello("Turkiye");
    }

}
