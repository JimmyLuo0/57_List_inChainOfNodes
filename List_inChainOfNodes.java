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
	
	private Node findCorrectNode(int index){
		if (index == 0)
			return headReference;
		else return findCorrectNode(index - 1, headReference.getReferenceToNextNode());
	}
	
	private Node findCorrectNode(int index, Node node){
		if (index == 0)
			return node;
		else return findCorrectNode(index - 1, node.getReferenceToNextNode());
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
		return findCorrectNode(index).getCargoReference();
	}
	 
	public Object remove(int index){
		Object removedValue;
		if (index == 0){
			removedValue = headReference.getCargoReference();
			headReference = headReference.getReferenceToNextNode();
		}
		else{
            removedValue = findCorrectNode(index).getCargoReference();
			if (index == size() - 1)
				findCorrectNode(index - 1).setReferenceToNextNode(null);
			else{
			findCorrectNode(index - 1).setReferenceToNextNode(findCorrectNode(index)
														      .getReferenceToNextNode());
			}
		}
		return removedValue;
	}
	 
	public Object set(int index, Object newValue){
		Object oldValue;
		if(index == 0){
			oldValue = headReference.getCargoReference();
			headReference.setCargoReference(newValue);
		}
		else{ oldValue = findCorrectNode(index).getCargoReference();
			  findCorrectNode(index).setCargoReference(newValue);
		}
		return oldValue;
	}
	 
	public boolean add(int index, Object value){
		if (index == 0)
			return addAsHead(value);
		else{ Node temp = findCorrectNode(index - 1).getReferenceToNextNode();
			  findCorrectNode(index - 1).setReferenceToNextNode(new Node(value, temp));
			  return true;
		}
	}
}