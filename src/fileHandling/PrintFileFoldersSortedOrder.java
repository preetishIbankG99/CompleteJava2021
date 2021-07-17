package fileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFileFoldersSortedOrder {
    public static void main(String[] args) {
String path="C:\\Users\\GUDU\\Downloads";
        File file=new File(path);

File filedownloaddir[]=file.listFiles();
        Arrays.sort(filedownloaddir);
        for (File e:filedownloaddir){
            if(e.isFile()){
                System.out.println("File:: "+e.getName()+" "+e.getAbsolutePath());
            }
        else if (e.isDirectory()){
                System.out.println("Directory:: "+e.getName()+" "+e.getAbsolutePath());
            }
        else {
                System.out.println(" Unknown:: "+e.getName()+" "+e.getAbsolutePath());
            }
        }
    }
}
