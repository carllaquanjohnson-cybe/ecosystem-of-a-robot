public interface Robot {
    void start();
    void stop();
    String status();
}
// An interface is a promise. Any class that says implements 
// Robot must have start(), stop(), and status(). 
// It tells us what a robot can do, not how.