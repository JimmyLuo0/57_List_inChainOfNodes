/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        
        // // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
		
		System.out.println( "Get value at index 2: " + list.get(2));
		
		list.remove(2);
		System.out.println( "Removed node at index 2: " + list);
		
		list.add(2, "u");
		System.out.println("Added u at index 2: " + list);
		
		System.out.println( "Replaced value: " + list.set(0, "d"));
		System.out.println(list + System.lineSeparator());

    }
}
