package org.example.shape;

import org.example.color.Color;

/**
 * @className：Shape
 * @Author: ckyforever
 * @Date: 2022/9/30 15:48
 */
public abstract class Shape {
    Color color;

    public Color getColor() {
        return color;
    }

    public Shape setColor(Color color) {
        this.color = color;
        return this;
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return "我是" + color.getDescription() + getDescription();
    }
}
