
/**
 * Demonstrates  the use of the String class
 * Strings are how Javv handles text
 *
 * @author (Karmanyaah Malhotra)
 * @version (10/06/2020)
 */
public class StringDemos
{
    public static void main(String args[]){
        //creating String objects, using the constructor
        String str1 = new String("Strings are cool");
        String str2 = "Strings are fun"; //shortcut
        String str3 = new String(str2); //creates a copy of str2 that is separate from str2

        //create an empty String
        String str4 = new String();
        String str5  = ""; //no space between quotes

        //finding the length of a string
        int strlen = str1.length();

        System.out.println(str1+ " is " +strlen+ " characters long");

        //if we will not use the String length again then do print this way
        System.out.println(str2+ " is " +str2.length()+ " characters long");

        // concatnate
        str4 = str1+str2;
        System.out.println(str4);

        str5 = str1+", "+str2;
        System.out.println(str5);

        // the first version of substring returns all the characters
        System.out.println(str1.substring(2));

        System.out.println(str1.substring(2,13));

        str5 = "mississippi"
        ;
        System.out.println(str5.indexOf("sip"));
        System.out.println(str5.indexOf("miss"));

//stri
//e

//ith string
//ice
//perfect

//2
//0
//3
//-1

//Practicewith Strings
//20
//ewith S
//7




    }}
