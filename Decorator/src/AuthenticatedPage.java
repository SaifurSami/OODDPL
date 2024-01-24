public class AuthenticatedPage implements WebPage {
    WebPage webPage;
    AuthenticatedPage(WebPage webPage){
        this.webPage=webPage;
    }
    public void display(){
        webPage.display();
        System.out.print(" with authentication");
    }
}
