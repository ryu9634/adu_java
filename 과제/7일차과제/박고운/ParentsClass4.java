class ParentClass4 {

    public void DisplayMethod()

    {

        System.out.println("ParentClass4의 DisplayMethod() 호출");

    }

}



class ChildClass4 extends ParentClass4{

    public void DisplayMethod()

    {

        System.out.println("ChildClass의 DisplayMethod() 호출");

    }

}



class InheritanceExample3 {

    public static void main(String[] args)

    {

        ChildClass4 child=new ChildClass4();



        child.DisplayMethod();

    }

}



