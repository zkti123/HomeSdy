package com.green.javaHome.sty.study_one.programming_language;

public class DrwShapeEx {
    public static void main(String[] args) {
        point[] p = {
                new point(100, 100),
                new point(140,50),
                new point(200,100)
        };
        Triangle t = new Triangle(p);
        Circle c = new Circle(new point(150, 150), 50);
        t.draw();
        c.draw();
    }
}

class Shape {
    String color = "Black";

    void draw() {
        System.out.printf("[color=%s]\n",color);
    }
}

class point {
    int x;
    int y;

    point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    point() {
        this(0, 0);
    }

    String getXY() {
        return "(" + x + "," + y + ")";
    }
}

class Circle extends Shape {
    point center;
    int r;

    Circle() {
        this(new point(0, 0), 100);
    }

    Circle(point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {
        System.out.printf("[center=(%d,%d), r=%d, color = %s]\n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    point[] p = new point[3];

    Triangle(point[] p) {
        this.p = p;

    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color = %s]\n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}
