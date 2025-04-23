package Models;

public class Book {
    private String name;
    private int year;

    public Book(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public String setName(String name){
        return name;
    }
    public int setYear(int year){
        return year;
    }

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}

