class lab_1_1
{ 
    public static int convert(int time)
    {
        return time * 60;
    }
    public static void main(String[] args) 
    {
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(2));
    }
}