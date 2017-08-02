/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btHashedSimplePairCache extends BulletBase {
	private long swigCPtr;
	
	protected btHashedSimplePairCache(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btHashedSimplePairCache, normally you should not need this constructor it's intended for low-level usage. */ 
	public btHashedSimplePairCache(long cPtr, boolean cMemoryOwn) {
		this("btHashedSimplePairCache", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btHashedSimplePairCache obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btHashedSimplePairCache(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btHashedSimplePairCache() {
    this(CollisionJNI.new_btHashedSimplePairCache(), true);
  }

  public void removeAllPairs() {
    CollisionJNI.btHashedSimplePairCache_removeAllPairs(swigCPtr, this);
  }

  public long removeOverlappingPair(int indexA, int indexB) {
    return CollisionJNI.btHashedSimplePairCache_removeOverlappingPair(swigCPtr, this, indexA, indexB);
  }

  public btSimplePair addOverlappingPair(int indexA, int indexB) {
    long cPtr = CollisionJNI.btHashedSimplePairCache_addOverlappingPair(swigCPtr, this, indexA, indexB);
    return (cPtr == 0) ? null : new btSimplePair(cPtr, false);
  }

  public btSimplePair getOverlappingPairArrayPtr() {
    long cPtr = CollisionJNI.btHashedSimplePairCache_getOverlappingPairArrayPtr__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btSimplePair(cPtr, false);
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btSimplePair_t getOverlappingPairArray() {
    return new SWIGTYPE_p_btAlignedObjectArrayT_btSimplePair_t(CollisionJNI.btHashedSimplePairCache_getOverlappingPairArray__SWIG_0(swigCPtr, this), false);
  }

  public btSimplePair findPair(int indexA, int indexB) {
    long cPtr = CollisionJNI.btHashedSimplePairCache_findPair(swigCPtr, this, indexA, indexB);
    return (cPtr == 0) ? null : new btSimplePair(cPtr, false);
  }

  public int GetCount() {
    return CollisionJNI.btHashedSimplePairCache_GetCount(swigCPtr, this);
  }

  public int getNumOverlappingPairs() {
    return CollisionJNI.btHashedSimplePairCache_getNumOverlappingPairs(swigCPtr, this);
  }

}
