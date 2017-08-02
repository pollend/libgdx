/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btDynamicsWorld extends btCollisionWorld {
	private long swigCPtr;
	
	protected btDynamicsWorld(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btDynamicsWorld_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btDynamicsWorld, normally you should not need this constructor it's intended for low-level usage. */
	public btDynamicsWorld(long cPtr, boolean cMemoryOwn) {
		this("btDynamicsWorld", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btDynamicsWorld_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btDynamicsWorld obj) {
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
				DynamicsJNI.delete_btDynamicsWorld(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public int stepSimulation(float timeStep, int maxSubSteps, float fixedTimeStep) {
    return DynamicsJNI.btDynamicsWorld_stepSimulation__SWIG_0(swigCPtr, this, timeStep, maxSubSteps, fixedTimeStep);
  }

  public int stepSimulation(float timeStep, int maxSubSteps) {
    return DynamicsJNI.btDynamicsWorld_stepSimulation__SWIG_1(swigCPtr, this, timeStep, maxSubSteps);
  }

  public int stepSimulation(float timeStep) {
    return DynamicsJNI.btDynamicsWorld_stepSimulation__SWIG_2(swigCPtr, this, timeStep);
  }

  public void addConstraint(btTypedConstraint constraint, boolean disableCollisionsBetweenLinkedBodies) {
    DynamicsJNI.btDynamicsWorld_addConstraint__SWIG_0(swigCPtr, this, btTypedConstraint.getCPtr(constraint), constraint, disableCollisionsBetweenLinkedBodies);
  }

  public void addConstraint(btTypedConstraint constraint) {
    DynamicsJNI.btDynamicsWorld_addConstraint__SWIG_1(swigCPtr, this, btTypedConstraint.getCPtr(constraint), constraint);
  }

  public void removeConstraint(btTypedConstraint constraint) {
    DynamicsJNI.btDynamicsWorld_removeConstraint(swigCPtr, this, btTypedConstraint.getCPtr(constraint), constraint);
  }

  public void addAction(btActionInterface action) {
    DynamicsJNI.btDynamicsWorld_addAction(swigCPtr, this, btActionInterface.getCPtr(action), action);
  }

  public void removeAction(btActionInterface action) {
    DynamicsJNI.btDynamicsWorld_removeAction(swigCPtr, this, btActionInterface.getCPtr(action), action);
  }

  public void setGravity(Vector3 gravity) {
    DynamicsJNI.btDynamicsWorld_setGravity(swigCPtr, this, gravity);
  }

  public Vector3 getGravity() {
	return DynamicsJNI.btDynamicsWorld_getGravity(swigCPtr, this);
}

  public void synchronizeMotionStates() {
    DynamicsJNI.btDynamicsWorld_synchronizeMotionStates(swigCPtr, this);
  }

  public void addRigidBody(btRigidBody body) {
    DynamicsJNI.btDynamicsWorld_addRigidBody__SWIG_0(swigCPtr, this, btRigidBody.getCPtr(body), body);
  }

  public void addRigidBody(btRigidBody body, short group, short mask) {
    DynamicsJNI.btDynamicsWorld_addRigidBody__SWIG_1(swigCPtr, this, btRigidBody.getCPtr(body), body, group, mask);
  }

  public void removeRigidBody(btRigidBody body) {
    DynamicsJNI.btDynamicsWorld_removeRigidBody(swigCPtr, this, btRigidBody.getCPtr(body), body);
  }

  public void setConstraintSolver(btConstraintSolver solver) {
    DynamicsJNI.btDynamicsWorld_setConstraintSolver(swigCPtr, this, btConstraintSolver.getCPtr(solver), solver);
  }

  public btConstraintSolver getConstraintSolver() {
    long cPtr = DynamicsJNI.btDynamicsWorld_getConstraintSolver(swigCPtr, this);
    return (cPtr == 0) ? null : new btConstraintSolver(cPtr, false);
  }

  public int getNumConstraints() {
    return DynamicsJNI.btDynamicsWorld_getNumConstraints(swigCPtr, this);
  }

  public btTypedConstraint getConstraint(int index) {
    long cPtr = DynamicsJNI.btDynamicsWorld_getConstraint__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new btTypedConstraint(cPtr, false);
  }

  public int getWorldType() {
    return DynamicsJNI.btDynamicsWorld_getWorldType(swigCPtr, this);
  }

  public void clearForces() {
    DynamicsJNI.btDynamicsWorld_clearForces(swigCPtr, this);
  }

  public void setInternalTickCallback(SWIGTYPE_p_f_p_btDynamicsWorld_float__void cb, long worldUserInfo, boolean isPreTick) {
    DynamicsJNI.btDynamicsWorld_setInternalTickCallback__SWIG_0(swigCPtr, this, SWIGTYPE_p_f_p_btDynamicsWorld_float__void.getCPtr(cb), worldUserInfo, isPreTick);
  }

  public void setInternalTickCallback(SWIGTYPE_p_f_p_btDynamicsWorld_float__void cb, long worldUserInfo) {
    DynamicsJNI.btDynamicsWorld_setInternalTickCallback__SWIG_1(swigCPtr, this, SWIGTYPE_p_f_p_btDynamicsWorld_float__void.getCPtr(cb), worldUserInfo);
  }

  public void setInternalTickCallback(SWIGTYPE_p_f_p_btDynamicsWorld_float__void cb) {
    DynamicsJNI.btDynamicsWorld_setInternalTickCallback__SWIG_2(swigCPtr, this, SWIGTYPE_p_f_p_btDynamicsWorld_float__void.getCPtr(cb));
  }

  public void setWorldUserInfo(long worldUserInfo) {
    DynamicsJNI.btDynamicsWorld_setWorldUserInfo(swigCPtr, this, worldUserInfo);
  }

  public long getWorldUserInfo() {
    return DynamicsJNI.btDynamicsWorld_getWorldUserInfo(swigCPtr, this);
  }

  public btContactSolverInfo getSolverInfo() {
    return new btContactSolverInfo(DynamicsJNI.btDynamicsWorld_getSolverInfo(swigCPtr, this), false);
  }

  public void addVehicle(btActionInterface vehicle) {
    DynamicsJNI.btDynamicsWorld_addVehicle(swigCPtr, this, btActionInterface.getCPtr(vehicle), vehicle);
  }

  public void removeVehicle(btActionInterface vehicle) {
    DynamicsJNI.btDynamicsWorld_removeVehicle(swigCPtr, this, btActionInterface.getCPtr(vehicle), vehicle);
  }

  public void addCharacter(btActionInterface character) {
    DynamicsJNI.btDynamicsWorld_addCharacter(swigCPtr, this, btActionInterface.getCPtr(character), character);
  }

  public void removeCharacter(btActionInterface character) {
    DynamicsJNI.btDynamicsWorld_removeCharacter(swigCPtr, this, btActionInterface.getCPtr(character), character);
  }

}
