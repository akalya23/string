public class numeric
{
public static void main(String[]args)
{
String string="12345.15";
boolean numeric=true;
try
{
double num=double.parsedoble(String);
}catch(NumberFormatException e) {
numeric=false;
}if(numeric)
System.out.println(String+"is  A NUMBER");
}
else
System.out.println(String+"is not number");
}
}
