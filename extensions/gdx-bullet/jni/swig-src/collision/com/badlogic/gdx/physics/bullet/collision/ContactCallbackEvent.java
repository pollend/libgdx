/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

public final class ContactCallbackEvent {
  public final static int TYPE_MASK = 0x0F;
  public final static int BY_MASK = 12;
  public final static int FILTERED = 1;
  public final static int INCLUDE_POINT = 2;
  public final static int BY_WRAPPER = 4;
  public final static int BY_MANIFOLD = 4;
  public final static int BY_OBJECT = 8;
  public final static int BY_VALUE = 12;
  public final static int SHIFT_ON_ADDED = 0;
  public final static int SHIFT_ON_PROCESSED = 4;
  public final static int SHIFT_ON_DESTROYED = 8;
  public final static int SHIFT_ON_STARTED = 12;
  public final static int SHIFT_ON_ENDED = 16;
  public final static int ON_ADDED_UNFILTERED_WRAPPER = (BY_WRAPPER) << SHIFT_ON_ADDED;
  public final static int ON_ADDED_UNFILTERED_OBJECT = (BY_OBJECT) << SHIFT_ON_ADDED;
  public final static int ON_ADDED_UNFILTERED_VALUE = (BY_VALUE) << SHIFT_ON_ADDED;
  public final static int ON_ADDED_UNFILTERED_WRAPPER_INCLUDEPOINT = (BY_WRAPPER|INCLUDE_POINT) << SHIFT_ON_ADDED;
  public final static int ON_ADDED_UNFILTERED_OBJECT_INCLUDEPOINT = (BY_OBJECT|INCLUDE_POINT) << SHIFT_ON_ADDED;
  public final static int ON_ADDED_UNFILTERED_VALUE_INCLUDEPOINT = (BY_VALUE|INCLUDE_POINT) << SHIFT_ON_ADDED;
  public final static int ON_ADDED_FILTERED_WRAPPER = (FILTERED|BY_WRAPPER) << SHIFT_ON_ADDED;
  public final static int ON_ADDED_FILTERED_OBJECT = (FILTERED|BY_OBJECT) << SHIFT_ON_ADDED;
  public final static int ON_ADDED_FILTERED_VALUE = (FILTERED|BY_VALUE) << SHIFT_ON_ADDED;
  public final static int ON_ADDED_FILTERED_WRAPPER_INCLUDEPOINT = (FILTERED|BY_WRAPPER|INCLUDE_POINT) << SHIFT_ON_ADDED;
  public final static int ON_ADDED_FILTERED_OBJECT_INCLUDEPOINT = (FILTERED|BY_OBJECT|INCLUDE_POINT) << SHIFT_ON_ADDED;
  public final static int ON_ADDED_FILTERED_VALUE_INCLUDEPOINT = (FILTERED|BY_VALUE|INCLUDE_POINT) << SHIFT_ON_ADDED;
  public final static int ON_PROCESSED_UNFILTERED_OBJECT = (BY_OBJECT) << SHIFT_ON_PROCESSED;
  public final static int ON_PROCESSED_UNFILTERED_VALUE = (BY_VALUE) << SHIFT_ON_PROCESSED;
  public final static int ON_PROCESSED_UNFILTERED_OBJECT_INCLUDEPOINT = (BY_OBJECT|INCLUDE_POINT) << SHIFT_ON_PROCESSED;
  public final static int ON_PROCESSED_UNFILTERED_VALUE_INCLUDEPOINT = (BY_VALUE|INCLUDE_POINT) << SHIFT_ON_PROCESSED;
  public final static int ON_PROCESSED_FILTERED_OBJECT = (FILTERED|BY_OBJECT) << SHIFT_ON_PROCESSED;
  public final static int ON_PROCESSED_FILTERED_VALUE = (FILTERED|BY_VALUE) << SHIFT_ON_PROCESSED;
  public final static int ON_PROCESSED_FILTERED_OBJECT_INCLUDEPOINT = (FILTERED|BY_OBJECT|INCLUDE_POINT) << SHIFT_ON_PROCESSED;
  public final static int ON_PROCESSED_FILTERED_VALUE_INCLUDEPOINT = (FILTERED|BY_VALUE|INCLUDE_POINT) << SHIFT_ON_PROCESSED;
  public final static int ON_DESTROYED = BY_VALUE << SHIFT_ON_DESTROYED;
  public final static int ON_STARTED_UNFILTERED_MANIFOLD = (BY_MANIFOLD) << SHIFT_ON_STARTED;
  public final static int ON_STARTED_UNFILTERED_OBJECT = (BY_OBJECT) << SHIFT_ON_STARTED;
  public final static int ON_STARTED_UNFILTERED_VALUE = (BY_VALUE) << SHIFT_ON_STARTED;
  public final static int ON_STARTED_FILTERED_MANIFOLD = (FILTERED|BY_MANIFOLD) << SHIFT_ON_STARTED;
  public final static int ON_STARTED_FILTERED_OBJECT = (FILTERED|BY_OBJECT) << SHIFT_ON_STARTED;
  public final static int ON_STARTED_FILTERED_VALUE = (FILTERED|BY_VALUE) << SHIFT_ON_STARTED;
  public final static int ON_ENDED_UNFILTERED_MANIFOLD = (BY_MANIFOLD) << SHIFT_ON_ENDED;
  public final static int ON_ENDED_UNFILTERED_OBJECT = (BY_OBJECT) << SHIFT_ON_ENDED;
  public final static int ON_ENDED_UNFILTERED_VALUE = (BY_VALUE) << SHIFT_ON_ENDED;
  public final static int ON_ENDED_FILTERED_MANIFOLD = (FILTERED|BY_MANIFOLD) << SHIFT_ON_ENDED;
  public final static int ON_ENDED_FILTERED_OBJECT = (FILTERED|BY_OBJECT) << SHIFT_ON_ENDED;
  public final static int ON_ENDED_FILTERED_VALUE = (FILTERED|BY_VALUE) << SHIFT_ON_ENDED;
}

