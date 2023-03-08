package week1;

public class String1 {

    public static void main(String[] args) {
        String name = "    Michael Lam";
        String trimedName = name.trim();
        String demoNumber = "15";

        int a = name.indexOf('a');
        String beake = "----------";
        String needToReplace = "Lam";
        String replaceWith = "Faat";

        System.out.println(name);
        System.out.println(beake);
        System.out.println(name.charAt(a));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf("Mic"));
        System.out.println(name.indexOf('a'));
        System.out.println(beake);
        System.out.println(name.trim());
        System.out.println(trimedName.replace(needToReplace, replaceWith));
        System.out.println(trimedName.replace('a', '@'));
        System.out.println(beake);
        System.out.println(name.length());
        System.out.println(name.substring(4, 15));
        System.out.println(beake);
        System.out.println(trimedName.toUpperCase());
        System.out.println(trimedName.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(beake);
        System.out.println(trimedName.substring(2, 3));
        System.out.println(trimedName.substring(0, 2).toUpperCase().toLowerCase());
        System.out.println(beake);
        System.out.println(name.concat(" is Me!").toUpperCase());
        String newString = name.toLowerCase().concat(" is Me!!");
        System.out.println(newString);
        System.out.println(beake);

        String firistName = "John";

        if ("John".equals(firistName.trim())) {
            System.out.println("Bingo!");
        } else {
            System.out.println("Not match");
        }

        System.out.println(beake);

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        System.out.println(beake);

        String str = "brown";
        String myString = "The " + "quick " + str + " fox..."; // expensive

        System.out.println(myString);

        System.out.println("The quick brown fox..." == myString); // prints false
        System.out.println("The quick brown fox...".equals(myString)); // prints true

        System.out.println(beake);

        Integer i1 = new Integer(10);// Integer i1 = Integer.valueOf(1)
        Integer i2 = new Integer(10);
        System.out.println(++i1);

        if (i1 == i2) {
            System.out.println("Match");
        } else {
            System.out.println("Differ");
        }

        if (i1.compareTo(i2) == 0) {
            System.out.println("They are equal");
        } else {
            System.out.println("There are not same");
        }

        Integer i3 = 130;
        Integer i4 = 150;

        System.out.println(i3.compareTo(i4));
        System.out.println(beake); 


        Integer integer = 10000;

        Byte byte2 = new Byte((byte)10);


        Float d2 =  new Float ((float)10.12);
        Float f3 = Float.valueOf((float)10.13);
        Character abc = new Character (char('a'));


        
        System.out.println(f3);


    }

}
