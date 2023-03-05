import java.util.ArrayList;

public class SchoolList{
    //data section
    ArrayList<School>schools = new ArrayList<>();
    
    public void addSchool (School sc){
        schools.add(sc);
    }
    
    public void removeSchool (School sc){
        schools.remove(sc);
    }
    
    public void display(){
        for (int i=0; i<schools.size();i++) {
            System.out.print("School: " + schools.get(i).getName() + "\n");
        }
    }
    
    
}