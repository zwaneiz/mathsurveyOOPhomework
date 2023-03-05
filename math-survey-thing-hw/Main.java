//WEEK 8 HOMEWORK MATH EVALUATION SURVEY

/***************************************
1. Rewrite calcAvg in Java
2. Extend the code so that we have marks (Dataset) for 2 school
3. A math competency evaluation survey was to be conducted 
   involving a number of schools. Each school is identified by its name, address, principal's name,
   and a dataset of marks collected for each school. Create classes given this requirement.
4. Make the code more complete:
   - The evaluation comprises a number of schools.
   - The list of schools needs to update from time to time - added, removed.
   - May need to search to see whether a school is on the list.
***************************************/

public class Main {
    public static void main(String args[]) {
        
        SchoolList dl = new SchoolList();
        
        School utp1 = new School();
        utp1.setName("Universiti Teknologi Petronas");
        dl.addSchool(utp1);
        
        School utp2 = new School();
        utp2.setName("Universiti Petronas");
        dl.addSchool(utp2);
        
        //Display school
        dl.display();
    }
    
    
}
