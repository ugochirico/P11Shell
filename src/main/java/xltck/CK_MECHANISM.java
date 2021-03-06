package xltck;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : xltCk.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("xltCk") 
public class CK_MECHANISM extends StructObject {
	public CK_MECHANISM() {
		super();
	}
	public CK_MECHANISM(Pointer pointer) {
		super(pointer);
	}
	/// C type : CK_MECHANISM_TYPE
	@Field(0) 
	public int mechanism() {
		return this.io.getIntField(this, 0);
	}
	/// C type : CK_MECHANISM_TYPE
	@Field(0) 
	public CK_MECHANISM mechanism(int mechanism) {
		this.io.setIntField(this, 0, mechanism);
		return this;
	}
	/// C type : CK_VOID_PTR
	@Field(1) 
	public Pointer<? > pParameter() {
		return this.io.getPointerField(this, 1);
	}
	/// C type : CK_VOID_PTR
	@Field(1) 
	public CK_MECHANISM pParameter(Pointer<? > pParameter) {
		this.io.setPointerField(this, 1, pParameter);
		return this;
	}
	/**
	 * ulParameterLen was changed from CK_USHORT to CK_ULONG for<br>
	 * v2.0<br>
	 * in bytes<br>
	 * C type : CK_ULONG
	 */
	@Field(2) 
	public int ulParameterLen() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * ulParameterLen was changed from CK_USHORT to CK_ULONG for<br>
	 * v2.0<br>
	 * in bytes<br>
	 * C type : CK_ULONG
	 */
	@Field(2) 
	public CK_MECHANISM ulParameterLen(int ulParameterLen) {
		this.io.setIntField(this, 2, ulParameterLen);
		return this;
	}
}
