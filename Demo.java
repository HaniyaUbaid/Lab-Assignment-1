public class Demo{

public static void main(String args[]){


Artist a1=new Artist("Haniya");
Artwork A1=new Artwork("Lord of the rings",2004,a1);
Artwork A2=new Artwork("Harry Potter",2004);
A2.setTitle("Mountain");
A2.setYear(2005);
System.out.println(A1);
System.out.println(A2);
Artwork A3=A1;
Artwork A4=new Artwork(A1.getTitle(),A1.getYear(),new Artist(A1.getArtist().getName()));
System.out.println(A4);
System.out.println(A3);
A1.getArtist().setName("Hassan");
System.out.println(A1);
System.out.println(A3);
System.out.println(A4);

}
} 



