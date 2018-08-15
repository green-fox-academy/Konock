package greenfox.academy;

public class Counter {
  int value;
  int initValue;

  Counter() {
    value = 0;
    initValue = value;
  }

  Counter(int value) {
    this.value = value;
    initValue = value;
  }

  int add() {
    value++;
    return value;
  }

  int add(int num) {
    value += num;
    return value;
  }

  int get() {
    return value;
  }

  int reset() {
    value = initValue;
    return value;
  }
}
