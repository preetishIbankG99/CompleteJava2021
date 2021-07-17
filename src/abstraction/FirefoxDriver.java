package abstraction;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get(String url){
        System.out.println("open webpage");
    }
    @Override
    public String getTitle(){
        System.out.println("Webpage title");
    return "title";
    }
}
