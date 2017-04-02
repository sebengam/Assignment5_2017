package za.ac.cput.ChainOfReposibility;

/**
 * Created by Tank on 4/2/2017.
 */
public abstract class GradeHandler {
    GradeHandler successor;
    public void setSuccessor(GradeHandler successor) {
        this.successor = successor;
    }
    public abstract String handleRequest(int request);
}
