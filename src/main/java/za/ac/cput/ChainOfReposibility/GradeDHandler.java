package za.ac.cput.ChainOfReposibility;

/**
 * Created by Tank on 4/2/2017.
 */
public class GradeDHandler extends GradeHandler{

    @Override
    public String handleRequest(int request) {
        if(request > 60 & request < 65){
            return "D";
        }else{
            return successor.handleRequest(request);
        }
    }

}
