class Main
{
public static void Main{
    int a=1;
    int b=0;
    int c=a/b;
    try{
        c=a/b;  
    }catch(Exception e ){
        System.out.println(e.getMessage());
    }
}
}