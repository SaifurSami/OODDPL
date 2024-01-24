public class App {
    public static void main(String[] args) throws Exception {
        WebPage webPage=new BasicWebPage();
        webPage=new AuthenticatedPage(new AuthorizedPage(webPage));
        webPage.display();
    }
}
