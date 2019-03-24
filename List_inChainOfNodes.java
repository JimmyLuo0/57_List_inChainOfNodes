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
		 Node newNode = new Node(val, headReference);		 
		 headReference = newNode;
        return true;
     }
}