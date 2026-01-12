class swap_number{
    public static void main(String args[]){
        int a = 5;
        int b = 6;
        System.out.println("Before Swap : ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        

    }
}