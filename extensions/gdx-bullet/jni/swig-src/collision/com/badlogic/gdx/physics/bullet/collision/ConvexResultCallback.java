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

public class ConvexResultCallback extends BulletBase {
	private long swigCPtr;
	
	protected ConvexResultCallback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new ConvexResultCallback, normally you should not need this constructor it's intended for low-level usage. */ 
	public ConvexResultCallback(long cPtr, boolean cMemoryOwn) {
		this("ConvexResultCallback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(ConvexResultCallback obj) {
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
				CollisionJNI.delete_ConvexResultCallback(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    CollisionJNI.ConvexResultCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    CollisionJNI.ConvexResultCallback_change_ownership(this, swigCPtr, true);
  }

  public void setClosestHitFraction(float value) {
    CollisionJNI.ConvexResultCallback_closestHitFraction_set(swigCPtr, this, value);
  }

  public float getClosestHitFraction() {
    return CollisionJNI.ConvexResultCallback_closestHitFraction_get(swigCPtr, this);
  }

  public void setCollisionFilterGroup(short value) {
    CollisionJNI.ConvexResultCallback_collisionFilterGroup_set(swigCPtr, this, value);
  }

  public short getCollisionFilterGroup() {
    return CollisionJNI.ConvexResultCallback_collisionFilterGroup_get(swigCPtr, this);
  }

  public void setCollisionFilterMask(short value) {
    CollisionJNI.ConvexResultCallback_collisionFilterMask_set(swigCPtr, this, value);
  }

  public short getCollisionFilterMask() {
    return CollisionJNI.ConvexResultCallback_collisionFilterMask_get(swigCPtr, this);
  }

  public ConvexResultCallback() {
    this(CollisionJNI.new_ConvexResultCallback(), true);
    CollisionJNI.ConvexResultCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public boolean hasHit() {
    return CollisionJNI.ConvexResultCallback_hasHit(swigCPtr, this);
  }

  public boolean needsCollision(btBroadphaseProxy proxy0) {
    return (getClass() == ConvexResultCallback.class) ? CollisionJNI.ConvexResultCallback_needsCollision(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0) : CollisionJNI.ConvexResultCallback_needsCollisionSwigExplicitConvexResultCallback(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0);
  }

  public float addSingleResult(LocalConvexResult convexResult, boolean normalInWorldSpace) {
    return CollisionJNI.ConvexResultCallback_addSingleResult(swigCPtr, this, LocalConvexResult.getCPtr(convexResult), convexResult, normalInWorldSpace);
  }

}
