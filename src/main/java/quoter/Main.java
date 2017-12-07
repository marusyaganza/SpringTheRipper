package quoter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //Hate while(true)((:
        int x=0;
        while (x<100) {
            Thread.sleep(100);
            context.getBean(Quoter.class).sayQuote();
            x++;
        }
    }

}
