package za.ac.cput.ChainOfReposibility;

/**
 * Created by Tank on 4/2/2017.
 */
public class GradeCHandler extends GradeHandler {
    @Override
    public String handleRequest(int request) {
        if (request > 65 & request < 70) {
            return "C";
        } else {
            return successor.handleRequest(request);
        }
    }
}
