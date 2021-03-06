package ca.ciccc.wmad.assignment8.question3;

public class ApplicationDriver {

    public static class MyGeometry{
        public void calculateAreaAndPerimeter(Shape shape){
            if(!ShapeType.class.isInstance(shape)){
                shape.perimeter();
                shape.area();
            } else{
                shape.perimeter();
            }
        }
    }

    public enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }

    public static void test(){
        MyGeometry mg = new MyGeometry();

        int[] s1Sides = {10, 20};
        ShapeType s1Type = ShapeType.Rectangle;
        mg.calculateAreaAndPerimeter(new Shape(s1Type, s1Sides){
            @Override
            float perimeter() {return 2 * (s1Sides[0] + s1Sides[1]);}
            @Override
            float area() {return s1Sides[0] * s1Sides[1];}
        });

        int[] s2Sides = {10};
        ShapeType s2Type = ShapeType.Square;
        mg.calculateAreaAndPerimeter(new Shape(s2Type, s2Sides){
            @Override
            float perimeter(){return 4 * s2Sides[0];}

            @Override
            float area(){return s2Sides[0] * s2Sides[0];}
        });

        int[] s3Sides = {12};
        ShapeType s3Type = ShapeType.Circle;
        mg.calculateAreaAndPerimeter(new Shape(s3Type, s3Sides) {
            @Override
            float perimeter() {
                return (float)(2 * Math.PI * s3Sides[0]);
            }

            @Override
            float area() {
                return (float)(Math.PI * s3Sides[0] * s3Sides[0]);
            }
        });

        int[] s4Sides = {8, 12, 12};
        ShapeType s4Type = ShapeType.Custom;
        mg.calculateAreaAndPerimeter(new Shape(s4Type, s4Sides) {
            @Override
            float perimeter() {
                return s4Sides[0] + s4Sides[1] + s4Sides[2];
            }

            @Override
            float area() {
                return (s4Sides[0] * s4Sides[1]) / 2;
            }
        });
    }

}
