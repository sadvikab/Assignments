interface Mobile
{
public void version();
static void functionality()
{
System.out.println("To book vacination centres");
}
}

class Demo implements Mobile
{
public void version()
{
System.out.println("upgraded to 1.2 v with additional functionality like booking a specific vaccine needed");
}
static void functionality()
{
System.out.println("inside class");
}

public static void main(String args[])
{
Demo d=new Demo();
d.version();
Mobile.functionality();
d.functionality();
}
}