// YOU SHOULD NOT MODIFY THIS FILE

import java.util.*;

public class CheckDriver {

  public static void main(String[] args) {

    ArrayList<Check> checks = new ArrayList<Check>();

    checks.add(new Check("Mary", 200));
    checks.add(new Check("John", 600));
    checks.add(new Check("John", 400));
    checks.add(new Check("Mary", 700));
    checks.add(new Check("Betty", 1000));
    checks.add(new Check("Alice", 300));
    checks.add(new Check("Peter", 200));
    checks.add(new Check("Alice", 300));

    Account account = new Account(500);
    account.processTransaction(checks);
  }
}
