//내 풀이
// function solution(phone_number) {
//   const len = phone_number.length - 4;
//   return '*'.repeat(len) + phone_number.slice(len);
// }

// 새 풀이
// function solution(phone_number) {
//   const length = phone_number.length;
//   return phone_number.split('').fill('*', 0, length - 4).join('');
// }

function solution(n) {
  return [...n].fill('*', 0, n.length - 4).join('');
}

console.log(solution('12345678'));
console.log(solution('0277788888'));
console.log(solution('0102524333'));
console.log(solution('01023529367'));

