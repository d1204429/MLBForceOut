package fcuHW3B;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MLBDataProcessorTest {

  @Test
  void verifyWinLoss(){
    //正常情況測試
    assertDoesNotThrow(() -> MLBDataProcessor.checkWinLoss("test", 100, 62));
    //勝場極限值
    assertDoesNotThrow(() -> MLBDataProcessor.checkWinLoss("test",162,0));
    //敗場極限值
    assertDoesNotThrow(() -> MLBDataProcessor.checkWinLoss("test",0,162));
    //勝場數為負
    assertThrows(IllegalStateException.class, () -> {
      MLBDataProcessor.checkWinLoss("test", -100, 62);
    });
    //敗場數為負
    assertThrows(IllegalStateException.class, () -> {
      MLBDataProcessor.checkWinLoss("test", 100, -62);
    });
    //場數超過162
    assertThrows(IllegalStateException.class, () -> {
      MLBDataProcessor.checkWinLoss("test", 100, 63);
    });
    //場數小於162
    assertThrows(IllegalStateException.class, () -> {
      MLBDataProcessor.checkWinLoss("test", 100, 61);
    });
  }
}