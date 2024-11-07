package Arrays;
//to know the max size of array 
class introToArrays {
    public static void main(String[] args) {
        int size = Integer.MAX_VALUE;
        int[] ar = null;
        try {
            ar = new int[size];
            System.out.println(ar.length);
        } catch (OutOfMemoryError e) {
            System.out.println("Failed to allocate array of size: " + size);
        }
    }
}
