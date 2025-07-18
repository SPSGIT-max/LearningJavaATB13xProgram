package ex_06_Java_String;

public class Lab54_String_Functions {
    public static void main(String[] args) {
        //charAt(int index)
        // return the character at specified index.
        String s1="Hello";
        char ch=s1.charAt(1);
        System.out.println("charAt(int index), return the character at specified index ");
        System.out.println(ch);

        //concatenate the specified string to the end of this string.
        String s2=s1.concat(" All");
        System.out.println("concat, concatenate the specified string to the end of this string");
        System.out.println(s2);

        //returns true, if the string contains the specified sequence.
        Boolean s3=s2.contains("All");
        System.out.println("Contains, returns true, if the string contains the specified sequence");
        System.out.println(s3);



        //checks if the string ends with the specified suffix.
        boolean s4=s1.endsWith("o");
        System.out.println("endWith(), checks if the string ends with the specified suffix");
        System.out.println(s4);

        //compares this string with the specified objects.
        boolean s5=s1.equals(s2);
        System.out.println("equals(), compares this string with the specified objects");
        System.out.println(s5);

        //comparing this string to another, ignoring case.
        boolean s6=s1.equalsIgnoreCase(s2);
        System.out.println("eualsIgnoreCase(), comparing this string to another, ignoring case");
        System.out.println(s6);

        //returns the index of the first occurrence of the specified character.
        int s7=s1.indexOf('o');
        System.out.println("indexOf(), returns the index of the first occurrence of the specified character");
        System.out.println(s7);
        int s8=s1.indexOf("lo");
        System.out.println(s8);

        //IsEmpty()
        //returns true if the length() is 0
        boolean s9=s1.isEmpty();
        System.out.println(s9);

        //Length()
        int s10=s1.length();
        System.out.println(s10);

        //ReplaceAll()
        String s13="Hello123";
        String s11=s13.replaceAll("\\d", "");
        System.out.println(s11);

        //replace()
        String s12=s1.replace("oo","ll");
        System.out.println(s12);

        //Split, split the string around matches of the given regular expression
        String[] s14=s2.split("l");
        System.out.println(s14);

        //startWith()
        boolean s15=s1.startsWith("He");
        System.out.println(s15);

        //subString()
        //return the substring from beginning index to end index - 1
        String s16=s1.substring(3);
        String s17=s1.substring(1,4);
        System.out.println(s16);
        System.out.println(s17);

        //toCharArray()
        //Converts the string to new character array
        char[] s18=s1.toCharArray();
        System.out.println(s18);

        //trim()
        String s20="  hello  ";
        String s19=s20.trim();
        System.out.println(s19);

        //valueOf(inti) (and other types)
        //Converts the specified value to a string
        int i=111;
        String s21=String.valueOf(i);
        System.out.println(s21);


    }
}
