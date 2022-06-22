// function solution(price, money, count) {
//   let sum = 0;
//   for (let i = 1; i <= count; i++) {
//     sum += price * i;
//   }
//   return money > sum ? 0 : sum - money;
// }

// 나중에 나의 다른 풀이
function solution(price, money, count) {
  const fee = Array(count).fill()
    .map((v, i) => i + 1).map(v => v * price)
    .reduce((a, b) => a + b);
  return money >= fee ? 0 : fee - money;
}

console.log(solution(3, 20, 4));