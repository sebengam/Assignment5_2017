package za.ac.cput.ChainOfReposibility;

/**
 * Created by Tank on 4/2/2017.
 */
public class GradeAHandler extends GradeHandler {
    @Override
    public String handleRequest(int request) {
        if(request > 75){
            return "A";
        }else{
            return successor.handleRequest(request);
        }
    }
}
