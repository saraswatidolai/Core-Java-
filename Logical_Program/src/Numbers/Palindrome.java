
public class Palindrome {
	
    public static void main(String[] args) {

        int num = 121, rev=0, r;
        int temp=num;
        while(temp!=0){
            r = temp%10;
            rev = rev * 10 + r;
            temp/=10;
        }
        if(num==rev){
            System.out.println("PAlindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}