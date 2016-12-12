/**
 * Item 20: Replace unions with class hierarchies.
 * // Discriminated union /
#include "math.h"
        typedef enum {RECTANGLE, CIRCLE} shapeType_t;
        typedef struct {
        double length;
        double width;
        } rectangleDimensions_t;
        typedef struct {
        double radius;
        } circleDimensions_t;
        typedef struct {
        shapeType_t tag;
        union {
        rectangleDimensions_t rectangle;
        circleDimensions_t circle;
        } dimensions;
        } shape_t;
        double area(shape_t *shape) {
        switch(shape->tag) {
        case RECTANGLE: {
        double length = shape->dimensions.rectangle.length;
        double width = shape->dimensions.rectangle.width;
        return length * width;
        }
        case CIRCLE: {
        double r = shape->dimensions.circle.radius;
        return M_PI * (r*r);
        }
default: return -1.0; // Invalid tag
        }
        }
     A class hierarchy has numerous advantages over a discriminated union. Chief among these is
     that the class hierarchy provides type safety. In the example, every Shape instance is either a
     valid Circle or a valid Rectangle. It is a simple matter to generate a shape_t structure that
     is complete garbage, as the association between the tag and the union is not enforced by the
     language. If the tag indicates that the shape_t represents a rectangle but the union has been
     set for a circle, all bets are off. Even if a discriminated union has been initialized properly, it
     is possible to pass it to a function that is inappropriate for its tag value.
     A second advantage of the class hierarchy is that code is simple and clear. The discriminated
     union is cluttered with boilerplate: declaring the enum type, declaring the tag field, switching
     on the tag field, dealing with unexpected tag values, and the like. The discriminated union
     code is made even less readable by the fact that the operations for the various types are
     intermingled rather than segregated by type.
     A third advantage of the class hierarchy is that it is easily extensible, even by multiple parties
     working independently. To extend a class hierarchy, simply add a new subclass. If you forget
     to override one of the abstract methods in the superclass, the compiler will tell you in no
     uncertain terms. To extend a discriminated union, you need access to the source code. You
     must add a new value to the enum type, as well as a new case to the switch statement in each
     operation on the discriminated union. Finally, you must recompile. If you forget to provide a
     new case for some method, you won't find out until run time, and then only if you're careful to
     check for unrecognized tag values and generate an appropriate error message.
     A fourth advantage of the class hierarchy is that it can be made to reflect natural hierarchical
     relationships among types, to allow for increased flexibility and better compile-time type
     checking. Suppose the discriminated union in the original example also allowed for squares.
     The class hierarchy could be made to reflect the fact a square is a special kind of rectangle
     (assuming both are immutable):

 */
package chapter_5.item_20;