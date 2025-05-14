import java.time.LocalDate;

public class Payload {
    private int ID;
    private String description;
    private LocalDate timeStamp;
    
    public Payload(int ID, String description){
        this.ID = ID;
        this.description = description;
        timeStamp = LocalDate.now();
    }
    public int getId(){
        return ID;
    }
    public String getDescription(){
        return description;
    }
    public LocalDate getTimeStamp(){
        return timeStamp;
    }
    
    public void setId(int id){
        ID = id;
    }
    public void setDescription(String description){
        this.description = description;
    }
}