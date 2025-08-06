class Animal {

    String name;
    int age;

    Animal(String n,int a){
        name = n;
        age = a;
    }
    
}

public class StringBufferExample {
    public static void main(String[] args) {
        Animal cat = new Animal("puppy", 10);
        Animal dog = new Animal("puppy", 10);
        System.out.println("object checking == : "+(cat==dog));
        System.out.println("object checking .equal : "+cat.equals(dog));
        int a = 10;
        int b = 10;

        String name = "sakib";
        String nameA= "sakib";

            String str = new String("sakib");

            System.out.println("interview"+name==nameA);
            System.out.println(nameA==str);














        String nameB = "SHaikh";

        StringBuilder sb = new StringBuilder("Sakib");
        StringBuilder sbA = new StringBuilder("Sakib");
        StringBuilder sbB = sb;
        StringBuffer sbf = new StringBuffer("Sakib");


        System.out.println("String Builder checking .equals : "+ (sb.equals(sbA)));

        System.out.println("String Builder checking .equals : "+ (sb.equals(sbB)));
        System.out.println(sbB.equals(sbf));
        if(a==b)
            System.out.println(true);
        
        System.out.println(name==nameA);
        System.out.println(name==nameB);
    }
}
