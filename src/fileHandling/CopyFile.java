package fileHandling;

import java.io.*;

public class CopyFile {
    public static FileInputStream fis=null;
    public static FileOutputStream fout=null;
    //copy a file(pdf)and create a different file in same location
    public static void main(String[] args) {
File file=new File("H:\\testing tools videos\\Mukesh selenium\\File Handling Naveen\\sample.pdf");
File opfile=new File("H:\\testing tools videos\\Mukesh selenium\\File Handling Naveen\\samplecopy.pdf");


        try {
     fis=new FileInputStream(file);

     fout = new FileOutputStream(opfile);
 }
 catch(FileNotFoundException e){
            e.printStackTrace();
 }
 try{
     System.out.println(fis.available());
 }
 catch(IOException e){
e.printStackTrace();
 }
int i=0;
try{
    while((i=fis.read())!=-1){
        fout.write(i);
    }
}
    catch(IOException e){
e.printStackTrace();
    }
finally {
        if (fis!=null){
try {
    fout.close();
}
            catch(IOException e){
    e.printStackTrace();
            }
        }
    if (fout!=null){
        try {
            fout.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    }
    }
}
