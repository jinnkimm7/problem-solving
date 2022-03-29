function solution(seoul) {
  for (let i = 0; i < seoul.length; i++) {
    if (seoul[i] === 'Kim') return `김서방은 ${i}에 있다`
  }
}

console.log(solution(["Jane", "Kim"]));
console.log(solution(["Jane", "Jin", "Kim"]));
console.log(solution(["Kim", "Jane"]));

// 다른 사람 풀이

function findKim(seoul) {
  let idx = seoul.indexOf('Kim');
  return `김서방은 ${idx}에 있다`
}

console.log(findKim(["Jane", "Kim"]));
console.log(findKim(["Jane", "Jin", "Kim"]));
console.log(findKim(["Kim", "Jane"]));