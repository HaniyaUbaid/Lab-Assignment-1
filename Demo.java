public class Demo{

public static void main(String args[]){


Artist a1=new Artist("Haniya");             //Object of Artist class

         
Artwork A1=new Artwork("Sunset",2004,a1);  //Object of Artwork class


Artwork A2=new Artwork("Rain",2004);      //Object of Artwork class

A2.setTitle("Mountain");                 //Changing Title

A2.setYear(2005);                        //Changing Year

System.out.println(A1);
System.out.println(A2);               

Artwork A3=A1.shallowCopy();

Artwork A4=A1.deepCopy();

System.out.println(A4);
System.out.println(A3);

A1.getArtist().setName("Hassan");

System.out.println(A1);
System.out.println(A3);
System.out.println(A4);

if(A4.equals(A3)){
System.out.println("Equal");}
else 
System.out.println("Not equal");


}
} 



