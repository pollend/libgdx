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

public class btContactSolverInfoFloatData extends BulletBase {
	private long swigCPtr;
	
	protected btContactSolverInfoFloatData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btContactSolverInfoFloatData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btContactSolverInfoFloatData(long cPtr, boolean cMemoryOwn) {
		this("btContactSolverInfoFloatData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btContactSolverInfoFloatData obj) {
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
				DynamicsJNI.delete_btContactSolverInfoFloatData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setTau(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_tau_set(swigCPtr, this, value);
  }

  public float getTau() {
    return DynamicsJNI.btContactSolverInfoFloatData_tau_get(swigCPtr, this);
  }

  public void setDamping(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_damping_set(swigCPtr, this, value);
  }

  public float getDamping() {
    return DynamicsJNI.btContactSolverInfoFloatData_damping_get(swigCPtr, this);
  }

  public void setFriction(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_friction_set(swigCPtr, this, value);
  }

  public float getFriction() {
    return DynamicsJNI.btContactSolverInfoFloatData_friction_get(swigCPtr, this);
  }

  public void setTimeStep(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_timeStep_set(swigCPtr, this, value);
  }

  public float getTimeStep() {
    return DynamicsJNI.btContactSolverInfoFloatData_timeStep_get(swigCPtr, this);
  }

  public void setRestitution(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_restitution_set(swigCPtr, this, value);
  }

  public float getRestitution() {
    return DynamicsJNI.btContactSolverInfoFloatData_restitution_get(swigCPtr, this);
  }

  public void setMaxErrorReduction(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_maxErrorReduction_set(swigCPtr, this, value);
  }

  public float getMaxErrorReduction() {
    return DynamicsJNI.btContactSolverInfoFloatData_maxErrorReduction_get(swigCPtr, this);
  }

  public void setSor(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_sor_set(swigCPtr, this, value);
  }

  public float getSor() {
    return DynamicsJNI.btContactSolverInfoFloatData_sor_get(swigCPtr, this);
  }

  public void setErp(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_erp_set(swigCPtr, this, value);
  }

  public float getErp() {
    return DynamicsJNI.btContactSolverInfoFloatData_erp_get(swigCPtr, this);
  }

  public void setErp2(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_erp2_set(swigCPtr, this, value);
  }

  public float getErp2() {
    return DynamicsJNI.btContactSolverInfoFloatData_erp2_get(swigCPtr, this);
  }

  public void setGlobalCfm(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_globalCfm_set(swigCPtr, this, value);
  }

  public float getGlobalCfm() {
    return DynamicsJNI.btContactSolverInfoFloatData_globalCfm_get(swigCPtr, this);
  }

  public void setSplitImpulsePenetrationThreshold(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_splitImpulsePenetrationThreshold_set(swigCPtr, this, value);
  }

  public float getSplitImpulsePenetrationThreshold() {
    return DynamicsJNI.btContactSolverInfoFloatData_splitImpulsePenetrationThreshold_get(swigCPtr, this);
  }

  public void setSplitImpulseTurnErp(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_splitImpulseTurnErp_set(swigCPtr, this, value);
  }

  public float getSplitImpulseTurnErp() {
    return DynamicsJNI.btContactSolverInfoFloatData_splitImpulseTurnErp_get(swigCPtr, this);
  }

  public void setLinearSlop(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_linearSlop_set(swigCPtr, this, value);
  }

  public float getLinearSlop() {
    return DynamicsJNI.btContactSolverInfoFloatData_linearSlop_get(swigCPtr, this);
  }

  public void setWarmstartingFactor(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_warmstartingFactor_set(swigCPtr, this, value);
  }

  public float getWarmstartingFactor() {
    return DynamicsJNI.btContactSolverInfoFloatData_warmstartingFactor_get(swigCPtr, this);
  }

  public void setMaxGyroscopicForce(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_maxGyroscopicForce_set(swigCPtr, this, value);
  }

  public float getMaxGyroscopicForce() {
    return DynamicsJNI.btContactSolverInfoFloatData_maxGyroscopicForce_get(swigCPtr, this);
  }

  public void setSingleAxisRollingFrictionThreshold(float value) {
    DynamicsJNI.btContactSolverInfoFloatData_singleAxisRollingFrictionThreshold_set(swigCPtr, this, value);
  }

  public float getSingleAxisRollingFrictionThreshold() {
    return DynamicsJNI.btContactSolverInfoFloatData_singleAxisRollingFrictionThreshold_get(swigCPtr, this);
  }

  public void setNumIterations(int value) {
    DynamicsJNI.btContactSolverInfoFloatData_numIterations_set(swigCPtr, this, value);
  }

  public int getNumIterations() {
    return DynamicsJNI.btContactSolverInfoFloatData_numIterations_get(swigCPtr, this);
  }

  public void setSolverMode(int value) {
    DynamicsJNI.btContactSolverInfoFloatData_solverMode_set(swigCPtr, this, value);
  }

  public int getSolverMode() {
    return DynamicsJNI.btContactSolverInfoFloatData_solverMode_get(swigCPtr, this);
  }

  public void setRestingContactRestitutionThreshold(int value) {
    DynamicsJNI.btContactSolverInfoFloatData_restingContactRestitutionThreshold_set(swigCPtr, this, value);
  }

  public int getRestingContactRestitutionThreshold() {
    return DynamicsJNI.btContactSolverInfoFloatData_restingContactRestitutionThreshold_get(swigCPtr, this);
  }

  public void setMinimumSolverBatchSize(int value) {
    DynamicsJNI.btContactSolverInfoFloatData_minimumSolverBatchSize_set(swigCPtr, this, value);
  }

  public int getMinimumSolverBatchSize() {
    return DynamicsJNI.btContactSolverInfoFloatData_minimumSolverBatchSize_get(swigCPtr, this);
  }

  public void setSplitImpulse(int value) {
    DynamicsJNI.btContactSolverInfoFloatData_splitImpulse_set(swigCPtr, this, value);
  }

  public int getSplitImpulse() {
    return DynamicsJNI.btContactSolverInfoFloatData_splitImpulse_get(swigCPtr, this);
  }

  public void setPadding(String value) {
    DynamicsJNI.btContactSolverInfoFloatData_padding_set(swigCPtr, this, value);
  }

  public String getPadding() {
    return DynamicsJNI.btContactSolverInfoFloatData_padding_get(swigCPtr, this);
  }

  public btContactSolverInfoFloatData() {
    this(DynamicsJNI.new_btContactSolverInfoFloatData(), true);
  }

}
