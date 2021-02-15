public class Palindrome 
{
    // программа получает строки через командную строку. Выводит в обратном порядке 
    // и проверяет является ли эта строка палиндромом
    public static void main(String[] args) 
    {
        for (int i = 0; i < args.length; i++) 
        {
            String s = args[i];
            System.out.println(reverseString(s));
            if (isPalindrome(s))
            {
                System.out.println(s + " is a palindrome");
            }
            else
            {
                System.out.println(s + " can't be a palindrome ");
            }
        } 
        
    }

    // Метод возвращает строку, в которой символы идут в обратном порядке
    public static String reverseString(String s)
    {
        String reversed_string = "";
        for (int i = s.length() - 1; i >= 0; --i)
        {
            reversed_string += s.charAt(i);
        } 
        return reversed_string;
    }
    
    // проверяет является ли строка палиндромом 
    public static boolean isPalindrome(String s)
    {
        return s.equals(reverseString(s));
    }
}