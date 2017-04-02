package za.ac.cput.ChainOfReposibility;

/**
 * Created by Tank on 4/2/2017.
 */
public class GradeBHandler extends GradeHandler {
    @Override
    public String handleRequest(int request) {
        if(request > 70 & request < 75){
            return "B";
        }else{
            return successor.handleRequest(request);
        }
    }

}
