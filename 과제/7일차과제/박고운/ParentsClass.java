class ParentClass {

    public void DisplayMethod(String str)

    {

        System.out.println("ParentClass의 DisplayMethod(String str) 호출: " + str);

    }

}



    class ChildClass extends ParentClass{

        public void DisplayMethod()

        {

            System.out.println("ChildClass의 DisplayMethod() 호출");

        }

    }



    class InheritanceExample {

        public static void main(String[] args)

        {

            ChildClass child=new ChildClass();



            child.DisplayMethod();

            child.DisplayMethod("JAVA!");

        }

    }





