package chapter4_10;

import lombok.Getter;

@Getter
public enum BaseballTeam {
  LG(40, 35), SK(35, 35);

  private final int win;
  private final int lose;

  private BaseballTeam(int win, int lose) {
    this.win = win;
    this.lose = lose;
  }

  public double getWinsRate() {
    return (win * 100.0) / (win + lose);
  }

}
