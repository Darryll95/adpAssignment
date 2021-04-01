package za.ac.cput.adpgroupassignment;

/**
 *
 * @author anathi mhlom 220006695
 * 
 * A POJO for Identity Number domain
 */
public class IdAccount {
    private String Surname, Names, Status;
    
    public IdAccount(){
}
    
    public String getSurname(){
    return Surname;
}
    
    public void setSurname(String Surname){
    this.Surname = Surname;
}
    
    public String getNames(){
    return Names;
}
    
    public void setNames(String Names){
    this.Names = Names;
}
    
    public String getStatus(){
    return Status;
}
    
    public void setStatus(String Status){
    this.Status = Status;
}
    @Override
    public String toString(){
        return "IdAccount{Surname: " + Surname + "Names: " + Names + "Status: " + Status + "}";
    }
}


    

