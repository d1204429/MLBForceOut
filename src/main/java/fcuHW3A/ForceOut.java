package fcu;

public class ForceOut {

  public static void main(String[] args) {
    boolean[] bases = {false, true}; // 可能的壘包狀態

    for (boolean first : bases) {
      for (boolean second : bases) {
        for (boolean third : bases) {
          BaseBag baseBag = new BaseBag(first, second, third);
          System.out.println(baseBag);
          System.out.println(baseBag.getForceOutStatus());
          System.out.println();
        }
      }
    }

//    BaseBag baseBag = new BaseBag(false, false, false);
//    System.out.println(baseBag.getForceOutStatus());
//    baseBag = new BaseBag(false, true, false);
//    System.out.println(baseBag.getForceOutStatus());
//    baseBag = new BaseBag(false, false, true);
//    System.out.println(baseBag.getForceOutStatus());
//    baseBag = new BaseBag(false, true, true);
//    System.out.println(baseBag.getForceOutStatus());
//    baseBag = new BaseBag(true, false, false);
//    System.out.println(baseBag.getForceOutStatus());
//    baseBag = new BaseBag(true, true, false);
//    System.out.println(baseBag.getForceOutStatus());
//    baseBag = new BaseBag(true, true, true);
//    System.out.println(baseBag.getForceOutStatus());
//    baseBag = new BaseBag(true, false, true);
//    System.out.println(baseBag.getForceOutStatus());
  }

}