package za.ac.cput.adpgroupassignment;

/**
 *
 * @author anathi mhlom 220006695
 * 
 * A POJO for Identity Document 
 */
public class IdentityNumber {
    private String Surname, Names, Sex, CountryOfBirth, Status;
    private int IdentityNumber, DateOfBirth;
    
    public void getSurname(){
    return Surname;
}
    
    public void setSurname(String Surname){
    this.Surname = Surname;
}
    
    public void getNames(){
    return Names;
}
    
    public void setNames(String Names){
    this.Names = Names;
}
    
    public void getSex(){
    return Sex;
}
    
    public void setSex(String Sex){
    this.Sex = Sex;
}
    
    public void getCountryOfBirth(){
    return CountryOfBirth;
}
    
    public void setCountryOfBirth(String CountryOfBirth){
    this.CountryOfBirth = CountryOfBirth;
}
    
    public void getStatus(){
    return Status;
}
    
    public void setStatus(String Status){
    this.Status = Status;
}
    
    public void getIdentityNumber(){
    return IdentityNumber;
}
    
    public void setIdentityNumber(int IdentityNumber){
    this.IdentityNumber = IdentityNumber;
}
    
    public void getDateOfBirth(){
    return DateOfBirth;
}
    
    public void setDateOfBirth(int DateOfBirth){
    this.DateOfBirth = DateOfBirth;
}
    
    @Override
    public String toString(){
        return "Surname: " + Surname + "Names: " + Names + "Sex: " + Sex + "Country of Birth: " + CountryOfBirth + "Status: " + Status + "Identity Number: " + IdentityNumber + "Date of Birth: " + DateOfBirth;
    }
}


    

