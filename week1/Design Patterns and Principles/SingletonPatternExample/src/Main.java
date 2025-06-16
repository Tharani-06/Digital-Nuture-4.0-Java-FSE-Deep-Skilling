public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is the First log message");
        logger2.log("This is the Second log message");

        if(logger1 == logger2){
            System.out.println("Both logger instances are the same singleton works");
        }
        else {
            System.out.println("Logger instances are different singleton failed");
        }
    }
}
