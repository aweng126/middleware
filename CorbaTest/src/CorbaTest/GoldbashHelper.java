package CorbaTest;


/**
 * Generated from IDL interface "Goldbash".
 *
 * @author JacORB IDL compiler V 3.8
 * @version generated at 2017-4-9 10:43:36
 */

public abstract class GoldbashHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(GoldbashHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:CorbaTest/Goldbash:1.0", "Goldbash");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final CorbaTest.Goldbash s)
	{
			any.insert_Object(s);
	}
	public static CorbaTest.Goldbash extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:CorbaTest/Goldbash:1.0";
	}
	public static Goldbash read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(CorbaTest._GoldbashStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CorbaTest.Goldbash s)
	{
		_out.write_Object(s);
	}
	public static CorbaTest.Goldbash narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof CorbaTest.Goldbash)
		{
			return (CorbaTest.Goldbash)obj;
		}
		else if (obj._is_a("IDL:CorbaTest/Goldbash:1.0"))
		{
			CorbaTest._GoldbashStub stub;
			stub = new CorbaTest._GoldbashStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static CorbaTest.Goldbash unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof CorbaTest.Goldbash)
		{
			return (CorbaTest.Goldbash)obj;
		}
		else
		{
			CorbaTest._GoldbashStub stub;
			stub = new CorbaTest._GoldbashStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
