%module btVoxelShape

%feature("director") VoxelContentProvider;

%{
#include <BulletCollision/CollisionShapes/btVoxelShape.h>
%}

%include "BulletCollision/CollisionShapes/btVoxelShape.h"
