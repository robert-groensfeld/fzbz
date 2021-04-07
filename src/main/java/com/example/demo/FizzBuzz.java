package com.example.demo;

class FizzBuzz {
  private int size;
  private String[] numbers;

  public FizzBuzz(int size) {
    this.size = Math.min(512, size);
    this.numbers = new String[this.size];
    for (int i = 1; i <= this.size; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        numbers[i - 1] = "fizz buzz";
      } else if (i % 3 == 0) {
        numbers[i - 1] = "fizz";
      } else if (i % 5 == 0) {
        numbers[i - 1] = "buzz";
      } else {
        numbers[i - 1] = Integer.toString(i);
      }
    }
  }

  public int getSize() {
    return size;
  }

  public String[] getNumbers() {
    return numbers;
  }
}
