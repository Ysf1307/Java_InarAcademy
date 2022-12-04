package chapters.chapter_12;

import java.util.ArrayList;
import java.io.File;

public class Q_28 {
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Usage: java Exercise_12_28 *");
            System.exit(1);
        }

        ArrayList<File> list = getFiles(args);
        for (int i = 0; i < list.size(); i++) {
            padFileName(list.get(i));
        }
    }

    public static void padFileName(File file) {
        StringBuilder nemName = new StringBuilder(file.getName());
        nemName.insert(8,'0');
        file.renameTo(new File(nemName.toString()));
    }

    public static ArrayList<File> getFiles(String[] args) {
        ArrayList<File> list = new ArrayList<>();
        for (String e : args){
            File f = new File(e);
            if (f.isFile() && f.getName().matches("Exercise\\d_\\d.*")){
                list.add(f);
            }
        }
        return list;
    }

}
