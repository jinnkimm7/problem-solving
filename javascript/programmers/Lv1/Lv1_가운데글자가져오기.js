// 내 풀이
// function solution(s) {
//   const midIdx = Math.floor(s.length / 2);
//   return s.length % 2 !== 0 ? s[midIdx] : s[midIdx - 1] + s[midIdx]
// }

//다른 풀이
function solution(s) {
  return s.substr(Math.ceil(s.length / 2) - 1, s.length % 2 === 0 ? 2 : 1);
}

// substr으로 문자열을 자를 수 있다. 
// substr() 메서드는 문자열에서 특정 위치에서 시작하여 특정 문자 수 만큼의 문자들을 반환합니다.
// str.substring(indexStart[, indexEnd])
// indexEnd 마지막 인덱스 포함하지 않음.

console.log(solution('abcde'));
console.log(solution('qwer'));