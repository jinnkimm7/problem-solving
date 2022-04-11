function solution(s) {
  let arr = s.split(' ');
  let answer = [];
  for (let i = 0; i < arr.length; i++) {
    answer.push(arr[i].split('').map((cur, j) => j % 2 ? cur.toLowerCase() : cur.toUpperCase()).join(''))
  }
  return answer.join(' ');
}

console.log(solution("try hello world"));