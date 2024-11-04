package fcu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//現在你應該：設計 => 寫測試碼 => 寫程式 => 測試 錯誤會隨著你的程式碼完善而減少

class baseBagTest {
  @Test
  void testBaseBagTest(){
    BaseBag baseBag = new BaseBag(false, false, false);
    assertEquals("壘包皆沒人 可封殺壘包 : 1B", baseBag.getForceOutStatus());
    baseBag = new BaseBag(false, true, false);
    assertEquals("二壘有人 可封殺壘包 : 1B", baseBag.getForceOutStatus());
    baseBag = new BaseBag(false, false, true);
    assertEquals("三壘有人 可封殺壘包 : 1B", baseBag.getForceOutStatus());
    baseBag = new BaseBag(false, true, true);
    assertEquals("二、三壘有人 可封殺壘包 : 1B", baseBag.getForceOutStatus());
    baseBag = new BaseBag(true, false, false);
    assertEquals("一壘有人 可封殺壘包 : 1B, 2B", baseBag.getForceOutStatus());
    baseBag = new BaseBag(true, true, false);
    assertEquals("一、二壘有人 可封殺壘包 : 1B, 2B, 3B", baseBag.getForceOutStatus());
    baseBag = new BaseBag(true, true, true);
    assertEquals("一、二、三壘有人 可封殺壘包 : 1B, 2B, 3B, HB", baseBag.getForceOutStatus());
    baseBag = new BaseBag(true, false, true);
    assertEquals("一、三壘有人 可封殺壘包 : 1B, 2B", baseBag.getForceOutStatus());
  }
}