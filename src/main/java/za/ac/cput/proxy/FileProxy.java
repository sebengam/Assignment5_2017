package za.ac.cput.proxy;

/**
 * Created by Tank on 4/2/2017.
 */
public class FileProxy implements File {

    private ReadFile realFile;
    private String fileName;
    private static FileProxy fileP=null;

    private FileProxy(String fileName){

        this.fileName = fileName;
        realFile =ReadFile.getRealFileInst(fileName);
    }
    public static FileProxy getFileProxy(String fileName){
        if(fileP==null)
            return new FileProxy(fileName);
        else
            return fileP;
    }

    @Override
    public String getFile() {
        return realFile.getFile();
    }
}
