package IdljTest;


/**
* IdljTest/GoldbashHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从IdljTest.idl
* 2017年4月11日 星期二 下午05时02分01秒 CST
*/

abstract public class GoldbashHelper
{
  private static String  _id = "IDL:IdljTest/Goldbash:1.0";

  public static void insert (org.omg.CORBA.Any a, IdljTest.Goldbash that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IdljTest.Goldbash extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (IdljTest.GoldbashHelper.id (), "Goldbash");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static IdljTest.Goldbash read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_GoldbashStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IdljTest.Goldbash value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static IdljTest.Goldbash narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof IdljTest.Goldbash)
      return (IdljTest.Goldbash)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      IdljTest._GoldbashStub stub = new IdljTest._GoldbashStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static IdljTest.Goldbash unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof IdljTest.Goldbash)
      return (IdljTest.Goldbash)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      IdljTest._GoldbashStub stub = new IdljTest._GoldbashStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
