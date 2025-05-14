public class Queue {
	private Node head;

	public void enQueue(Node node) {
		Node temp = head;
		if(temp==null) {
			head=node;
		}
		else {
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			node.setNext(null);
			temp.setNext(node);
		}
	}

	public String printQueue() {
		Node copyNode = head;
		String nodeContent = "";
		while(copyNode != null) {
		    nodeContent = nodeContent.concat(toString(copyNode));
			copyNode = copyNode.getNext();
		}
		return nodeContent;
	}

	public String deQueue(){
		String nodeContent = "";
		Node copyNode = head;
		nodeContent = toString(copyNode);
		head=copyNode.getNext();
		return nodeContent;
	}

	public boolean isEmpty(){
		Node copyNode = head;
		if (copyNode == null)
			return true;
		else
			return false;
	}
	public String toString(Node inputNode){
	    return "Node:" + "\n" + "   Id: " + inputNode.getPayload().getId()
		               + "\n   Description: " + inputNode.getPayload().getDescription()
		               + "\n   Timestamp: " + inputNode.getPayload().getTimeStamp() 
		               + "\n";
	}
}