#ifndef BT_COLLISION_OBJECT_WRAPPER_H
#define BT_COLLISION_OBJECT_WRAPPER_H

///btCollisionObjectWrapperis an internal data structure. 
///Most users can ignore this and use btCollisionObject and btCollisionShape instead
class btCollisionShape;
class btCollisionObject;
class btTransform;
#include "BulletCollision/CollisionDispatch/btCollisionObject.h"
#include "LinearMath/btScalar.h" // for SIMD_FORCE_INLINE definition

#define BT_DECLARE_STACK_ONLY_OBJECT \
	private: \
		void* operator new(size_t size); \
		void operator delete(void*);

struct btCollisionObjectWrapper;
struct btCollisionObjectWrapper
{
BT_DECLARE_STACK_ONLY_OBJECT

private:
	btCollisionObjectWrapper(const btCollisionObjectWrapper&); // not implemented. Not allowed.
	btCollisionObjectWrapper* operator=(const btCollisionObjectWrapper&);

public:
	const btCollisionObjectWrapper* m_parent;
	const btCollisionShape* m_shape;
	const btCollisionObject* m_collisionObject;
	const btTransform& m_worldTransform;
	const void* m_userPointer;
	const btScalar m_friction;
	const btScalar m_rollingFriction;
	const btScalar m_restitution;

	int		m_partId;
	int		m_index;

	btCollisionObjectWrapper(const btCollisionObjectWrapper* parent, const btCollisionShape* shape, const btCollisionObject* collisionObject, const btTransform& worldTransform, int partId, int index)
	: m_parent(parent), m_shape(shape), m_collisionObject(collisionObject), m_worldTransform(worldTransform),
	m_partId(partId), m_index(index), m_userPointer(collisionObject->getUserPointer()), 
	m_friction(collisionObject->getFriction()), m_rollingFriction(collisionObject->getRollingFriction()), m_restitution(collisionObject->getRestitution())
	{}

	btCollisionObjectWrapper(const btCollisionObjectWrapper* parent, const btCollisionShape* shape, const btCollisionObject* collisionObject, const btTransform& worldTransform, int partId, int index,
		void* userPointer, btScalar friction, btScalar restitution, btScalar rollingFriction)
		: m_parent(parent), m_shape(shape), m_collisionObject(collisionObject), m_worldTransform(worldTransform),
		m_partId(partId), m_index(index), m_userPointer(userPointer),
		m_friction(friction), m_rollingFriction(rollingFriction), m_restitution(restitution)
	{}

	SIMD_FORCE_INLINE const btTransform& getWorldTransform() const { return m_worldTransform; }
	SIMD_FORCE_INLINE const btCollisionObject* getCollisionObject() const { return m_collisionObject; }
	SIMD_FORCE_INLINE const btCollisionShape* getCollisionShape() const { return m_shape; }
	SIMD_FORCE_INLINE const void* getUserPointer() const { return m_userPointer; }
	SIMD_FORCE_INLINE const btScalar getFriction() const { return m_friction; }
	SIMD_FORCE_INLINE const btScalar getRestitution() const { return m_restitution; }
	SIMD_FORCE_INLINE const btScalar getRollingFriction() const { return m_rollingFriction; }
};

#endif //BT_COLLISION_OBJECT_WRAPPER_H
