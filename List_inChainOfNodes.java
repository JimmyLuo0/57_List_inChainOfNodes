/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
     

    /**
      @return the number of elements in this list
     */
    public int size() {
		if (headReference == null)
			return 0;
		else return size(headReference.getReferenceToNextNode());
    }
	public int size(Node nextNode) {
		if (nextNode == null)
			return 1;
		else return 1 + size(nextNode.getReferenceToNextNode());
	}
    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
		String result = ""; 
		if (headReference == null)
			result += "No Nodes";
		else result += headReference.toString();
		result += " Size: " + size();
		return result;
    }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
		 headReference = new Node(val, headReference);		 
        return true;
     }
	 
	 public Object get(int index) {
		 if (index == 0){
			return headReference.getCargoReference();
		 }
		 else return get(index - 1, headReference.getReferenceToNextNode());
	 }
	 
	 public Object get(int index, Node nextNode){
		 if(index == 0){
			 return nextNode.getCargoReference();
			 }
		else return get(index - 1, nextNode.getReferenceToNextNode());
	 }
	 
	 public void remove(int index){
		 if (index == 0)
			 headReference = headReference.getReferenceToNextNode();
		 else remove (index - 1, headReference.getReferenceToNextNode());
	 }
	 public void remove(int index, Node nextNode){
		 if (index == 1)
			 nextNode.setReferenceToNextNode(nextNode.getReferenceToNextNode().getReferenceToNextNode());
		 else remove (index - 1, nextNode.getReferenceToNextNode());
	 }
	 
	 public Object set(int index, Object newValue){
		 if(index == 0){
			 Object oldValue = headReference.getCargoReference();
			 headReference = new Node(newValue, headReference.getReferenceToNextNode());
			 return oldValue;
		 }
		 else return set(index - 1, newValue, headReference.getReferenceToNextNode());
	 }
	 
	 public Object set(int index, Object newValue, Node nextNode){
		 if(index == 1){
			 Object oldValue = nextNode.getCargoReference();
			 nextNode.setReferenceToNextNode(new Node(newValue, nextNode.getReferenceToNextNode().getReferenceToNextNode()));
			 return oldValue;
		 }
		 else return set(index - 1, newValue, nextNode.getReferenceToNextNode());
	 }
	 
	 public boolean add(int index, Object value){
		 if (index == 0)
			return addAsHead(value);
		else return add(index - 1, value, headReference.getReferenceToNextNode());
	 }
	 
	 public boolean add(int index, Object value, Node nextNode){
		 if (index == 1){
			 Node temp = nextNode.getReferenceToNextNode();
			 nextNode.setReferenceToNextNode(new Node(value, temp));
			 return true;
		 }
		 else return add(index - 1, value, nextNode.getReferenceToNextNode());
	 }
}