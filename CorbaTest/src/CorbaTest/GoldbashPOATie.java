package CorbaTest;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Goldbash".
 *
 * @author JacORB IDL compiler V 3.8
 * @version generated at 2017-4-9 10:43:36
 */

public class GoldbashPOATie
	extends GoldbashPOA
{
	private GoldbashOperations _delegate;

	private POA _poa;
	public GoldbashPOATie(GoldbashOperations delegate)
	{
		_delegate = delegate;
	}
	public GoldbashPOATie(GoldbashOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public CorbaTest.Goldbash _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		CorbaTest.Goldbash __r = CorbaTest.GoldbashHelper.narrow(__o);
		return __r;
	}
	public CorbaTest.Goldbash _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		CorbaTest.Goldbash __r = CorbaTest.GoldbashHelper.narrow(__o);
		return __r;
	}
	public GoldbashOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(GoldbashOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public java.lang.String checkNum(float num)
	{
		return _delegate.checkNum(num);
	}

}
