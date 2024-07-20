public class  uncheckedex {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try {
            System.out.println(arr[5]); // Accessing out of bound index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
    }
}
