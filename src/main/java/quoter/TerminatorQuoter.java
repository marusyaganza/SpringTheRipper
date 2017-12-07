package quoter;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {
private String message;
@InjectRandomInt(min = 2, max = 7)
private int repeat;
    public void setMessage(String message) {
        System.out.println("phase1");
        this.message = message;
    }
    @PostConstruct
    public void init() {
        System.out.println("phase2");
        System.out.println(repeat);
    }
    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("phase3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }

    }
}
