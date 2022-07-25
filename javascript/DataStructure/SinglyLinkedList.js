// What is a linked list?
// A data structure that contains a head, tail and length property.
// Linked Lists consist of nodes, and each node has a value 
// and a pointer to another node or null.
// There is no index.

// Linked List vs Array
// Linked List
// 1. Do not have indexes!
// 2. Connected via nodes with a next pointer
// 3. Random access is not allowed
// Array
// 1. Indexed in order!
// 2. Insertion and deletion can be expensive
// 3. Can quickly be accessed at a specific index

class Node {
  constructor(val) {
    this.val = val;
    this.next = null;
  }
}

// const first = new Node('Hi');
// first.next = new Node('there');
// first.next.next = new Node('how');
// first.next.next.next = new Node('are');
// first.next.next.next.next = new Node('you');

// console.log(first);

class SinglyLinkedList {
  constructor() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  push(val) {
    const newNode = new Node(val);
    if (!this.head) {
      this.head = newNode;
      this.tail = this.head;
    } else {
      this.tail.next = newNode;
      this.tail = newNode;
    }
    this.length++;
    return this;
  }
}

const list = new SinglyLinkedList();
