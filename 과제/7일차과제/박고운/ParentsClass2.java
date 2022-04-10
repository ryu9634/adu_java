class ParentClass2 {

    private int x;

    private int y;



    public ParentClass2(int x, int y)

    {

        this.x = x;

        this.y = y;

    }

    public void xyDisplay()

    {

        System.out.println("ParentClass2, x = " + x + ", y = " + y);

    }

}



class ChildClass2 extends ParentClass2{

    private int x;

    private int y;



    public ChildClass2(int x, int y)

    {

        super(x * 3, y * 2);

        this.x = x;

        this.y = y;

    }

    public void childMethod2()

    {

        super.xyDisplay();

        xyDisplay();

    }

    public void xyDisplay()

    {

        System.out.println("ChildClass2, x = " + x + ", y = " + y);

    }

}



class InheritanceExample1 {

    public static void main(String[] args)

    {

        ChildClass2 child= new ChildClass2(44, 7);



        child.childMethod2();

    }

}



