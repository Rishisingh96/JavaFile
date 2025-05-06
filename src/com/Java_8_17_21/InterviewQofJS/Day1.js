const users = [
  { name: "Alice", age: 17 },
  { name: "Bob", age: 20 },
  { name: "Charlie", age: 22 },
  { name: "David", age: 19 },
  { name: "Eve", age: 18 },
  { name: "Frank", age: 21 },
  { name: "Grace", age: 23 },
  { name: "Heidi", age: 24 },
  { name: "Ivan", age: 25 },
  { name: "Judy", age: 26 },
  { name: "Mallory", age: 27 },
  { name: "Niaj", age: 28 },
  { name: "Oscar", age: 29 },
  { name: "Peggy", age: 30 },
  { name: "Sybil", age: 31 },
  { name: "Trent", age: 32 },
];

console.log("1. Using filter + map + forEach:");
users
  .filter((user) => user.age > 18 && user.age < 30)
  .map((user) => user.name)
  .forEach((name) => console.log(name));

console.log("\n2. Using traditional for loop:");
for (let i = 0; i < users.length; i++) {
  if (users[i].age > 18 && users[i].age < 30) {
    console.log(users[i].name);
  }
}

console.log("\n3. Using forEach:");
users.forEach((user) => {
  if (user.age > 18 && user.age < 30) {
    console.log(user.name);
  }
});

console.log("\n4. Using reduce:");
const filteredNames = users.reduce((acc, user) => {
  if (user.age > 18 && user.age < 30) {
    acc.push(user.name);
  }
  return acc;
}, []);
filteredNames.forEach(name => console.log(name));

console.log("\n5. Using for...of loop:");
for (const user of users) {
  if (user.age > 18 && user.age < 30) {
    console.log(user.name);
  }
}
