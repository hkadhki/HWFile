import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        GameProgress save1 = new GameProgress(30, 1,3,200);
        GameProgress save2 = new GameProgress(50, 7,8,7000);
        GameProgress save3 = new GameProgress(60, 3,4,2000);
        File file3 = new File("C://Gameees//savegames//save3.dat");
        File file2 = new File("C://Gameees//savegames//save2.dat");
        File file1 = new File("C://Gameees//savegames//save1.dat");


        try(FileOutputStream fos = new FileOutputStream(file1)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(save1);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try(FileOutputStream fos = new FileOutputStream(file2)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(save2);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try(FileOutputStream fos = new FileOutputStream(file3)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(save3);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        String[] list = new String[]{"save1.dat","save2.dat","save3.dat"};
        zipFiles("C://Gameees//savegames//zip.zip", list);

        file1.delete();
        file2.delete();
        file3.delete();
    }

    static void zipFiles(String zip ,String[] saves){
        System.out.println(zip);
        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(zip))){
            for(int i = 0; i < saves.length; i++){
                FileInputStream fis = new FileInputStream("C://Gameees//savegames//" + saves[i]);
                ZipEntry entry1 = new ZipEntry(saves[i]);
                zout.putNextEntry(entry1);

                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                zout.write(buffer);
                zout.closeEntry();
                fis.close();
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}