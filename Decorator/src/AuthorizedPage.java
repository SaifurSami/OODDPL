public class AuthorizedPage implements WebPage {
       WebPage webPage;
       AuthorizedPage(WebPage webPage){
          this.webPage=webPage;
       }
       public void display(){
             webPage.display();
             System.out.print(" with authorization ");
       }
}
