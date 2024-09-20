class Artwork{

private String title;
private int year;
private Artist artist;

public Artwork(String title,int year,Artist artist){

this.title=title;
this.year=year;
this.artist=artist;}

public Artwork(String title,int year){
this.title=title;
this.year=year;
this.artist=new Artist("Unknown Artist");}


public String getTitle(){
return title;}

public int getYear(){
return year;}

public Artist getArtist(){
return artist;}

public String toString(){
return String.format("%s %d %s",title,year,artist);}

public void setArtist(Artist artist){
this.artist=artist;}

public void setYear(int year){
this.year=year;}

public void setTitle(String title){
this.title=title;}

}
