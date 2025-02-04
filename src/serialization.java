import java.io.*;
import java.util.*;

class Person implements Serializable{
    private String name;
    private int age;
    transient private Long num;//no chage in that varibles -> it default value in the thing -> DIFFERENCE IN OUTPUT WHILE OBJECT BACK

    public Person(String name,int age,Long num){
        this.name = name;
        this.age = age;
        this.num = num;
    }

    public void print(){
        System.out.print("name is : " + name + " age is : " + age + " adhaar is : " + num);
    }
}
public class serialization {
    public static void main(String[] args) throws Exception{
        Person p1 = new Person("sasi",21,123456789L);
        p1.print();
        //serialization
        FileOutputStream fo = new FileOutputStream("person.info");
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(p1);
        System.out.println();

        //deserialization
        FileInputStream fi = new FileInputStream("person.info");
        ObjectInputStream ois = new ObjectInputStream(fi);
        Person p2 = (Person) ois.readObject();
        p2.print();
    }
}

//SERIALIZATION MEANS WRITING A STATE OBJECT INTO A BYTE STREAM
//writeObject() -> to convert text to byte stream
//if we want to serialize it must extends serializable from io package
//
