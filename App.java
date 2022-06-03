
public class App {

  public static void main(String[] args) {
    
      Logger logger = new AsteriskLogger();
      logger.log("Hello");
      System.out.println(""); //break for clarity
      logger.error("Howdy");
      
      System.out.println(""); //break for clarity
    
      Logger logger2 = new SpacedLogger();
      logger2.log("Hello");
      System.out.println(""); //break for clarity
      logger2.error("Howdy");
}


}
