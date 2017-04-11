package IdljTest;


/**
* IdljTest/GoldbashPOA.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从IdljTest.idl
* 2017年4月11日 星期二 下午05时02分01秒 CST
*/

public abstract class GoldbashPOA extends org.omg.PortableServer.Servant
 implements IdljTest.GoldbashOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("checkNum", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // IdljTest/Goldbash/checkNum
       {
         float num = in.read_float ();
         String $result = null;
         $result = this.checkNum (num);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:IdljTest/Goldbash:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Goldbash _this() 
  {
    return GoldbashHelper.narrow(
    super._this_object());
  }

  public Goldbash _this(org.omg.CORBA.ORB orb) 
  {
    return GoldbashHelper.narrow(
    super._this_object(orb));
  }


} // class GoldbashPOA
