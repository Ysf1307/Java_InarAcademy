package chapters.chapter_12;

import java.io.File;
import java.util.ArrayList;

public class Q_29 {
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Usage: Exercise_12_29");
            System.exit(1);
        }

        ArrayList<File> list = getFiles(args);
        System.out.println(list.toString());
        for (int i = 0; i < list.size(); i++) {
            padFileName(list.get(i));
        }
    }

    public static void padFileName(File file){
        StringBuilder newName = new StringBuilder(file.getName());
        newName.insert(10,'0');
        file.renameTo(new File(newName.toString()));
    }

    public static ArrayList<File> getFiles(String[] args){
        ArrayList<File> list = new ArrayList<>();
        for (String e:args) {
            File f = new File(e);
            if (f.isFile() && f.getName().matches("Exercise\\d_\\d.*")){
                list.add(f);
            }
        }
        return list;
    }
}
