class Parent3Class {

    public void DisplayMethod(String str)

    {

        System.out.println("Parent3Class의 DisplayMethod(String str) 호출: " + str);

    }

}



class ChildClass3 extends Parent3Class{

    public void DisplayMethod()

    {

        System.out.println("ChildClass3의 DisplayMethod() 호출");

    }

}



class InheritanceExample2 {

    public static void main(String[] args)

    {

        ChildClass3 child=new ChildClass3();



        child.DisplayMethod();

        child.DisplayMethod("JAVA!");

    }

}



