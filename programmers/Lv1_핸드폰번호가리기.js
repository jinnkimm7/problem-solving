//내 풀이
function solution(phone_number) {
  const len = phone_number.length - 4;
  return '*'.repeat(len) + phone_number.slice(len);
}

console.log(solution('12345678'));
console.log(solution('0277788888'));

// 다른 사람 풀이
function hide_numbers(s) {
  return s.replace(/\d(?=\d{4})/g, "*");
}

console.log("결과 : " + hide_numbers('01033334444'));


