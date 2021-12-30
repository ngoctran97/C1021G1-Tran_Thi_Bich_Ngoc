package ss22_Structural_Design_Pattern.Practice.FileWorker.client;

public class Client {
    public void share(String message){
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }
    public static void main(String[] args) {
        Client client = new Client();
        client.share("This is a post");
    }
}
