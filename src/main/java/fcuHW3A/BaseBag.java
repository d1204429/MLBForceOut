package fcu;

public class BaseBag {

  private Boolean firstBase;
  private Boolean secondBase;
  private Boolean thirdBase;


  public BaseBag(Boolean firstBase, Boolean secondBase, Boolean thirdBase) {
    this.firstBase = firstBase;
    this.secondBase = secondBase;
    this.thirdBase = thirdBase;
  }

  public Boolean getFirstBase() {
    return firstBase;
  }

  public void setFirstBase(Boolean firstBase) {
    this.firstBase = firstBase;
  }

  public Boolean getSecondBase() {
    return secondBase;
  }

  public void setSecondBase(Boolean secondBase) {
    this.secondBase = secondBase;
  }

  public Boolean getThirdBase() {
    return thirdBase;
  }

  public void setThirdBase(Boolean thirdBase) {
    this.thirdBase = thirdBase;
  }

  @Override
  public String toString() {
    return "BaseBag{" +
        "firstBase=" + firstBase +
        ", secondBase=" + secondBase +
        ", thirdBase=" + thirdBase +
        '}';
  }

  public String getForceOutStatus() {
    //位元旗標（Bit Flag）法
    //true時設置001 010 100，並配合false時設置000 組合成0~7的數字
    int caseNumber = (firstBase ? 1 : 0) | (secondBase ? 2 : 0) | (thirdBase ? 4 : 0);

    String forceOutResult = "";

    try{
    switch (caseNumber) {
      //000
      case 0:
        forceOutResult = "壘包皆沒人 可封殺壘包 : 1B";
        break;
      //001
      case 1:
        forceOutResult = "一壘有人 可封殺壘包 : 1B, 2B";
        break;
      //010
      case 2:
        forceOutResult = "二壘有人 可封殺壘包 : 1B";
        break;
      //011
      case 3:
        forceOutResult = "一、二壘有人 可封殺壘包 : 1B, 2B, 3B";
        break;
      //100
      case 4:
        forceOutResult = "三壘有人 可封殺壘包 : 1B";
        break;
      //101
      case 5:
        forceOutResult = "一、三壘有人 可封殺壘包 : 1B, 2B";
        break;
      //110
      case 6:
        forceOutResult = "二、三壘有人 可封殺壘包 : 1B";
        break;
      //111
      case 7:
        forceOutResult = "一、二、三壘有人 可封殺壘包 : 1B, 2B, 3B, HB";
        break;
    }
    return forceOutResult;
  }
  catch (Exception e){
    return "壘包狀態錯誤 請再次確認";
  }
  }
}
