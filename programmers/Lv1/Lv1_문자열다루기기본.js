function solution(s) {
  let answer = true;
  if (s.length !== 4 && s.length !== 6) {
    answer = false;
  } else {
    const arr = s.split('');
    arr.forEach(element => {
      isNaN(element) ? (answer = false) : null;
    });
  }
  return answer;
}

console.log(solution("a234"));
console.log(solution("1234"));
