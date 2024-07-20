class static_var {
    static int count = 0;
    int ncount=0;
    static_var()
    {
        count++;
        System.out.println("static count: " + count);
        ncount++;
        System.out.println("non-static count: " + ncount);
    }

    public static void main(String[] args) {
         
        static_var obj1 = new static_var();
        
        static_var obj2 = new static_var();
        
        static_var obj3 = new static_var();
       
    }
}
