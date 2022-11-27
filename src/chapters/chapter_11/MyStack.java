package chapters.chapter_11;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    public MyStack(){

    }

    public int getSize(){
        return super.size();
    }
    public Object peek(){
        return get(getSize() - 1);
    }
    public Object pop(){
        Object o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }
    public Object push(Object o){
        add(o);
        return o;
    }
    public int search(Object o){
        return indexOf(o);
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        while (getSize() > 0){
            stringBuilder.append(String.valueOf(pop()));
        }
        return "Stack: " + stringBuilder.toString();
    }
}
