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
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.graphics.g3d.model.NodePart;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;

public class btTriangleIndexVertexArray extends btStridingMeshInterface {
	private long swigCPtr;
	
	protected btTriangleIndexVertexArray(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btTriangleIndexVertexArray_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTriangleIndexVertexArray, normally you should not need this constructor it's intended for low-level usage. */
	public btTriangleIndexVertexArray(long cPtr, boolean cMemoryOwn) {
		this("btTriangleIndexVertexArray", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btTriangleIndexVertexArray_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btTriangleIndexVertexArray obj) {
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
				CollisionJNI.delete_btTriangleIndexVertexArray(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	protected final static Array<btTriangleIndexVertexArray> instances = new Array<btTriangleIndexVertexArray>();
	
	/** @return Whether the supplied array contains all specified tags. */
	public static <T extends Object> boolean compare(final btTriangleIndexVertexArray array, final Array<T> tags) {
		if (array.meshes.size != tags.size)
			return false;
		for (final btIndexedMesh mesh : array.meshes) {
			boolean found = false;
			final Object tag = mesh.tag;
			if (tag == null) 
				return false;
			for (final T t : tags) {
				if (t.equals(tag)) {
					found = true;
					break;
				}
			}
			if (!found)
				return false;
		}
		return true;
	}

	protected static <T extends Object> btTriangleIndexVertexArray getInstance(final Array<T> tags) {
		for (final btTriangleIndexVertexArray instance : instances) {
			if (compare(instance, tags))
				return instance;
		}
		return null;
	}
	
	/** Create or reuse a btTriangleIndexVertexArray instance based on the specified {@link MeshPart} array.
	 * Use {@link #release()} to release the mesh when it's no longer needed. */
	public static <T extends MeshPart> btTriangleIndexVertexArray obtain(final Array<T> meshParts) {
		btTriangleIndexVertexArray result = getInstance(meshParts);
		if (result == null) {
			result = new btTriangleIndexVertexArray(meshParts);
			instances.add(result);
		}
		result.obtain();
		return result;
	}
	
	protected final Array<btIndexedMesh> meshes = new Array<btIndexedMesh>(1);
	
	public btTriangleIndexVertexArray(final MeshPart meshPart) {
		this();
		addMeshPart(meshPart);
	}
	
	public <T extends MeshPart> btTriangleIndexVertexArray(final Iterable<T> meshParts) {
		this();
		addMeshParts(meshParts);
	}
	
	/** The amount of meshes this array contains. */
	public int getIndexedMeshCount() {
		return meshes.size;
	}
	
	/** Return the {@link btIndexedMesh} at the specified index. */
	public btIndexedMesh getIndexedMesh(int index) {
		return meshes.get(index);
	}

	/** Add a {@link MeshPart} instance to this btTriangleIndexVertexArray. 
	 * The specified mesh must be indexed and triangulated and must outlive this btTriangleIndexVertexArray.
     * The buffers for the vertices and indices are shared amongst both. */
	public btTriangleIndexVertexArray addMeshPart(final MeshPart meshPart) {
		btIndexedMesh mesh = btIndexedMesh.obtain(meshPart);
		addIndexedMesh(mesh, PHY_ScalarType.PHY_SHORT);
		mesh.release();
		return this;
	}

	/** Add one or more {@link MeshPart} instances to this btTriangleIndexVertexArray. 
	 * The specified meshes must be indexed and triangulated and must outlive this btTriangleIndexVertexArray.
     * The buffers for the vertices and indices are shared amongst both. */
	public btTriangleIndexVertexArray addMeshParts(final MeshPart... meshParts) {
		for (int i = 0; i < meshParts.length; i++)
			addMeshPart(meshParts[i]);
		return this;
	}

	/** Add one or more {@link MeshPart} instances to this btTriangleIndexVertexArray. 
	 * The specified meshes must be indexed and triangulated and must outlive this btTriangleIndexVertexArray.
     * The buffers for the vertices and indices are shared amongst both. */
	public <T extends MeshPart> btTriangleIndexVertexArray addMeshParts(final Iterable<T> meshParts) {
		for (final MeshPart meshPart : meshParts)
			addMeshPart(meshPart);
		return this;
	}
	
	/** Add one or more {@link NodePart} instances to this btTriangleIndexVertexArray. 
	 * The specified meshes must be indexed and triangulated and must outlive this btTriangleIndexVertexArray.
     * The buffers for the vertices and indices are shared amongst both. */
	public <T extends NodePart> btTriangleIndexVertexArray addNodeParts(final Iterable<T> nodeParts) {
		for (final NodePart nodePart : nodeParts)
			addMeshPart(nodePart.meshPart);
		return this;
	}
	
	/** Add a {@link btIndexedMesh} to this array */
	public btTriangleIndexVertexArray addIndexedMesh(final btIndexedMesh mesh, int indexType) {
		mesh.obtain();
		internalAddIndexedMesh(mesh, indexType);
		meshes.add(mesh);
		return this;
	}

	/** Add a {@link btIndexedMesh} to this array */
	public btTriangleIndexVertexArray addIndexedMesh(final btIndexedMesh mesh) {
		return addIndexedMesh(mesh, PHY_ScalarType.PHY_SHORT);
	}
	
	@Override
	public void dispose() {
		for (final btIndexedMesh mesh : meshes)
			mesh.release();
		meshes.clear();
		super.dispose();
	}

  public btTriangleIndexVertexArray() {
    this(CollisionJNI.new_btTriangleIndexVertexArray(), true);
  }

  private void internalAddIndexedMesh(btIndexedMesh mesh, int indexType) {
    CollisionJNI.btTriangleIndexVertexArray_internalAddIndexedMesh__SWIG_0(swigCPtr, this, btIndexedMesh.getCPtr(mesh), mesh, indexType);
  }

  private void internalAddIndexedMesh(btIndexedMesh mesh) {
    CollisionJNI.btTriangleIndexVertexArray_internalAddIndexedMesh__SWIG_1(swigCPtr, this, btIndexedMesh.getCPtr(mesh), mesh);
  }

  public void getLockedVertexIndexBase(SWIGTYPE_p_p_unsigned_char vertexbase, SWIGTYPE_p_int numverts, SWIGTYPE_p_PHY_ScalarType type, SWIGTYPE_p_int vertexStride, SWIGTYPE_p_p_unsigned_char indexbase, SWIGTYPE_p_int indexstride, SWIGTYPE_p_int numfaces, SWIGTYPE_p_PHY_ScalarType indicestype, int subpart) {
    CollisionJNI.btTriangleIndexVertexArray_getLockedVertexIndexBase__SWIG_0(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(vertexbase), SWIGTYPE_p_int.getCPtr(numverts), SWIGTYPE_p_PHY_ScalarType.getCPtr(type), SWIGTYPE_p_int.getCPtr(vertexStride), SWIGTYPE_p_p_unsigned_char.getCPtr(indexbase), SWIGTYPE_p_int.getCPtr(indexstride), SWIGTYPE_p_int.getCPtr(numfaces), SWIGTYPE_p_PHY_ScalarType.getCPtr(indicestype), subpart);
  }

  public void getLockedVertexIndexBase(SWIGTYPE_p_p_unsigned_char vertexbase, SWIGTYPE_p_int numverts, SWIGTYPE_p_PHY_ScalarType type, SWIGTYPE_p_int vertexStride, SWIGTYPE_p_p_unsigned_char indexbase, SWIGTYPE_p_int indexstride, SWIGTYPE_p_int numfaces, SWIGTYPE_p_PHY_ScalarType indicestype) {
    CollisionJNI.btTriangleIndexVertexArray_getLockedVertexIndexBase__SWIG_1(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(vertexbase), SWIGTYPE_p_int.getCPtr(numverts), SWIGTYPE_p_PHY_ScalarType.getCPtr(type), SWIGTYPE_p_int.getCPtr(vertexStride), SWIGTYPE_p_p_unsigned_char.getCPtr(indexbase), SWIGTYPE_p_int.getCPtr(indexstride), SWIGTYPE_p_int.getCPtr(numfaces), SWIGTYPE_p_PHY_ScalarType.getCPtr(indicestype));
  }

  public void getLockedReadOnlyVertexIndexBase(SWIGTYPE_p_p_unsigned_char vertexbase, SWIGTYPE_p_int numverts, SWIGTYPE_p_PHY_ScalarType type, SWIGTYPE_p_int vertexStride, SWIGTYPE_p_p_unsigned_char indexbase, SWIGTYPE_p_int indexstride, SWIGTYPE_p_int numfaces, SWIGTYPE_p_PHY_ScalarType indicestype, int subpart) {
    CollisionJNI.btTriangleIndexVertexArray_getLockedReadOnlyVertexIndexBase__SWIG_0(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(vertexbase), SWIGTYPE_p_int.getCPtr(numverts), SWIGTYPE_p_PHY_ScalarType.getCPtr(type), SWIGTYPE_p_int.getCPtr(vertexStride), SWIGTYPE_p_p_unsigned_char.getCPtr(indexbase), SWIGTYPE_p_int.getCPtr(indexstride), SWIGTYPE_p_int.getCPtr(numfaces), SWIGTYPE_p_PHY_ScalarType.getCPtr(indicestype), subpart);
  }

  public void getLockedReadOnlyVertexIndexBase(SWIGTYPE_p_p_unsigned_char vertexbase, SWIGTYPE_p_int numverts, SWIGTYPE_p_PHY_ScalarType type, SWIGTYPE_p_int vertexStride, SWIGTYPE_p_p_unsigned_char indexbase, SWIGTYPE_p_int indexstride, SWIGTYPE_p_int numfaces, SWIGTYPE_p_PHY_ScalarType indicestype) {
    CollisionJNI.btTriangleIndexVertexArray_getLockedReadOnlyVertexIndexBase__SWIG_1(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(vertexbase), SWIGTYPE_p_int.getCPtr(numverts), SWIGTYPE_p_PHY_ScalarType.getCPtr(type), SWIGTYPE_p_int.getCPtr(vertexStride), SWIGTYPE_p_p_unsigned_char.getCPtr(indexbase), SWIGTYPE_p_int.getCPtr(indexstride), SWIGTYPE_p_int.getCPtr(numfaces), SWIGTYPE_p_PHY_ScalarType.getCPtr(indicestype));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btIndexedMesh_t getIndexedMeshArray() {
    return new SWIGTYPE_p_btAlignedObjectArrayT_btIndexedMesh_t(CollisionJNI.btTriangleIndexVertexArray_getIndexedMeshArray(swigCPtr, this), false);
  }

}
