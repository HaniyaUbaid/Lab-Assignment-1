class Artist{
private String name;

public Artist(String name){
this.name=name;}

public String getName(){
return name;
}

public void setName(String name){
this.name=name;}

@Override
public String toString(){
return String.format("%s",name);}

}