package codewars.kata6;

import java.util.ArrayList;
import java.util.List;

public class Dinglemouse {

    public static void main(String[] args) {
        Dinglemouse p1 = new Dinglemouse()
                .setName("Bob")
                .setAge(27)
                .setSex('M');
        System.out.println(p1.hello());

        Dinglemouse p2 = new Dinglemouse()
                .setName("Bob")
                .setAge(27)
                .setSex('M')
                .setName("Batman");
        System.out.println(p2.hello());

        Dinglemouse p3 = new Dinglemouse()
                .setName("Alice");
        System.out.println(p3.hello());

        Dinglemouse p4 = new Dinglemouse()
                .setAge(30)
                .setSex('F');
        System.out.println(p4.hello());

        Dinglemouse p5 = new Dinglemouse();
        System.out.println(p5.hello());
    }

    String name;
    int age;
    char sex;
    private List<String> list = new ArrayList<>();
    final String n = "name";
    final String a = "age";
    final String s = "sex";

    public Dinglemouse() {
    }

    public Dinglemouse setAge(int age) {
        this.age = age;
        if(!list.contains(a)){
            list.add(a);
        }
        return this;
    }

    public Dinglemouse setSex(char sex) {
        this.sex = sex;
        if(!list.contains(s)){
            list.add(s);
        }
        return this;
    }

    public Dinglemouse setName(String name) {
        this.name = name;
        if(!list.contains(n)){
            list.add(n);
        }
        return this;
    }

    public String hello() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello.");
        for(String info : list){
            if(info.equals(a)){
                builder.append(" I am " + age + ".");
            }
            if(info.equals(s)){
                String tmp = sex=='M'? "male" : "female";
                builder.append(" I am " + tmp + ".");
            }
            if(info.equals(n)){
                builder.append(" My name is " + name + ".");
            }
        }
        return builder.toString();
    }
}
