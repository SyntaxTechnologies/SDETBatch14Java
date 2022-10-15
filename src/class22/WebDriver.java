package class22;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the Browser");
    }
    public void test(){
        System.out.println("Perform the testing");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class Chrome extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the Google Chrome");
    }
    public void test(){
        System.out.println("Perform the testing on Google Chrome");
    }
    public void closeBrowser(){
        System.out.println("Closing the Google Chrome");
    }
}

class FireFox extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the FireFox");
    }
    public void test(){
        System.out.println("Perform the testing on FireFox");
    }
    public void closeBrowser(){
        System.out.println("Closing the FireFox");
    }
}

class Safari extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the Safa");
    }
    public void test(){
        System.out.println("Perform the testing on Safa");
    }
    public void closeBrowser(){
        System.out.println("Closing the Safa");
    }
}