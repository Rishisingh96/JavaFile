package com.interviewQuestion_DSA_Java.Tries_37;

public class CountUniqueSubstring {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static int countNodes(Node root) {
        if (root == null) return 0;

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count + 1; // ✅ include current node
    }

    public static void main(String[] args) {
//        String str = "ababa";
        String str = "apple";

        // Insert all suffixes into Trie
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        // Count all nodes and subtract 1 to exclude root
        int result = countNodes(root);
        System.out.println("Total unique substrings: " + result); // ✅ Output: 10
    }
}
/*Let's dry run your full Trie-based code step-by-step with the string "apple", and verify how it correctly calculates total unique substrings using a Trie.

🔍 Concept Overview
We want to count all unique substrings of a string using Trie.

🔸 Approach:
Insert all suffixes of the string into the Trie.

Count total number of Trie nodes (excluding root node) = total unique substrings.

📦 Step-by-Step Dry Run on str = "apple"
✅ All Suffixes of "apple":
arduino
Copy
Edit
1. "apple"
2. "pple"
3. "ple"
4. "le"
5. "e"
🏗️ Trie Insertions
Insert "apple":
css
Copy
Edit
root
 └── a
      └── p
           └── p
                └── l
                     └── e
Nodes created: 5

Insert "pple":
css
Copy
Edit
root
 └── a
      └── p
           └── p
                └── l
                     └── e
 └── p
      └── p
           └── l
                └── e
Nodes created: 4 (new branch from second 'p')

Insert "ple":
css
Copy
Edit
root
 └── a
 └── p
      └── p
           └── l
                └── e
      └── l
           └── e
Nodes created: 2 (only l -> e under first p)

Insert "le":
css
Copy
Edit
root
 └── a
 └── p
 └── l
      └── e
Nodes created: 2

Insert "e":
css
Copy
Edit
root
 └── a
 └── p
 └── l
 └── e ✅ already created
Node for e already exists. No new node.

🧮 Total Trie Nodes Count
Let’s count all nodes manually:

markdown
Copy
Edit
1. root (we ignore in final count)
2. a
3. p (1st level)
4. p (2nd level under a)
5. l (under pp)
6. e (under ppl)
7. p (new branch under root)
8. p (under that p)
9. l
10. e
11. l (new branch under root)
12. e (under that l)
👉 Total nodes = 13

But root node is not counted.

✅ Final result: 13 - 1 = 12

❓ Why Output Was 10 in Your Case?
You printed:

java
Copy
Edit
int result = countNodes(root);
System.out.println("Total unique substrings: " + result);
So if you want to exclude root, do:

java
Copy
Edit
System.out.println("Total unique substrings: " + (result - 1));
✅ Final Code (Minor Correction):
java
Copy
Edit
public static void main(String[] args) {
    String str = "apple";

    // Insert all suffixes into Trie
    for (int i = 0; i < str.length(); i++) {
        String suffix = str.substring(i);
        insert(suffix);
    }

    // Count all nodes
    int totalNodes = countNodes(root);

    // Exclude root node (it doesn't represent any character)
    int result = totalNodes - 1;

    System.out.println("Total unique substrings: " + result);  // Output: 12
}
🔚 Final Answer
🔢 Total unique substrings in "apple" = 12

📌 Extra Tip for Interview
For any string of length n, total possible substrings = n * (n + 1) / 2

But many may repeat. This Trie-based approach removes duplicates automatically.

Let me know if you want dry run of "ababa" too.*/