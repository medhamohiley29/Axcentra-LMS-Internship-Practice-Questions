class BankAccount {
    private double balance;

    BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
            System.out.println("Invalid initial balance. Set to 0.");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
     public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);

        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500); 

        acc.displayBalance();
    }
}