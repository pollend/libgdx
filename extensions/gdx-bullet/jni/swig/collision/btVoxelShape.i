%module btVoxelShape

%feature("director") btVoxelContentProvider;

%{
#include <BulletCollision/CollisionShapes/btVoxelShape.h>
%}

%include "BulletCollision/CollisionShapes/btVoxelShape.h"
