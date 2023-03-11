import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File scr = new File("C://Gameees", "scr");
        File res = new File("C://Gameees", "res");
        File saveGames = new File("C://Gameees", "savegames");
        File temp = new File("C://Gameees", "temp");
        File main = new File("C://Gameees//scr//main");
        File test = new File("C://Gameees//scr//test");
        File mainJava = new File("C://Gameees//scr//main","Main.java");
        File utilsJava = new File("C://Gameees//scr//main","Utils.java");
        File drawables = new File("C://Gameees//res", "drawables");
        File vectors = new File("C://Gameees//res", "vectors");
        File icons = new File("C://Gameees//res", "icons");
        File tempText = new File("C://Gameees//temp", "temp.txt");
        StringBuffer text = new StringBuffer() ;



        if (scr.mkdir()){
            text.append("папка scr создана");
        }
        if (res.mkdir()){
            text.append("\n");
            text.append("папка res создана");
        }
        if (saveGames.mkdir()){
            text.append("\n");
            text.append("папка savegames создана");
        }
        if (temp.mkdir()){
            text.append("\n");
            text.append("папка temp создана");
        }
        if (main.mkdir()){
            text.append("\n");
            text.append("папка main создана");
        }
        if (test.mkdir()){
            text.append("\n");
            text.append("папка test создана");
        }
        try {
            if (mainJava.createNewFile()) {
                text.append("\n");
                text.append("файл main.java создан");
            }
        }catch (IOException ex){
            text.append("\n");
            text.append(ex.getMessage());
        }

        try {
            if (utilsJava.createNewFile()){
                text.append("\n");
                text.append("файл Utils.java создан");
            }
        }catch (IOException ex){
            text.append("\n");
            text.append(ex.getMessage());
        }

        if (drawables.mkdir()){
            text.append("\n");
            text.append("папка drawables создана");
        }
        if (vectors.mkdir()){
            text.append("\n");
            text.append("папка vectors создана");
        }
        if (icons.mkdir()){
            text.append("\n");
            text.append("папка icons создана");
        }

        try {
            if (tempText.createNewFile()){
                text.append("\n");
                text.append("файл temp.txt создан");
            }
        }catch (IOException ex){
            text.append("\n");
            text.append(ex.getMessage());
        }
        System.out.println(text);

        try(FileWriter writer = new FileWriter("C://Gameees//temp//temp.txt")) {
            writer.write(text.toString());
            writer.flush();
        }catch (IOException e){
            e.getMessage();
        }


    }
}