public class Node {
    private Payload payload;
    Node next;
    
    public Node(Payload payload, Node next){
        this.payload=payload;
        this.next=next;
    }
    
    public void setPayload(Payload inputPayload){
        payload=inputPayload;    
    }
    
    public Payload getPayload(){
        return payload;
    }
    
    public void setNext(Node inputNext){
        next=inputNext;
    }
    
    public Node getNext(){
        return next;
    }
    
    public boolean isLast(){
        return next == null;
    }
}