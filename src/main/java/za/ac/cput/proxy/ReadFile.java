package za.ac.cput.proxy;

/**
 * Created by Tank on 4/2/2017.
 */
public class ReadFile implements File{
    private String fileName;
    private static ReadFile rFile=null;

    private ReadFile(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    public static ReadFile getRealFileInst(String fileName ) {
        if (rFile == null)
            return rFile = new ReadFile(fileName);
        else
            return rFile;
    }

    @Override
    public String getFile() {
        return fileName;
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
    
}
