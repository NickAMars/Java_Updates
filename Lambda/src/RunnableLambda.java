public class RunnableLambda {
    public static void main(String[] args) {
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        // java 8 lambda ()->{}
        Runnable runnableLambda = ()->{
            System.out.println("Inside Runnable Lambda 2");
        };
        new Thread(runnableLambda).start();
        new Thread(()->{
            System.out.println("Without assigning 3");
        }).start();
    }
}
