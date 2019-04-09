package dropDown;

 class Test   
{  
    int test_a, test_b; 
    Test(){}
    Test(){System.out.println("hello");}
    Test(int a, int b)   
    {  
    test_a = a;   
    test_b = b;   
    }  
   
    // void display(){System.out.println("inside display");}
    // void fun(){System.out.println("inside fun"); this.display();};
    public static void main (String args[])   
    {  
        Test test = new Test();   
        System.out.println(test.test_a+" "+test.test_b);  
        //test.fun();
    }  
}  