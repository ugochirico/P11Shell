package xltck;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : xltCk.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("xltCk") 
public class CK_RC2_CBC_PARAMS extends StructObject {
	public CK_RC2_CBC_PARAMS() {
		super();
	}
	public CK_RC2_CBC_PARAMS(Pointer pointer) {
		super(pointer);
	}
	/**
	 * ulEffectiveBits was changed from CK_USHORT to CK_ULONG for<br>
	 * v2.0<br>
	 * effective bits (1-1024)<br>
	 * C type : CK_ULONG
	 */
	@Field(0) 
	public int ulEffectiveBits() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * ulEffectiveBits was changed from CK_USHORT to CK_ULONG for<br>
	 * v2.0<br>
	 * effective bits (1-1024)<br>
	 * C type : CK_ULONG
	 */
	@Field(0) 
	public CK_RC2_CBC_PARAMS ulEffectiveBits(int ulEffectiveBits) {
		this.io.setIntField(this, 0, ulEffectiveBits);
		return this;
	}
	/**
	 * IV for CBC mode<br>
	 * C type : CK_BYTE[8]
	 */
	@Array({8}) 
	@Field(1) 
	public Pointer<Byte > iv() {
		return this.io.getPointerField(this, 1);
	}
}
