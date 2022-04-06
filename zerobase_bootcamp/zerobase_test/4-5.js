function solution(A) {
  let change = A;

  const fiftyThousand = (change - (change % 50000)) / 50000;
  change = change - (50000 * fiftyThousand);
  const tenThousand = (change - (change % 10000)) / 10000;
  change = change - (50000 * tenThousand);
  const fiveThousand = (change - (change % 5000)) / 5000;
  change = change - (500 * fiveThousand);
  const oneThousand = (change - (change % 1000)) / 1000;
  change = change - (1000 * oneThousand);
  const fiveHundred = (change - (change % 500)) / 500;
  change = change - (500 * fiveHundred);
  const oneHundred = (change - (change % 100)) / 100;
  change = change - (100 * oneHundred);
  const fifty = (change - (change % 50)) / 50;
  change = change - (50 * fifty);
  const ten = (change - (change % 10)) / 10
  change = change - (10 * ten);
  const five = (change - (change % 5)) / 5
  change = change - (5 * five);
  const one = (change - (change % 1)) / 1
  change = change - (1 * one);

  return fiftyThousand + tenThousand + fiveThousand + oneThousand + fiveHundred + oneHundred + ten + five + one;
}

console.log(solution(50000));
console.log(solution(67000));