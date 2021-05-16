package za.ac.cput;

import.java.util.*;

public class Group{
        String name;
        String studentId;

        Set set = new HashSet();
        List list = new ArrayList();
        Map map = new HashMap();

    public Group() {
    }

    public Group(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void map(Groups gr){
        map.put(gr.name, gr.studentId);
    }

    public void deleteMap(String t){
        map.remove(t);
        String element = (String)map.get(t);
        System.out.println(element);
    }

    public void displayMap(String t){
        String text =(String)map.get(t);
        System.out.println(t);
    }


    public void set(String name){
        set.add(name);
    }

    public void removeSet(){
        set.remove(0);
        System.out.println(set);
    }

    public void displaySet(){
        System.out.println(set);
    }

    public void list(int x) {
        list.add(x);
        System.out.println(x);
    }

    public void removeList(){
        list.remove(0);
    }
    public void displayList(){
        System.out.println(list);
    }
}