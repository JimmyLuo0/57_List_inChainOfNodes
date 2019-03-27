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
		
		System.out.println( "Get value at index 2: " + list.get(2) + System.lineSeparator());
		System.out.println( "Get value at index 0: " + list.get(0) + System.lineSeparator());
		System.out.println( "Get value at index 4: " + list.get(3) + System.lineSeparator());
		
		list.add(3, "d");
		System.out.println("Added d at index 3: " + list + System.lineSeparator());
		list.add(0, "u");
		System.out.println("Added u at index 0: " + list + System.lineSeparator());
		list.add(6, "?");
		System.out.println("Added ? at index 6: " + list + System.lineSeparator());
		
		System.out.println( "Replaced value at index 0 with z: " + list.set(0, "z") + System.lineSeparator());
		System.out.println(list + System.lineSeparator());
		System.out.println( "Replaced value at index 3 with x: " + list.set(3, "x") + System.lineSeparator());
		System.out.println(list + System.lineSeparator());
		System.out.println( "Replaced value at index 6 with w: " + list.set(6, "w") + System.lineSeparator());
		System.out.println(list + System.lineSeparator());
		
		System.out.println(list.remove(2));
		System.out.println( "Removed node at index 2: " + list + System.lineSeparator());
		System.out.println(list.remove(5));
		System.out.println( "Removed node at index 5: " + list + System.lineSeparator());
		System.out.println(list.remove(0));
		System.out.println( "Removed node at index 0: " + list + System.lineSeparator());
		

    }
}
