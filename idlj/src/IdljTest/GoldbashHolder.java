package IdljTest;

/**
* IdljTest/GoldbashHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从IdljTest.idl
* 2017年4月11日 星期二 下午05时02分01秒 CST
*/

public final class GoldbashHolder implements org.omg.CORBA.portable.Streamable
{
  public IdljTest.Goldbash value = null;

  public GoldbashHolder ()
  {
  }

  public GoldbashHolder (IdljTest.Goldbash initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IdljTest.GoldbashHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IdljTest.GoldbashHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IdljTest.GoldbashHelper.type ();
  }

}
