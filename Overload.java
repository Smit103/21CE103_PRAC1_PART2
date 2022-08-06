/*
 ID:21CE103
 NAME: SMIT PATEL
  REPOSITORY LINK:https://github.com/Smit103/21CE103_PRAC1_PART2.git
 Develop a Program that illustrate method overloading concept.
 */
class Overloading {
    private void m1()
    {
        System.out.println("method m1()");
    }

    protected void m2()
    {
        System.out.println("method m2()");
    }
}

class Child extends Overloading {
   
    private void m1()
    {
        System.out.println("child m1()");
    }
    public void m2()
    {
        System.out.println("child m2()");
    }
}
class Overload {
    public static void main(String[] args)
    {
        Overloading obj1 = new Overloading();
        obj1.m2();
        Overloading obj2 = new Child();
        obj2.m2();
    }
}