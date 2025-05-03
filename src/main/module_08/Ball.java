package main.module_08;

import edu.princeton.cs.algs4.StdDraw;

public class Ball {

  private double rx, ry; // position
  private double vx, vy; // velocity
  private double radius;

  public Ball(double xPos, double yPos, double xVel, double yVel, double radius) {
    this.rx = xPos;
    this.ry = yPos;
    this.vx = xVel;
    this.vy = yVel;
    this.radius = radius;
  }

  public void move(double dt) {
    if ((rx + vx * dt < radius) || (rx + vx * dt > 1.0 - radius)) {
      vx = -vx;
    }
    if ((ry + vy * dt < radius) || (ry + vy * dt > 1.0 - radius)) {
      vy = -vy;
    }
    rx = rx + vx * dt;
    ry = ry + vy * dt;
  }

  public void draw() {
    StdDraw.filledCircle(rx, ry, radius);
  }

}
