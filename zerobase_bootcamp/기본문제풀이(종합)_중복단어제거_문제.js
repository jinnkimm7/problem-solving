/* 5. 중복 단어 제거 */

/* user code */
function answer(arr) {
  let new_arr = [];

  new Set(arr).forEach(function (item) {
    new_arr.push(item);
  })

  // new_arr = Array.from(new Set(arr));

  return new_arr;
}

/* main code */
let input = [
  // TC: 1
  ["john", "alice", "alice"],
  // TC: 2
  ["Hello", "hello", "HELLO", "hello"],
  // TC: 3
  ["kiwi", "banana", "mango", "kiwi", "banana"],
];

for (let i = 0; i < input.length; i++) {
  process.stdout.write(`#${i + 1} `);
  console.log(answer(input[i]));
}


// set


// from
// Array.from() 메서드는 유사 배열 객체나 반복 가능한 객체(iterable object)를 얕게 복사해 새로운 Array를 만든다.
// console.log(Array.from('foo'));
// expected output: Array ["f", "o", "o"]

// console.log(Array.from([1, 2, 3], x => x + x));
// expected output: Array [2, 4, 6]

