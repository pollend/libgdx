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

public class btOptimizedBvhNode extends BulletBase {
	private long swigCPtr;
	
	protected btOptimizedBvhNode(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btOptimizedBvhNode, normally you should not need this constructor it's intended for low-level usage. */ 
	public btOptimizedBvhNode(long cPtr, boolean cMemoryOwn) {
		this("btOptimizedBvhNode", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btOptimizedBvhNode obj) {
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
				CollisionJNI.delete_btOptimizedBvhNode(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setAabbMinOrg(btVector3 value) {
    CollisionJNI.btOptimizedBvhNode_aabbMinOrg_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAabbMinOrg() {
    long cPtr = CollisionJNI.btOptimizedBvhNode_aabbMinOrg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setAabbMaxOrg(btVector3 value) {
    CollisionJNI.btOptimizedBvhNode_aabbMaxOrg_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAabbMaxOrg() {
    long cPtr = CollisionJNI.btOptimizedBvhNode_aabbMaxOrg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setEscapeIndex(int value) {
    CollisionJNI.btOptimizedBvhNode_escapeIndex_set(swigCPtr, this, value);
  }

  public int getEscapeIndex() {
    return CollisionJNI.btOptimizedBvhNode_escapeIndex_get(swigCPtr, this);
  }

  public void setSubPart(int value) {
    CollisionJNI.btOptimizedBvhNode_subPart_set(swigCPtr, this, value);
  }

  public int getSubPart() {
    return CollisionJNI.btOptimizedBvhNode_subPart_get(swigCPtr, this);
  }

  public void setTriangleIndex(int value) {
    CollisionJNI.btOptimizedBvhNode_triangleIndex_set(swigCPtr, this, value);
  }

  public int getTriangleIndex() {
    return CollisionJNI.btOptimizedBvhNode_triangleIndex_get(swigCPtr, this);
  }

  public void setPadding(String value) {
    CollisionJNI.btOptimizedBvhNode_padding_set(swigCPtr, this, value);
  }

  public String getPadding() {
    return CollisionJNI.btOptimizedBvhNode_padding_get(swigCPtr, this);
  }

  public btOptimizedBvhNode() {
    this(CollisionJNI.new_btOptimizedBvhNode(), true);
  }

}
