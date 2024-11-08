package com.example;

class Dollar extends Money {
   private int amount;

   Dollar(int amount, String currency) {
      super(amount, currency);
   }

   Money times(int multiplier) {
      return Money.dollar(amount * multiplier);
   }

   public boolean equals(Object object) {
      Dollar dollar = (Dollar) object;
      return amount == dollar.amount;
   }

   String currency() {
      return currency;
   }
}