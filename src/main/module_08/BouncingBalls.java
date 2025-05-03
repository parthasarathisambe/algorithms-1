package main.module_08;

import edu.princeton.cs.algs4.StdDraw;

public class BouncingBalls {

  public static void main(String[] args) {
    int N = 100;
    Ball[] balls = new Ball[N];
    for (int i = 0; i < N; i++) {
      balls[i] = new Ball(getRandomPos(), getRandomPos(), getRandomVel(), getRandomVel(), 0.01);
    }
    while (true) {
      StdDraw.clear();
      for (int i = 0; i < N; i++) {
        balls[i].move(0.5);
        balls[i].draw();
      }
      StdDraw.show();
      StdDraw.pause(50);
      StdDraw.enableDoubleBuffering();
    }
  }

  private static double getRandomPos() {
    return 0.01 + (Math.random() * (0.99 - 0.01));
  }

  private static double getRandomVel() {
    return 0.01 + (Math.random() * (0.05 - 0.01));
  }

}
