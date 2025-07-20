public class SupplierExample {
    /**
     *
     * supplier doesn't take any input but provides the return value to the caller
     *
     */
    public static void main(String[] args) {
        // get the supplier from the helper function
        Helper.studentSupplier.get().forEach((student)->{
            // iterate over all the results
            System.out.printf("Supplier Name: %s\n",student.getName());
        });
    }
}
