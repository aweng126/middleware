package CorbaTest;

/**
 * Generated from IDL interface "Goldbash".
 *
 * @author JacORB IDL compiler V 3.8
 * @version generated at 2017-4-9 10:43:36
 */

public final class GoldbashHolder	implements org.omg.CORBA.portable.Streamable{
	 public Goldbash value;
	public GoldbashHolder()
	{
	}
	public GoldbashHolder (final Goldbash initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return GoldbashHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GoldbashHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		GoldbashHelper.write (_out,value);
	}
}
