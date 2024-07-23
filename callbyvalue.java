public class callbyvalue {
    public static void swappingit(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        // System.out.println(a);
        // System.out.println(b);  //ye to yahi rehene dioye to swap honge
    }
    public static void main(String[] args){
int a=5;
int b=7;
swappingit( a,b);    
System.out.println(a);     //this two lines agar upar ki jagah niche likhe to swap nahi hoga wahi rahega,bcoz isme jab apan upar ka function call karte to wo uski copy banata aur wahi original values deta
System.out.println(b);    //in java when we pass values to originla function it will give copied values or duplicat value to the answer
    }
    }
