// [문제 설명]
// 숫자를 뒤집어 주세요.
// 만약에 -587이 들어오면 -785로 변경되어야 합니다.
// 결과의 절댓값이 100,000을 넘어가면 0을 출력해주세요.

// [제한 사항]

// 결과의 절댓값이 100,000을 넘어가면 0을 출력합니다.
// [입력 형식]

// num은 -1,000,000 이상 1,000,000 이하의 정수입니다.
// [출력 형식]

// leading zeros는 제거합니다. (ex: 340이 입력되면 043이 아니라 43이 출력되어야 합니다.)
// int 형식으로 출력합니다.

function solution(num) {
  let numArr = String(num).split(''); //입력한 숫자를 문자열로 바꾸고 배열로 만듦.
  let numReversed = numArr.reverse(); //배열을 뒤집었음.
  if (num > 1000000 || num < -1000000) {
    return 0;
  } else { // 만약 음수면 마지막에 있는 '-'를 앞으로 옮겨야됨.
    if (numReversed[numReversed.length - 1] === '-') { //마지막 인덱스가 '-'면
      numReversed.pop(); //마지막 인덱스 '-' 제거
      numReversed.unshift('-'); //앞에 '-'추가
    } else if (numReversed[0] === '0') { //앞자리가 0이면
      numReversed.shift(); //0 제거
    }
    return parseInt(numReversed.join(''));
  }
}

// console.log(solution(120));
// console.log(solution(-587));
// console.log(solution(1000002));
// console.log(solution(-1000002));

//정답

function solution(num) {
  let temp = String(num).split('');

  //끝이 0인 경우
  if (temp[temp.length - 1] === '0') {
    temp.pop();
  }
  temp = temp.reverse();
  //음수인 경우
  if (temp[temp.length - 1] === '-') {
    temp.pop();

    temp = Number(temp.join(''));

    if (temp > 1000000) return 0;
    else {
      return -temp;
    }
  } else {
    //양수인 경우
    temp = Number(temp.join(''));

    if (temp > 1000000) return 0;
    else return temp;
  }
}

console.log(solution(120));
console.log(solution(-587));
console.log(solution(1000002));
console.log(solution(-1000002));